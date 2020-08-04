package org.himanshu.main;

import org.himanshu.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

//		Create bean factory
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
