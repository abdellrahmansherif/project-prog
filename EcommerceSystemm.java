package array;
import java.util.Scanner;
public class EcommerceSystemm {
    public static void main(String[] args) {  
    Scanner scanner = new Scanner(System.in);
    
ElectronicProduct a = new ElectronicProduct(1, "smartphone", 599.9f, "Samsung", 1);
ClothingProduct b = new ClothingProduct(2, "T-shirt", 19.99f, "Medium", "Cotton");
BookProduct c = new BookProduct(3, "OOP", 39.99f, "O’Reilly", "X Publications");

        System.out.println("Enter your customer ID:");
        int customerId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your address:");
        String address = scanner.nextLine();
        Customer customer = new Customer(customerId, name, address);
        System.out.println("How many products do you want to order?");
        int nProducts = scanner.nextInt();
        Cart cart = new Cart(customer.getCustomerId(), nProducts);
        double price=0;
        String[] array = new String[nProducts];
        for (int i = 0; i < nProducts; i++) {
         System.out.println("which proudct (1: Smartphone, 2: T-shirt, 3: oop):");
        int  productnumber=scanner.nextInt();
       
        switch (productnumber) {
                case 1: array[i] = "Smartphone, 599.99$";
                 
                    break;
                case 2: array[i] = "T-shirt, 19.99$";
          
                    break;
                case 3: array[i] = "OOP,39.99$";           
                    break;
                default:
                    System.out.println("Invalid product type.");
            }
    
            switch (productnumber) {
                case 1: price+=a.getPrice();
                 
                    break;
                case 2: price+=b.getPrice();
          
                    break;
                case 3:price+=c.getPrice();
                 
                    break;
                default:
                    System.out.println("Invalid product type.");
            }           
        }      
        System.out.println("your total price is "+Math.round(price)+"$"+" USD. would you like to place the order? 1-yes or 2-no?");
        int choice = scanner.nextInt();
        if (choice==1) {         
            Order order = cart.placeOrder();      
            order.printOrderInfo();
            for (int bb=0; bb<nProducts; bb++){                                
            System.out.println(array[bb]);           
            }          
        } else {
            System.out.println("Order not placed, See you late dude");
        }
        System.out.println("Your total price is "+Math.round(price)+"$");
    }
}
