package com.himanshu.boxing;

import java.util.ArrayList;

public class Main {
  
  public static void main(String[] args) {
//    ArrayList<IntValue> myIntValue = new ArrayList<IntValue>();
//    myIntValue.add(new IntValue(10));  
//    
    /*
     * for(int count=0;count<myIntValue.size();count++) { IntValue myInt =
     * myIntValue.get(count); System.out.println(myInt.getValue()); }
     */
    
    ArrayList<Integer> myIntBoxingArrayList = new ArrayList<Integer>();
    for(int count=0;count<myIntBoxingArrayList.size();count++) {
      myIntBoxingArrayList.add(Integer.valueOf(count));   //autoboxing
    }
    
    for(int count=0;count<myIntBoxingArrayList.size();count++) {
      System.out.println(count+" --> "+myIntBoxingArrayList.get(count).intValue());   //unboxing
    }
    
  }

}
