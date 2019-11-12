package com.himanshu.interfaces;

public class Main {

  public static void main(String[] args) {
    ITelephone himPhone = new DeskPhone(123456);
    himPhone.powerOn();
    himPhone.callPhone(123456);
    himPhone.answer();
    
    himPhone = new MobilePhone(254675);
    himPhone.powerOn();
    himPhone.callPhone(254675);
    himPhone.answer();
  }

}
