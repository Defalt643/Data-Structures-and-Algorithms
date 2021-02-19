package Week9;
import java.util.*;
public class HashMap_3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String name= kb.next();
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		while(!name.equals("*")) {
			Object found=h.get(name);
			if(found==null) {
				h.put(name, 1);
			}else {
				h.put(name, h.get(name)+1);
			}name=kb.next();
		}System.out.println(h);
	}
}
