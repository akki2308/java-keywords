class ShoppingCartSystem {
    // Static variable shared across all products
    private static double discount = 10.0; // Default discount percentage

    // Final variable to ensure Product ID cannot be changed
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to resolve ambiguity
    public ShoppingCartSystem(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to: " + discount + "%");
    }

    // Method to display product details and apply discount
    public void displayProductDetails() {
        if (this instanceof ShoppingCartSystem) { // instanceof check
            double discountedPrice = price - (price * discount / 100);
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Original Price: $" + price);
            System.out.println("Discounted Price: $" + discountedPrice);
            System.out.println("Quantity: " + quantity);
        } else {
            System.out.println("Invalid product object");
        }
    }

    public static void main(String[] args) {
        // Creating product objects
        ShoppingCartSystem product1 = new ShoppingCartSystem(101, "Laptop", 50000, 1);
        ShoppingCartSystem product2 = new ShoppingCartSystem(102, "Smartphone", 20000, 2);

        // Display product details before updating discount
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Update discount percentage
        ShoppingCartSystem.updateDiscount(15.0);

        // Display product details after updating discount
        product1.displayProductDetails();
        product2.displayProductDetails();
    }
}
