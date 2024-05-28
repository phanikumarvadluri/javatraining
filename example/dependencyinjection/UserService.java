package org.example.dependencyinjection;


public class UserService {

    private Database database;
    public UserService(Database database)
    {
        this.database=database;
    }

    public void performService()
    {

        database.connect();

        System.out.println("performing some database operations");

        database.disConnect();

    }

    /*
    Tightly coupling

    Harder to Test

    Limited Flixiblitiy


    *
    * */
}
