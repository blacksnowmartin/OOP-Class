import java.util.ArrayList;

// Abstract class representing a User of the system
abstract class User {
    private String name;
    private String contactInfo;
    private String username;
    private String password;

    public User(String name, String contactInfo, String username, String password) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.username = username;
        this.password = password;
    }

    public abstract void authenticate(String username, String password);

    public void updateContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }

    // Getters and setters for user attributes
}

// Item class representing a generic item that can be purchased
class Item {
    private String name;
    private double price;
    private String category;

    public Item(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public void displayItemDetails() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
    }

    // Getters and setters for item attributes
}

// Customer class representing a customer, inherits from User class
class Customer extends User {
    private ArrayList<Item> shoppingCart;

    public Customer(String name, String contactInfo, String username, String password) {
        super(name, contactInfo, username, password);
        this.shoppingCart = new ArrayList<>();
    }

    @Override
    public void authenticate(String username, String password) {
        // Authentication logic for customers
    }

    public void addToCart(Item item) {
        shoppingCart.add(item);
    }

    public void viewCart() {
        for (Item item : shoppingCart) {
            item.displayItemDetails();
        }
    }

    public void purchase() {
        // Purchase logic for customers
    }

    // Additional methods specific to customers
}

// PremiumCustomer class representing a premium customer, inherits from Customer class
class PremiumCustomer extends Customer {
    public PremiumCustomer(String name, String contactInfo, String username, String password) {
        super(name, contactInfo, username, password);
    }

    @Override
    public void purchase() {
        // Override purchase method for premium customers
    }

    // Additional methods specific to premium customers
}

// Administrator class representing an administrator, inherits from User class
class Administrator extends User {
    public Administrator(String name, String contactInfo, String username, String password) {
        super(name, contactInfo, username, password);
    }

    @Override
    public void authenticate(String username, String password) {
        // Authentication logic for administrators
    }

    // Additional methods specific to administrators
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Example usage
        Customer customer = new Customer("John Doe", "john@example.com", "johndoe", "password");
        Item item1 = new Item("Product 1", 19.99, "Electronics");
        Item item2 = new Item("Product 2", 29.99, "Clothing");

        customer.addToCart(item1);
        customer.addToCart(item2);
        customer.viewCart();
    }
}
