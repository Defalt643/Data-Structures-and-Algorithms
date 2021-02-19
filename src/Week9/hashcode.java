package Week9;

public class hashcode {

	public static void main(String[] args) {
		String key = "queue";
		System.out.println((key.hashCode() & 0x7FFFFFFF)%9);
		
		
		
//		System.out.println(key.hashCode());
//		System.out.println(key.hashCode() & 0x7FFFFFFF);
//		System.out.println((key.hashCode() & 0x7FFFFFFF)%9);
//		System.out.println(((40 % 9) + 3) % 9);
	}

}
