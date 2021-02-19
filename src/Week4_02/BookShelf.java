package Week4_02;
import java.util.*;
public class BookShelf {

	public static void main(String[] args) {
		Scanner kb =new Scanner(System.in);
		Queue<Integer> BookShelf = new LinkedList<>();
		for(;;) {
			String input =kb.next();
			if(!(input.equals("[")) && !(input.equals("]"))) {
				BookShelf.add(Integer.parseInt(input));
			}else if(input.equals("]")) {
				break;
			}
		}String type=kb.next();
		while(!type.equals("finish")) {
			if(type.equals("enqueue")) {
				BookShelf.add(kb.nextInt());
			}else if(type.equals("dequeue")) {
				BookShelf.poll();
			}
			type=kb.next();
		}Boolean check=false;
		for(Integer i:BookShelf) {
			int count=0;
			for(Integer j :BookShelf) {
				if(i==j) {
					count++;
					if(count>1) {
						check=true;
					}
				}
			}
		}if(check==true) {
			System.out.println("duplicate");
		}else {
			System.out.println("no duplicate");
		}

	}

}
