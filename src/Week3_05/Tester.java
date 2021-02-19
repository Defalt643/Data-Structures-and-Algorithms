package Week3_05;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Stack<String> s = new Stack<String>();
		int po=-1;
		for(;;) {
			String type=kb.next();
			if(type.equals("close")) {
				break;
			}else if(type.equals("back")){
				if(po==0) {
					System.out.println("my homepage");
					po--;
				}else {
					System.out.println(s.get(po-1));
					po--;
				}
			}else if(type.equals("input")) {
				s.push(kb.next());
				po++;
				System.out.println(s.get(po));
			}else  if(type.equals("forward")) {
				if(s.size()<1) {
					System.out.println("my homepage");
				}else {
					System.out.println(s.get(po+1));
				}
			}else if(type.equals("open")) {
				System.out.println("my homepage");
			}
		}
	}

}
