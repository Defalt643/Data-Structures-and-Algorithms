
import java.util.*;
public class TesterMK_II {

	public static void main(String[] args) {
		Stack<Log> s1 = new Stack<Log>();
		Stack<Log> s2 = new Stack<Log>();
		Scanner kb = new Scanner(System.in);

		String order = kb.next();
		while (!order.equals("close")) {
			if (order.equals("open")) {
				s1.push(new Log());
				System.out.println(s1.peek());
			} else if (order.equals("input")) {
				String web = kb.next();
				s1.push(new Log(web));
				System.out.println(s1.peek());
				Log.page++;
				s2.clear();
			} else if (order.equals("back")) {
				if (Log.page != 0) {
					s2.push(s1.pop());
					System.out.println(s1.peek());
					Log.page--;
				} else {
					System.out.println(s1.peek());
				}
			} else if (order.equals("forward")) {
				if (Log.page < s1.size() && !s2.isEmpty()) {
					s1.push(s2.pop());
					System.out.println(s1.peek());
					Log.page++;
				} else {
					System.out.println(s1.peek());
				}
			}
			order = kb.next();
		}


	}

}
