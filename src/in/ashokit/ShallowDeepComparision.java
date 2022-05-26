package in.ashokit;

public class ShallowDeepComparision {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setId(90);
		s1.setName("jhon");
		
		s2.setId(90);
		s2.setName("jhons");
		
		if(s1==s2) {
			System.out.println("Shallow");
		}else {
			System.out.println("not shallow : "+ s1.hashCode()+" : "+ s2.hashCode());
		}
		
		if(s1.equals(s2)) {
			System.out.println("deep");
		}
	}
}
