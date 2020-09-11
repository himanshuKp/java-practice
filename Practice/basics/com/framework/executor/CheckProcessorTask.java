package com.framework.executor;

public class CheckProcessorTask implements Runnable {

	String name;
		
	public CheckProcessorTask(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+ " check processor has began processing"
				+ " the check "+Thread.currentThread().getName());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(name+" check processor has completed "
				+ "processing the check "+Thread.currentThread().getName());
	}

}
