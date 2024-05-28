package org.example;

public class Main {

    public static void main(String[] args) {
        Logger logger=new Logger();
        UserService userService=new UserService(logger);
        //userService.log();
    }
}
