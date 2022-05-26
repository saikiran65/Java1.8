package in.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class CustomerComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getId().compareTo(c2.getId());
	}
	
}

class Customer {
	
	private Integer id;
	private String name;
	private Integer amt;
	
	public Customer(Integer id, String name, Integer amt) {
		super();
		this.id = id;
		this.name = name;
		this.amt = amt;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAmt() {
		return amt;
	}
	public void setAmt(Integer amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", amt=" + amt + "]";
	}

}

public class SortArrayList {
	
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Zen","Jack","Peter","Mike");
		
		//conventional process
		//Ascending order
//		Collections.sort(list); 
//		Collections.reverse(list);
		
		//descending order
		//method 1
//		Collections.sort(list); 
//		Collections.reverse(list);
		
		//method2
//		Comparator<Object> reverseOrder = Collections.reverseOrder();
//		Collections.sort(list, reverseOrder);
		
		/*
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		
		//Java8 Stream API
//		list.stream().sorted(Comparator.comparing(s -> s)).forEach(System.out::println);
		
		//---------------- Custom Class objects ---------------------
		
		Customer c1 = new Customer(101,"Peter",99);
		Customer c2 = new Customer(112,"Jack",80);
		Customer c3 = new Customer(91,"Jones",108);
		Customer c4 = new Customer(100,"Mitchell",200);
		
		List<Customer> cList = Arrays.asList(c1,c2,c3,c4);
		
		//conventional process
//		Collections.sort(cList); //cannot be used for custom classes
		
		//method 1
//		Collections.sort(cList, new CustomerComparator());
		
		//using lambdas
//		Collections.sort(cList, (a,b) -> (a.getId()-b.getId()));
		
		/*
		for(Customer c : cList) {
			System.out.println(c);
		}
		*/
		//Java8 Process***********************
		
		//using streams
		
		//a. method reference
//		cList.stream().sorted(Comparator.comparing(Customer::getId)).forEach(System.out::println);
//		cList.stream().sorted(Comparator.comparing(Customer::getId).reversed()).forEach(System.out::println);
		
		//b. comparator
//		cList.stream().sorted(new CustomerComparator().reversed()).forEach(System.out::println);
		
//		cList.stream().sorted((a,b) -> a.getAmt().compareTo(b.getAmt())).forEach(System.out::println);
//		cList.stream().sorted(Comparator.comparing(c -> c.getName())).forEach(System.out::println);
		
	}

}
