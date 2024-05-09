package com.org.inhertence;

public class MoutainBike extends  Bicycle{
  public  int seatHeight;

  public MoutainBike(int gear,int speed,int seatHeight)
  {
      super(gear,speed);
      this.seatHeight=seatHeight;
  }

  public void setSeatHeight(int newValue)
  {
      seatHeight=newValue;
  }

  public String toString()
  {
      return (super.toString()+"seat height is"+seatHeight);
  }
}
