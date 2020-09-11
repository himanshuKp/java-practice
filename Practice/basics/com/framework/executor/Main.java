package com.framework.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		CheckProcessorTask[] cpt = {new CheckProcessorTask("ATM"),
				new CheckProcessorTask("Bank"),
				new CheckProcessorTask("Mobile"),
				new CheckProcessorTask("Web")};
		
//		create a thread pool using executor framework
		ExecutorService service = Executors.newFixedThreadPool(3);
		
		for (CheckProcessorTask checkProcessorTask : cpt) {
			service.submit(checkProcessorTask);
		}
		
		service.shutdown();
	}

}
