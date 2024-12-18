package com.lt.ecommerce.services;
import com.lt.ecommerce.models.User;

import java.util.Scanner;

public class UserService {
    User user = new User();

    private final Scanner scanner = new Scanner(System.in);

    public void createUser(int userType) {

        user.setUserType(userType);

        String userByType = this.getUserType();

        System.out.println("Enter "+userByType+" id: ");
        user.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter "+userByType+" first name");
        user.setFirstName(scanner.nextLine());

        System.out.println("Enter "+userByType+" last name");
        user.setLastName(scanner.nextLine());

        System.out.println("Enter "+userByType+" mobile number");
        user.setMobileNo(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter "+userByType+" address");
        user.setAddress(scanner.nextLine());

        this.displayUser();

    }

    private String getUserType() {
        return switch (this.user.getUserType()) {
            case 1 -> "customer";
            case 2 -> "seller";
            case 3 -> "delivery agent";
            default -> "";
        };
    }

    public void displayUser() {
        System.out.println(this.user.getUserType() + " details = " + user);
    }

    public User getUser() {
        return this.user;
    }

}
