package sec04.ex05;

public class MyMap <K, V>{
	private K key;
	private V value;
	
	
	public void   put(K key, V value){
		this.key = key ;
		this.value = value;
		
	}
	
	public V  get(K key){
		return value;
	}
	
}
