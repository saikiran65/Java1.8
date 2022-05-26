package in.ashokit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Flower {
	
	private Integer price;
	
	public Flower(Integer price) {
		this.price = price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	public Integer getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "Flower [price=" + price + "]";
	}
}

public class SecondHighNumStreams {
	
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(20,88,7,89,9,76,77);
		
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list.get(1));
		
		Flower f2 = new Flower(80);
		Flower f3 = new Flower(60);
		Flower f1  = new Flower(99);
		Flower f4 = new Flower(5);
		
		List<Flower> frList = Arrays.asList(f2,f3,f1,f4);
		
		frList.sort(new Comparator<Flower>() {
			public int compare(Flower f1, Flower f2) {
				return f2.getPrice().compareTo(f1.getPrice());
			}
		});
		
		System.out.println(frList.get(1).getPrice());
		
		//highest 
		Flower flower = frList.stream()
				.sorted(Comparator.comparing(Flower::getPrice).reversed())
				.findFirst().orElseThrow();
		
		System.out.println(flower);
	
	}

}
