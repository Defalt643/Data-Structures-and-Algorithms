
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Queue<String> Q1 = new LinkedList<>();
		Queue<String> Q2 = new LinkedList<>();
		Scanner kb =  new Scanner(System.in);
		String order = kb.next();
		while(!order.equals("#")) {
			if(order.equals("order")) {
				String name = kb.next();
				while(!name.equals("*")) {
					Q1.offer(name);
					name = kb.next();
				}
			}else if(order.equals("1serve")) {
				String n = kb.next();
				for(int i=Q1.size();i>=0;i--) {
					if(n.equals(Q1.peek())){
						Q1.poll();
						break;
					}else {
						Q2.offer(Q1.poll());
					}
				}
			}else if(order.equals("2serve")) {
				Q2.poll();
			}order = kb.next();
		}for(String a:Q2) {
			System.out.println(a.toString());
		}if(!Q1.isEmpty()) {
			for(String b:Q1) {
				System.out.println(b.toString());
			}
		}

	}

}
