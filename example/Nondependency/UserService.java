package org.example.Nondependency;

public class UserService {

    private Database database;
    public UserService()
    {
        this.database=new Database();
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
