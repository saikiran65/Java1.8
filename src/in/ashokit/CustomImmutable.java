package in.ashokit;

import java.util.Map;

//IVYComputech 1st round
public final class CustomImmutable {
	
	final private int id;
	final private Map<String,String> map;
	
	public CustomImmutable(int id, Map<String,String> map) {
		this.id = id;
		this.map = map;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Map<String, String> getMap(){
		return this.map;
	}
}
