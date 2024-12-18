import com.lt.ecommerce.services.OrderService;
import com.lt.ecommerce.services.ProductService;
import com.lt.ecommerce.services.ShopService;
import com.lt.ecommerce.services.UserService;
import com.lt.ecommerce.utils.UserInput;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("--------Ecommerce--------");
            System.out.println("Please choose the option");
            System.out.println("1 Create customer");
            System.out.println("2 Create seller");
            System.out.println("3 Create delivery agent");
            System.out.println("4 Create shop");
            System.out.println("5 Create product");
            System.out.println("6 Create order");
            System.out.println("9 Exit");
            option = Integer.parseInt(scanner.nextLine());

            UserService userService = new UserService();
            ProductService productService = new ProductService();
            ShopService shopService = new ShopService();
            OrderService orderService = new OrderService();

            switch (option) {
                case 1: {
                    userService.createUser(UserInput.CUSTOMER.value);
                    break;
                }
                case 2: {
                    userService.createUser(UserInput.SELLER.value);
                    break;
                }
                case 3: {
                    userService.createUser(UserInput.DELIVERY_AGENT.value);
                    break;
                }
                case 4: {
                    shopService.createShop();
                    break;
                }
                case 5: {
                    productService.createProduct();
                    break;
                }
                case 6: {
                    orderService.createOrder();
                    break;
                }
            }

        } while(option != 9);
    }
}
