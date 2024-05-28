package org.example.SetterDependency;

public class Application {

    public static void main(String[] args) {
        Database database=new Database();
        UserService userService=new UserService();
        userService.setDatabase(database);
        UserController userController=new UserController();
        userController.setUserService(userService);
        userController.performUserController();
    }
}
