package Week4_01;
import java.util.*;
public class Lift {

	public static void main(String[] args) {
		Queue<String> lift=new LinkedList<>();
		Scanner kb = new Scanner(System.in);
		String type=kb.next();
		while(!type.equals("*")) {
			if(type.equals("enqueue")) {
				lift.add(kb.next());
			}if(type.equals("dequeue")) {
				lift.poll();
			}
			type=kb.next();
		}if(lift.isEmpty()) {
			System.out.println("None");
		}else {
			for(String l:lift) {
				System.out.println(l);
			}
		}

	}

}
