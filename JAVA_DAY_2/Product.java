public class Product {
	int ProID;
	String ProName;
	double ProPrice;
	Product(){}
	Product(int id, String name, double price){
		this.ProName=name;
		this.ProPrice=price;
	}
	public void display() {
		System.out.println("Product Details: ");
		System.out.println(ProID);
		System.out.println(ProName);
		System.out.println(ProPrice);
	}
	public void gst() {
		System.out.println("Price after GST: ");
		System.out.println((0.2*ProPrice)+ProPrice);
	}
}
public class Main{
	public static void main(String[] args) {
		Product p1= new Product(21,"Chocolate", 25.75);
		p1.display();
		p1.gst();

	}
}
