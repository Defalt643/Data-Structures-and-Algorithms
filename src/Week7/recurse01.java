package Week7;
import java.util.Scanner;

public class recurse01 {
	public static int bunny(int rank) {
		if(rank==0) {
			return rank;
		}
		else if (rank % 2 == 1)
			return 2 + bunny(rank - 1);
		return 3 + bunny(rank - 1);
	}

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		int num = kb.nextInt();
		int count = bunny(num);
		System.out.println("There are " + count + " carrots.");

	}
}