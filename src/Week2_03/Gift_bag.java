package Week2_03;

public class Gift_bag {
	String name;
	int quantity;
	public Gift_bag(String name,int quantity) {
		this.name=name;
		this.quantity=quantity;
	}public String toString() {
		return name+" "+quantity+" ";
	}public void updateQuantity(int quantity) {
		this.quantity+=quantity;
	}
}
