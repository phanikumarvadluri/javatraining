package org.example.SetterDependency;

public class Database {

    public void connect()
    {
        System.out.println("Connecting to database......");
    }

    public void disConnect()
    {
        System.out.println("Disconnecting to database......");
    }
}
