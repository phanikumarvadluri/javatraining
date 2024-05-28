package org.example.dependencyinjection;

import org.example.Logger;

public class Application {

    public static void main(String[] args) {
        Database database=new Database();
        UserService userService=new UserService(database);
        UserController userController=new UserController(userService);
        userController.performUserController();
    }
}
