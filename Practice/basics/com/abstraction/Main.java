package com.abstraction;

public class Main {

	public static void main(String[] args) {
		ThreeSeries threeSeries = new ThreeSeries();
		threeSeries.accelerate();
		threeSeries.commonFunctionality();
		
		FiveSeries fiveSeries = new FiveSeries();
		fiveSeries.accelerate();
		fiveSeries.commonFunctionality();
	}

}
