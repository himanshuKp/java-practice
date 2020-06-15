package com.generic.boundedtype;

class Data<K,V extends App>{
	private K key;
	private V value;
	
	public Data(K key, V value) {
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public V getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Data [key=" + key + ", value=" + value + "]";
	}
	
	public <E,N extends Number> void display(E element, N number) {
		System.out.println("Element: "+element+" Number: "+number);
	}
	
}

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data<Integer,App> data = new Data<Integer,App>(1,new App());
		data.display("element", 1);
	
		data.getValue().test();
	}
	
	public void test() {
		System.out.println("Test");
	}

}
