package part3;

import java.util.*;

public class Inventory_management {
    public static int productIdCounter = 0;
    public static HashMap<Integer, Product> productData = new HashMap<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        do {
            System.out.println("1. Add Product\n2. Update Product\n3. Delete Product\n4. Search Product\n5. Sort Products\n6. Filter Products\n7. Exit");
            choice = sc.next().charAt(0);
            switch (choice) {
                case '1':
                    addProduct();
                    break;
                case '2':
                    updateProduct();
                    break;
                case '3':
                    deleteProduct();
                    break;
                case '4':
                    searchProduct();
                    break;
                case '5':
                    sortProducts();
                    break;
                case '6':
                    filterProducts();
                    break;
                case '7':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Enter a correct option!");
            }
        } while (choice != '7');
    }

    public static void addProduct() {
        sc.nextLine(); // clear buffer
        System.out.println("Product name: ");
        String name = sc.nextLine();
        System.out.println("Category: ");
        String category = sc.nextLine();
        System.out.println("Quantity: ");
        int quantity = sc.nextInt();
        System.out.println("Price: ");
        double price = sc.nextDouble();

        Product newProduct = new Product(++productIdCounter, name, category, quantity, price);
        productData.put(productIdCounter, newProduct);
        System.out.println("Product added successfully.");
    }

    public static void updateProduct() {
        System.out.println("Enter Product ID to update: ");
        int id = sc.nextInt();
        if (productData.containsKey(id)) {
            sc.nextLine(); // clear buffer
            System.out.println("Enter new Product name: ");
            String name = sc.nextLine();
            System.out.println("Enter new Category: ");
            String category = sc.nextLine();
            System.out.println("Enter new Quantity: ");
            int quantity = sc.nextInt();
            System.out.println("Enter new Price: ");
            double price = sc.nextDouble();

            Product updatedProduct = new Product(id, name, category, quantity, price);
            productData.put(id, updatedProduct);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    public static void deleteProduct() {
        System.out.println("Enter Product ID to delete: ");
        int id = sc.nextInt();
        if (productData.remove(id) != null) {
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product ID not found.");
        }
    }

    public static void searchProduct() {
        System.out.println("Enter Product ID to search: ");
        int id = sc.nextInt();
        Product product = Searching.linearSearch(productData.values().toArray(new Product[0]), id);
        if (product != null) {
            System.out.println(product);
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void sortProducts() {
        Product[] products = productData.values().toArray(new Product[0]);
        Sorting.mergeSort(products);
        System.out.println("Sorted Products:");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    // New filterProducts method
    public static void filterProducts() {
        System.out.println("Choose filter criteria: ");
        System.out.println("1. Filter by Category");
        System.out.println("2. Filter by Price Range");
        System.out.println("3. Filter by Quantity");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                sc.nextLine(); // clear buffer
                System.out.println("Enter category to filter: ");
                String category = sc.nextLine();
                filterByCategory(category);
                break;
            case 2:
                System.out.println("Enter minimum price: ");
                double minPrice = sc.nextDouble();
                System.out.println("Enter maximum price: ");
                double maxPrice = sc.nextDouble();
                filterByPriceRange(minPrice, maxPrice);
                break;
            case 3:
                System.out.println("Enter minimum quantity: ");
                int minQuantity = sc.nextInt();
                filterByQuantity(minQuantity);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void filterByCategory(String category) {
        System.out.println("Products in category: " + category);
        for (Product product : productData.values()) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                System.out.println(product);
            }
        }
    }

    public static void filterByPriceRange(double minPrice, double maxPrice) {
        System.out.println("Products in price range " + minPrice + " - " + maxPrice);
        for (Product product : productData.values()) {
            if (product.getPrice() >= minPrice && product.getPrice() <= maxPrice) {
                System.out.println(product);
            }
        }
    }

    public static void filterByQuantity(int minQuantity) {
        System.out.println("Products with minimum quantity of " + minQuantity);
        for (Product product : productData.values()) {
            if (product.getQuantity() >= minQuantity) {
                System.out.println(product);
            }
        }
    }
}
