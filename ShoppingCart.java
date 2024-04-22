import java.util.LinkedList;

public class ShoppingCart {

	private LinkedList< Product> products = new LinkedList<>();

	public void addProduct(Product product) {
		products.add(product);
	}

	public double calculateTotal () {
		double total = 0;
		for(Product product : products) {
			total += product.getPrice();
		}
		return total;
	}
}
