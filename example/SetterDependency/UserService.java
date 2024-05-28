package org.example.SetterDependency;


public class UserService {

    private Database database;


    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
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
