package com.lt.ecommerce.services;
import com.lt.ecommerce.models.Shop;
import java.util.Scanner;

public class ShopService {
    static final Scanner scanner = new Scanner(System.in);
    private final Shop shop = new Shop();

    public void createShop() {

        System.out.println("Enter shop id:");
        shop.setId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter owner id:");
        shop.setOwnerId(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter shop name:");
        shop.setName(scanner.nextLine());

        System.out.println("Enter shop address:");
        shop.setAddress(scanner.nextLine());

        System.out.println("Enter shop contact number:");
        shop.setContactNo(Integer.parseInt(scanner.nextLine()));

        System.out.println("Enter shop licence number:");
        shop.setName(scanner.nextLine());

        System.out.println("shop = " + shop);
    }
}
