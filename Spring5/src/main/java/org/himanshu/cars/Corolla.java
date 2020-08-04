package org.himanshu.cars;

import org.himanshu.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

	@Override
	public String specs() {
		return "Sedan from corolla";
	}

}
