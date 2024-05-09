package com.org.inhertence;
 public class Baseclass {

     private int var;
     public Baseclass()
     {
         System.out.println("base class constructor");
     }

     public Baseclass(int var)
     {
         this.var=var;
         System.out.println("base class parameter constructor");
     }

    public  void m1() {
        System.out.println("m1 base class method");
    }

     public void m2() {
         System.out.println("m2 base class method");
     }

}
