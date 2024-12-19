class Product {

    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

class Shopper {
    private String name;

    public Shopper(String name) {
        this.name = name;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}

class Order {

    private Product product;
    private Shopper shopper;

    public Order(Product product, Shopper shopper) {
        this.product = product;
        this.shopper = shopper;
    }

    public Product getProduct() { return product; }
    public void setProduct(Product product) { this.product = product; }

    public Shopper getShopper() { return shopper; }
    public void setShopper(Shopper shopper) { this.shopper = shopper; }

    public void displayOrder() {
        System.out.println(shopper.getName() + " ordered " + product.getName() + " for $" + product.getPrice());
    }
}

public class Main {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop Lenovo", 1299.99);
        Product product2 = new Product("iPhone", 799.69);


        // Create shoppers
        Shopper shopper1 = new Shopper("Altair");
        Shopper shopper2 = new Shopper("Bobus");


        // Create orders
        Order order1 = new Order(product1, shopper1);
        Order order2 = new Order(product2, shopper2);


        // Display order
        order1.displayOrder();
        order2.displayOrder();

        // Comparing product prices
        System.out.println("\nPrice Comparison:");
        if (product1.getPrice() > product2.getPrice()) {
            System.out.println(product1.getName() + " is more expensive than " + product2.getName());
        } else {
            System.out.println(product2.getName() + " is more expensive than " + product1.getName());
        }


        // Compare shopper
        System.out.println("\nShopper Comparison:");
        if (shopper1.getName().equals(shopper2.getName())) {
            System.out.println("Both shoppers have the same name.");
        } else {
            System.out.println(shopper1.getName() + " and " + shopper2.getName() + " are different shoppers.");
        }


        // Compare orders (by product)
        System.out.println("\nOrder Compare:");
        if (order1.getProduct().getName().equals(order2.getProduct().getName())) {
            System.out.println("Both orders are for the same product.");
        } else {
            System.out.println("The orders are for different products.");
        }
    }
}