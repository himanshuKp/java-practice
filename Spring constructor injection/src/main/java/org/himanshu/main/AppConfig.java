package org.himanshu.main;

import org.himanshu.cars.Corolla;
import org.himanshu.cars.Swift;
import org.himanshu.engines.EngineType;
import org.himanshu.engines.V6;
import org.himanshu.engines.V8;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.himanshu")
public class AppConfig {

	@Bean("corolla")
	public Corolla corolla() {
		return new Corolla();
	}
	
	@Bean("swift")
	public Swift swift() {
		return new Swift();
	}
	
//	@Bean("v6")
//	public V6 v6() {
//		return new V6();
//	}
//	
//	@Bean("v8")
//	public V8 v8() {
//		return new V8();
//	}
	
	@Bean("engineType")
	public EngineType engineType() {
		return new EngineType("V8 engine");
	}
	
}
