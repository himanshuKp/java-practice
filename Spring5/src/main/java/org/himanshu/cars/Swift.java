package org.himanshu.cars;

import org.himanshu.interfaces.Car;
import org.springframework.stereotype.Component;

@Component("swift")
public class Swift implements Car{

	@Override
	public String specs() {
		return "Hatchback from suzuki";
	}

}
