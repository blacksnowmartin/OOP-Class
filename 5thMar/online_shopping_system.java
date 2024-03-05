import java.util.ArrayList;

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
}

// User class representing a generic user of the system
class User {
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

    public void authenticate(String username, String password) {
        // Authentication logic
    }

    public void updateContactInfo(String newContactInfo) {
        this.contactInfo = newContactInfo;
    }
}

// Customer class representing a customer, inherits from User class
class Customer extends User {
    private ArrayList<Item> shoppingCart;

    public Customer(String name, String contactInfo, String username, String password) {
        super(name, contactInfo, username, password);
        this.shoppingCart = new ArrayList<>();
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
        // Purchase logic
    }

    // Method overloading for adding items to cart
    public void addToCart(Item item, int quantity) {
        for (int i = 0; i < quantity; i++) {
            shoppingCart.add(item);
        }
    }

    // Method overloading for adding items to cart with optional parameter
    public void addToCart(Item item, boolean priorityShipping) {
        if (priorityShipping) {
            // Logic for adding item with priority shipping
        } else {
            shoppingCart.add(item);
        }
    }
}

// PremiumCustomer class representing a premium customer, inherits from Customer class
class PremiumCustomer extends Customer {
    public PremiumCustomer(String name, String contactInfo, String username, String password) {
        super(name, contactInfo, username, password);
    }

    public void applyDiscount() {
        // Apply discount logic
    }

    @Override
    public void purchase() {
        // Override purchase method to incorporate discount calculations
        applyDiscount();
        super.purchase();
    }
}

// Administrator class representing an administrator, inherits from User class
class Administrator extends User {
    public Administrator(String name, String contactInfo, String username, String password) {
        super(name, contactInfo, username, password);
    }

    public void addItem(Item item) {
        // Logic for adding new item
    }

    public void updateItem(Item item) {
        // Logic for updating item details
    }

    public void removeItem(Item item) {
        // Logic for removing item
    }
}

public class OnlineShoppingSystem {
    public static void main(String[] args) {
        // Example usage
        Customer customer = new Customer("John Doe", "john@example.com", "johndoe", "password");
        Item item1 = new Item("Product 1", 19.99, "Electronics");
        Item item2 = new Item("Product 2", 29.99, "Clothing");

        customer.addToCart(item1);
        customer.addToCart(item2, 3); // Using method overloading
        customer.viewCart();
    }
}
