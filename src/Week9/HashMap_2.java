package Week9;
import java.util.*;
public class HashMap_2 {

	public static void main(String[] args) {
		SeparateChainingHashST<Integer, String> s = new SeparateChainingHashST<Integer, String>();
		Scanner kb = new Scanner(System.in);
		int count=0,key=kb.nextInt();
		while(key!=-1) {
			s.put(key, kb.next());
			key=kb.nextInt();
			count++;
		}s.printNode();
	}

}
