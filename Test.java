
public class Test {
	
	public static void testCosShopping() {
		ShoppingCart cart = new ShoppingCart();
		
		cart.addProduct(new Product("Laptop",2300));
		cart.addProduct(new Product("Phone",600));
		cart.addProduct(new Product("Mouse",25.60));
	
	 System.out.println("Total prices: " + cart.calculateTotal());
	}
	public static void main(String[] args) {
		testCosShopping();

	}

}
