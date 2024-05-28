package org.example.Nondependency;

public class Application {

    public static void main(String[] args) {


        UserService userService=new UserService();
        userService.performService();
    }
}
