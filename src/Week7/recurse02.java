package Week7;

import java.util.Scanner;

public class recurse02 {

	public static int count7(long n) {
		if(n == 0)
			return 0;
		if(n % 10 == 7)
			return 1+count7(n/10);
		return count7(n/10);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		long num = kb.nextLong();
		int count = count7(num);
		System.out.println("Count = " + count);

	}
}