package com.himanshu.challenge.Printer;

public class Printer {
  private int tonerLevel = 100;
  private int numberOfPagePrinted;
  private int tonerRefilled;
  private boolean isDuplex;
  
  public Printer(int tonerLevel, boolean isDuplex) {
    if(this.tonerLevel<0 && this.tonerLevel>100) {
      this.tonerLevel = tonerLevel;
    }
    this.numberOfPagePrinted = 0;
    this.isDuplex = isDuplex;
  }
  
  public void printerWorking(int pagesToPrint) {
    printing(pagesToPrint);
  }
  
  private int addToner(int tonerAmount) {
    if(tonerAmount >= 0 && tonerAmount <= 100) {
      if(this.tonerLevel + tonerAmount > 100) {
        return -1;
      }
      this.tonerLevel += tonerAmount;
      return this.tonerLevel;
    }else {
      return -1;
    }
  }
  
  private void printerToner() {
    if(this.isDuplex) {
      this.numberOfPagePrinted = this.numberOfPagePrinted/2 + this.numberOfPagePrinted%2;
    }
    System.out.println("It is printing. Total number of page printed = " +this.numberOfPagePrinted);
    System.out.println("Toner level remaining: " +this.tonerLevel);
    System.out.println("Total number of times toner refilled = " +this.tonerRefilled);
  }

  private void printing(int pageToPrint) {
    while(pageToPrint!=0) {
      if(this.tonerLevel==0) {
        addToner(100);
        tonerRefilled++;
      }
      this.tonerLevel--;
      this.numberOfPagePrinted++;
      pageToPrint--;
    }
    printerToner();
  }
  
}
