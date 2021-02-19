package Week8;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Binary_Search_Tree {
		public static void main(String[] args) throws IOException {
			BST<String> tree = new BST<>();
			Scanner in = new Scanner(new File("D:\\Work\\BUU YEAR 2 SEMESTER 2\\8862115959 Data Structures and Algorithms\\Other\\test03.txt"));
			long start,stop;
			while (in.hasNext()) {
				tree.insert(in.nextLine());
			}String name = "daisy";
			start = System.nanoTime();
			boolean found = tree.search(name);
			if(found) {
				System.out.println("found");
			}else {
				System.out.println("not found");
			}stop= System.nanoTime();
			System.out.println((stop-start)*1E-9+" secs.");
			
		}
}
