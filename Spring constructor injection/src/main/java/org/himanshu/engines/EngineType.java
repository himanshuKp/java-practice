package org.himanshu.engines;

import org.himanshu.interfaces.Engine;

public class EngineType implements Engine {

	String type;
	
	public EngineType() {
		this.type = "unknown";
	}

	public EngineType(String type) {
		this.type = type;
	}

	@Override
	public String type() {
		return type;
	}

}
