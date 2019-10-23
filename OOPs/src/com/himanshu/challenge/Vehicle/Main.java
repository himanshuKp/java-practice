package com.himanshu.challenge.Vehicle;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BMW bmw = new BMW(36);

		Class c1 = bmw.getClass();
		
		System.out.println(c1);	//get hold of class object created by JVM
		
		System.out.println(c1.getName());  //print type of object using c1
		
		//get all methods declared in the class in an array
		Method m[] = c1.getDeclaredMethods();
		for(Method method:m) {
			System.out.println(method.getName());
		}
		
		//getting all fields in an array
		Field f[] = c1.getDeclaredFields();
		for(Field field:f) {
			System.out.println(field.getName());
		}
		
		//get class loader 
		System.out.println(BMW.class.getClassLoader());
		
		System.out.println(String.class.getClassLoader());
		
		
//		bmw.accelerate(30);
//		bmw.accelerate(36);
//		bmw.accelerate(-56);
//		bmw.changeVelocity(49, 20);
	}

}
