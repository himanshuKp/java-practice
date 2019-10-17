package arrays;

//buggy
//For example, for 54 rides over the course of 26 days, the method should return the following text:
//You should get the 30-day Unlimited option at $2.35 per ride.
//For 12 rides over the course of 5 days, the method should return:
//You should get the Pay-per-ride option at $2.75 per ride.


class TransitCalculator{
	  
	  //instance fields
	  int days;
	  int rides;
	  
	  String[] rideOption = {"Pay-per-ride","7-day Unlimited Rides","30-day Unlimited Rides"};
	  
	  //fair options
	  double payPerRide = 2.75;
	  double sevenDayUR = 33.00;
	  double thirtyDayUR = 127.00;
	  
	  public TransitCalculator(int numberOfDays,int numberOfRides){
	    days = numberOfDays;
	    rides = numberOfRides;
	  }
	  
	  public double unlimited7Price(){
	    double noOfWeeks = days%7;
	    double totalCost = noOfWeeks*sevenDayUR;
	    return totalCost/rides;
	  }
	  
	  public double[] getRidePrices(){
	  	double prices[] = {payPerRide,unlimited7Price(),thirtyDayUR/rides};
	    return prices;
	  }
	  
	  public String getBestFare(){
	    double[] bestRide = getRidePrices();
			int winningIndex = 0;
	    for(int i=0;i<bestRide.length;i++){
	      if(bestRide[i]<bestRide[winningIndex]){
	        winningIndex=i;
	      }
	    }
	    return "You should get the "+rideOption[winningIndex]+" at "+bestRide[winningIndex]+" per ride.";
	  }
	  
	  public static void main(String[] args){
	    int myRides = 54;
	    int myDays = 26;
	    TransitCalculator tc = new TransitCalculator(myRides, myDays);
	    System.out.println(tc.getBestFare());
	  }  
	}