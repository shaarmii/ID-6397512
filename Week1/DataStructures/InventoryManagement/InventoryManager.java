package Week1.DataStructures;

import java.util.HashMap;

public class InventoryManager {
    private HashMap<String, Product> inventory = new HashMap<>();
    
    public void addProduct(Product product) {
        inventory.put(product.getProductId(), product);
    }
    
    public void updateProduct(String productId, int newQuantity, double newPrice) {
        Product p = inventory.get(productId);
        if (p != null) {
            p.setQuantity(newQuantity);
            p.setPrice(newPrice);
        } else {
            System.out.println("Product not found.");
        }
    }
    
    public void deleteProduct(String productId) {
        inventory.remove(productId);
    }
    
    public void displayAll() {
        for (Product p : inventory.values()) {
            System.out.println(p.getProductId() + " - " + p.getProductName() +
                               " - Qty: " + p.getQuantity() + " - Price: " + p.getPrice());
        }
    }

    
    
}
