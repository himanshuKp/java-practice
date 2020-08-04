package org.himanshu.cars;

import org.himanshu.interfaces.Car;
import org.himanshu.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("corolla")
public class Corolla implements Car {

	@Autowired
	@Qualifier("v8")
	Engine engine;
	
	@Override
	public String specs() {
		return "Sedan from corolla with " +engine.type();
	}

}
