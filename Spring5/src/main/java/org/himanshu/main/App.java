package org.himanshu.main;

import org.himanshu.cars.Corolla;
import org.himanshu.cars.Swift;
import org.himanshu.interfaces.Car;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {

		Car swift = new Swift();
		Car corolla = new Corolla();

//		System.out.println(swift.specs());
//		System.out.println(corolla.specs());

//		Spring way
//		Create bean factory
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Car myCar = context.getBean("corolla", Car.class);
		System.out.println(myCar.specs());
		context.close();
	}

}
