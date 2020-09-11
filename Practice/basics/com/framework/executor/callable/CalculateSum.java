package com.framework.executor.callable;

import java.util.concurrent.Callable;

public class CalculateSum implements Callable<Integer> {

	int num;
	
	public CalculateSum(int num) {
		this.num = num;
	}

	@Override
	public Integer call() throws Exception {
		
		System.out.println(Thread.currentThread().getName()+" "
				+ "is calculating the sum upto numbers "+num);
		int sum = 0;		
		for (int i = 0; i < num; i++) {
			sum += i;
		}		
		return sum;
	}
	
}
