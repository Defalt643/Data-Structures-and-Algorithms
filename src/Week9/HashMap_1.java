package Week9;
import java.util.*;
public class HashMap_1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String key = "";
		LinearProbingHashST<String, Integer> L = new LinearProbingHashST<String,Integer>();
		while(!(key.equals("*"))) {
			key=kb.next();
			if(key.equals("*")) {
				break;
			}
			L.put(key, kb.nextInt());
		}key=kb.next();
		if(L.get(key)==null) {
			System.out.println("not found");
		}else {
			System.out.println(L.get(key));
		}	
	}
}
