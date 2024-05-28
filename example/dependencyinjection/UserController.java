package org.example.dependencyinjection;

public class UserController {

    private UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }


    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void performUserController() {
        userService.performService();
    }
}
