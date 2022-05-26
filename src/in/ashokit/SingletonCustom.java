package in.ashokit;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Book implements Cloneable, Serializable{
	
	private static Book book;
	
	private Book() {
		if(book!=null) {
			throw new IllegalStateException("Duplicates via reflection is not allowed");
		}
	}
	
	public static Book getInstance() {
		if(book == null) {
			book = new Book();
		}
		return book;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
//		return super.clone();
		throw new CloneNotSupportedException("Cloning is not allowed");
	}
		
	protected Object readResolve() {
		return book;
	}
	
}

public class SingletonCustom {
	
	public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, IOException, ClassNotFoundException {
		
		//singleton behaviour verification
		/*
		Book b = Book.getInstance();
		Book b2 = Book.getInstance();
		
		System.out.println(b.hashCode()+"\n"+b2.hashCode());
		*/
		
		//cloning singleton object (basic)
		/*
		Book bk = Book.getInstance();
		Book bk2 = (Book) bk.clone();
		
		System.out.println(bk.hashCode()+"\n"+bk2.hashCode());
		*/
		
		//reflection api
		/*
		Constructor<Book> cns = Book.class.getDeclaredConstructor();
		cns.setAccessible(true);
		Book bk8 = (Book) cns.newInstance();
		System.out.println(book9.hashCode()+"\n"+bk8.hashCode());
		*/
		
		//deserialization
		Book bk7 = Book.getInstance();
		File file = new File("abc.txt");
		FileOutputStream fis = new FileOutputStream(file);
		ObjectOutputStream os = new ObjectOutputStream(fis);
		os.writeObject(bk7);
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
		Book bk5 = (Book) ois.readObject();
		
		System.out.println(bk7.hashCode()+"\n"+bk5.hashCode());
		
	}

}
