package com.generic.comparable;

class Data<T extends Comparable<T>> implements Comparable<T>{
	private T myVariable;

	public Data(T myVariable) {
		this.myVariable = myVariable;
	}

	public T getMyVariable() {
		return myVariable;
	}

	@Override
	public String toString() {
		return "Data [myVariable=" + myVariable + "]";
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return getMyVariable().compareTo(o);
	}
	
}

public class App {

	public static void main(String[] args) {
		Data<Integer> data = new Data<Integer>(1);
		System.out.println(data.compareTo(1));
	}

}
