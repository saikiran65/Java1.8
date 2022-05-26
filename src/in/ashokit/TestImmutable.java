package in.ashokit;

import java.util.HashMap;

public class TestImmutable {
	
	public static void main(String[] args) {
		
		HashMap<String, String> hashMap = new HashMap<String,String>();
		hashMap.put("test", "country");
		CustomImmutable ci = new CustomImmutable(101,hashMap);
		System.out.println(ci.hashCode());
		
		//here we are adding entry to the map but not modifying 
		//the existing map
//		ci.getMap().put("country1", "test1");
		ci.getMap().entrySet().stream()
			.forEach(System.out::println);
		System.out.println(ci.hashCode());
		
		//to prove the immutability
		String s1 = "abc";
		System.out.println(s1.hashCode());
		s1 = "abcyz";
		System.out.println(s1.hashCode());
		
	}

}
