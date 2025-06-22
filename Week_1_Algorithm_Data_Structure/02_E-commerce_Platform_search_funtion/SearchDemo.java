import java.util.Arrays;

public class SearchDemo {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary Search (array must be sorted)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].getProductName().compareToIgnoreCase(targetName);

            if (cmp == 0) {
                return products[mid];
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Smartphone", "Electronics"),
            new Product(103, "Tablet", "Electronics"),
            new Product(104, "Shoes", "Fashion"),
            new Product(105, "Watch", "Accessories")
        };

        // Linear Search
        String searchName = "Tablet";
        Product result = linearSearch(products, searchName);
        if (result != null)
            System.out.println("Linear Search Found: " + result);
        else
            System.out.println("Linear Search: Product not found.");

        // Binary Search (sort first)
        Arrays.sort(products);
        result = binarySearch(products, searchName);
        if (result != null)
            System.out.println("Binary Search Found: " + result);
        else
            System.out.println("Binary Search: Product not found.");
    }
}