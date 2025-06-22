import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Inventory 
{
    private List<Product> products;

    public Inventory() 
    {
        this.products = new ArrayList<>();
    }

    // Method to add a product
    public void addProduct(Product product) 
    {
        products.add(product);
    }

    // Method to update a product
    public void updateProduct(int productId, String productName, int quantity, double price) 
    {
        boolean found = false;
        for (Product product : products) 
        {
            if (product.getProductId() == productId) 
            {
                product.setProductName(productName);
                product.setQuantity(quantity);
                product.setPrice(price);
                System.out.println("Product with ID : " + productId + " Updated");
                found = true;
                break;
            }
        }
        if (!found)
        {
            System.out.println("Invalid Product ID : " + productId);
        }
    }

    // Method to delete a product
    public boolean deleteProduct(int productId) 
    {
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (product.getProductId() == productId) {
                iterator.remove();
                System.out.println("Product with ID : " + productId + " Removed");
                return true;
            }
        }
        System.out.println("Invalid Product ID : " + productId);
        return false;
    }

    // Method to display all products
    public void displayProducts() 
    {
        for (Product product : products) 
        {
            System.out.println(product);
        }
    }

    // --- Product class added below ---
    static class Product {
        private int productId;
        private String productName;
        private int quantity;
        private double price;

        public Product(int productId, String productName, int quantity, double price) {
            this.productId = productId;
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }

        public int getProductId() {
            return productId;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product ID: " + productId + ", Name: " + productName + ", Quantity: " + quantity + ", Price: " + price;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Inventory inventory = new Inventory();

        int productId;
        String productName;
        int quantity;
        double price;

        // Adding Product
        char makeEntry = 'y';
        while (makeEntry == 'y')
        {
            System.out.println("Enter the Product Details");
            System.out.print("Product ID: ");
            productId = sc.nextInt();
            sc.nextLine(); 
            System.out.print("Product Name: ");
            productName = sc.nextLine();
            System.out.print("Quantity: ");
            quantity = sc.nextInt();
            System.out.print("Price: ");
            price = sc.nextDouble();
            Product p = new Product(productId, productName, quantity, price);
            inventory.addProduct(p);

            System.out.print("Want to add another product [y/n]: ");
            makeEntry = sc.next().charAt(0);
            System.out.println();
        }

        // Displaying products
        System.out.println("Products in inventory:");
        inventory.displayProducts();

        // Updating a product
        System.out.print("Enter Product ID to update: ");
        productId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter new Product Name: ");
        productName = sc.nextLine();
        System.out.print("Enter new Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter new Price: ");
        price = sc.nextDouble();
        inventory.updateProduct(productId, productName, quantity, price);

        // Displaying products after update
        System.out.println("Products in inventory after update:");
        inventory.displayProducts();

        // Deleting a product
        System.out.print("Enter Product ID to delete: ");
        productId = sc.nextInt();
        inventory.deleteProduct(productId);

        // Displaying products after deletion
        System.out.println("Products in inventory after deletion:");
        inventory.displayProducts();
        
        sc.close();
    }
}