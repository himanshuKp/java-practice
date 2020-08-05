package org.himanshu.engines;

import org.himanshu.interfaces.Engine;
import org.springframework.stereotype.Component;

public class V6 implements Engine {

	@Override
	public String type() {
		return "V6 Engine";
	}

}
