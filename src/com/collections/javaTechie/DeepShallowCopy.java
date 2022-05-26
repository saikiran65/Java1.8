package com.collections.javaTechie;

class Size implements Cloneable{
	
	int size;
	
	public Size(int size) {
		super();
		this.size = size;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Size [size=" + size + "]";
	}
	
}

class Apple implements Cloneable{
	
	private Integer id;
	private String origin;
	private Size size;
	
	public Apple(Integer id, String origin, Size size) {
		super();
		this.id = id;
		this.origin = origin;
		this.size = size;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Apple clone = null;
		
		try {
			clone =  (Apple) super.clone();
			clone.setSize((Size) this.size.clone());
			
		}catch(Exception e) {
			throw new RuntimeException(e);
		}
		
		return clone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}
	
	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", origin=" + origin + ", size=" + size + "]";
	}
	
	
}

public class DeepShallowCopy{
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Size s = new Size(10);
		Apple a = new Apple(201,"Himachal Pradesh",s);
		
		Apple b  = (Apple) a.clone();
		a.setId(301);
		s.setSize(11);
		
		System.out.println(a+"\n"+b);
		
	}
	

}
