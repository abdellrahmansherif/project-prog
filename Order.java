package array;

  public class Order {
    private int customerId;
    private int orderId;
    private Product[] products;
    private double totalPrice;

    public Order(int customerId, Product[] products) {
        this.customerId = Math.abs(customerId);
        this.products = products;
        this.totalPrice = calculateTotalPrice();
      
        this.orderId = (int) (Math.random()*130)+1;
    }

  
    private double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            if (product != null) {
                totalPrice += product.getPrice();
            }
        }
        return totalPrice;
    }
    public void printOrderInfo() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customerId);
        System.out.println("Products in the order:");
    }
}

