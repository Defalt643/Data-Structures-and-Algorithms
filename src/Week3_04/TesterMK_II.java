package Week3_04;
import java.util.*;

public class TesterMK_II {

	public static void main(String[] args) {
		Stack<Bracket> B = new Stack<>();
		Scanner kb = new Scanner(System.in);

		String text = kb.next();
		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == '(' || text.charAt(i) == '{' || text.charAt(i) == '[') {
				B.push(new Bracket(text.charAt(i)));
			} else if (text.charAt(i) == ')' || text.charAt(i) == '}' || text.charAt(i) == ']') {
				if (text.charAt(i) == ')') {
					if (!B.isEmpty()) {
						if (B.peek().getBracket() == '(') {
							B.pop();

						} else {
							B.push(new Bracket(text.charAt(i)));
						}
					} else {
						B.push(new Bracket(text.charAt(i)));
					}
				} else if (text.charAt(i) == '}') {
					if (!B.isEmpty()) {
						if (B.peek().getBracket() == '{') {
							B.pop();
						} else {
							B.push(new Bracket(text.charAt(i)));
						}
					} else {
						B.push(new Bracket(text.charAt(i)));
					}
				} else if (text.charAt(i) == ']') {
					if (!B.isEmpty()) {
						if (B.peek().getBracket() == '[') {
							B.pop();
						} else {
							B.push(new Bracket(text.charAt(i)));
						}
					} else {
						B.push(new Bracket(text.charAt(i)));
					}
				}
			}
		}
		if (B.isEmpty()) {
			System.out.println("complete");
		} else {
			System.out.println("incomplete");
		}

	}

}
