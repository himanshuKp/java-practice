package com.framework.executor.callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

	public static void main(String[] args) {
		
		CalculateSum[] calculateSums = {
				new CalculateSum(10),
				new CalculateSum(20),
				new CalculateSum(30),
				new CalculateSum(40),
				new CalculateSum(50)};
		ExecutorService service = Executors.newFixedThreadPool(3);
		for (CalculateSum calculateSum : calculateSums) {
			Future<Integer> sum = service.submit(calculateSum);
			try {
				System.out.println("Calculated sum "+sum.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		service.shutdown();
		
	}

}
