package com.himanshu.boxing;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
//    ArrayList<IntValue> myIntValue = new ArrayList<IntValue>();
//    myIntValue.add(new IntValue(10));
//
//    
//     for(int count=0;count<myIntValue.size();count++) { IntValue myInt =
//     myIntValue.get(count); System.out.println(myInt.getValue()); }
     

    ArrayList<Integer> myIntValue = new ArrayList<Integer>();
    for(int count=0;count<10;count++) {
      myIntValue.add(Integer.valueOf(count));   //autoboxing
    }
    
    for(int count=1;count<myIntValue.size();count++) {
      System.out.println(count+" --> "+myIntValue.get(count).intValue());   //unboxing
    }

  }

}
