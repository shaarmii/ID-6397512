package Week1.DataStructures;

public class InventoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InventoryManager manager = new InventoryManager();

        // Add products
        manager.addProduct(new Product("P001", "Mouse", 100, 299.99));
        manager.addProduct(new Product("P002", "Keyboard", 50, 499.49));

        // Update
        manager.updateProduct("P001", 120, 279.99);

        // Delete
        manager.deleteProduct("P002");

        // Display
        manager.displayAll();

	}

}
