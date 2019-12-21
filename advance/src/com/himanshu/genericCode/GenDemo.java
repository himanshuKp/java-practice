package com.himanshu.genericCode;

// custom generic class
class Gen<T>
{
	T ob;
	
	Gen(T ob)
	{
		this.ob = ob;
	}
	
	public void show()
	{
		System.out.println("The type of object is: " +ob.getClass().getName());
	}
	
	public T getOb()
	{
		return ob;
	}
	
}

public class GenDemo {

	public static void main(String[] args) {
		
		Gen<String> name = new Gen<>("Durga");
		name.show();
		System.out.println(name.getOb());
		
		Gen<Integer> name1 = new Gen<>(10);
		name1.show();
		System.out.println(name1.getOb());
		
	}

}
