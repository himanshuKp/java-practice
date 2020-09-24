package com.garbagecollection;

public class GCDemo {

	int objId;
	
	public GCDemo(int objId) {
		this.objId = objId;
		System.out.println("Created "+objId);
	}

	public static void main(String[] args) {
	
		new GCDemo(1);
		new GCDemo(2);		
		for (int i = 0; i < 10; i++) {
			System.gc();
		}
				
	}

//	deprecated since java 9 because
//	1. difficult to program correctly
//	2. they can be run unexpectedly when an object becomes unreachable unexpectedly but correctly
//	3. can easily break superclass/subclass relationship
//	4. no ordering among finalizers
//	5. there is no guarantee about the timeliness of finalization or even that it will run at all
//	6. no explicit registration and deregistration mechanism.
//	7. security: it can be called by attacker to attack the code that hasn't properly defended itself.
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized "+objId);
	}
		
}
