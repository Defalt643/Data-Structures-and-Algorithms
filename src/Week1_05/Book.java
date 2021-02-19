package Week1_05;

public class Book {
	String name;
	int published;
	public Book(String name,int published) {
		this.name=name;
		this.published=published;
	}public String toString() {
		return name+" "+published;
	}
}
