package org.himanshu.cars;

import org.himanshu.interfaces.Car;
import org.himanshu.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Swift implements Car{

//	in this case value of engine type from engine class is used
	@Autowired
	@Qualifier("v6")
	Engine engine;
	
//	if this constructor is enabled, this will replace old value with new value
//	public Swift(Engine engine) {
//		engine.type = "new v8";
//		this.engine = engine;
//	}
	
//	if this method is autowired instead of engine object in line 12, then only this value will override old value 
//	public void setEngine(Engine engine) {
//		engine.type = "new v8";
//		this.engine = engine;
//	}
	
	@Override
	public String specs() {
		String specs = "Engine from swift hatchback with " +engine.type();
		return specs;
	}

}
