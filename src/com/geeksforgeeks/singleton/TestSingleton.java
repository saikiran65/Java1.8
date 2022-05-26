package com.geeksforgeeks.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TestSingleton  {
	
	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, 
					IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		SingletonClass s1 = SingletonClass.getInstance();
		System.out.println(s1.hashCode());
		//clone
		/*
		SingletonClass s2 = (SingletonClass) s1.clone();
		System.out.println(s2.hashCode());
		*/
		// Reflection
		/* 
		SingletonClass reflection = null;
		Constructor<?>[] constructors = SingletonClass.class.getDeclaredConstructors();
		
		for(Constructor<?> constructor : constructors) {
			constructor.setAccessible(true);
			reflection = (SingletonClass) constructor.newInstance();
		}
		
		System.out.println(reflection.hashCode());
		*/
		//serialization
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
		out.writeObject(s1);
		out.close();
		ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
		SingletonClass instance = (SingletonClass) in.readObject();
		in.close();
		System.out.println(instance.hashCode());
	}

}
