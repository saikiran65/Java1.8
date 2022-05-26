package in.ashokit;

class Address implements Cloneable {
	private String city;
	private String state;
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Worker implements Cloneable {
	
	private Integer id;
	private Integer salary;
	private Address address;
	
	public Worker(Integer id, Integer salary, Address address) {
		super();
		this.id = id;
		this.salary = salary;
		this.address = address;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Worker clone = null;
		
		try {
			clone = (Worker) super.clone();
			clone.setAddress((Address) this.address.clone());
		}catch(Exception e) {
			throw new CloneNotSupportedException();
		}
		
		return clone;
	}
	@Override
	public String toString() {
		return "Worker [id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	
}

public class ShallowDeepCopy {
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1 = new Address("jantarmantar","Delhi");
		Worker w1 = new Worker(101,9000,a1);
		
		//basics
		/*
		Worker w2 = w1;
		System.out.println(w1.hashCode()+"\n"+w2.hashCode());
		*/
		
		//cloning
		Worker w2 = (Worker) w1.clone();
		w1.setId(209);
		w1.getAddress().setCity("Mumbai");
		
		System.out.println(w1.hashCode()+"\n"+w2.hashCode());
		System.out.println(w1+"\n"+w2);
		
	}
	
	

}
