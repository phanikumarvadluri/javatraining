package com.org.interfaceexamples;

public class Test {

    private String name;
    private int id;


    public Test(String name,int id)
    {
        this.name=name;
        this.id=id;
    }


    public void setName(String name)
    {
        this.name=name;
    }

    public  void setId(int id)
    {
        this.id=id;
    }

   static String collageName="KU";


    public void m2()
    {
        m1();
    }


    public static void  m1()
    {

    }

    static {
System.out.println("Static iniliation block");
    }

    {
        System.out.println("Non Static iniliation block");
    }

}
