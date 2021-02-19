package Week1_05;
import java.util.*;
public class testBook {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Book> b=new ArrayList<>();
		int min_po=0;
		for(;;) {
			String type=kb.next();
			if(type.equals("close")) {
				break;
			}else if(type.equals("put")) {
				Book B =new Book(kb.next(),kb.nextInt());
				b.add(B);
			}else if(type.equals("insert")) {
				b.add(kb.nextInt()-1,new Book(kb.next(),kb.nextInt()));
			}else if(type.equals("take")) {
				b.remove(kb.nextInt()-1);
			}
		}int max=Integer.MAX_VALUE;
		for(int i=0;i<b.size();i++) {
			if(b.get(i).published<max){
				min_po=i;
				max=b.get(i).published;
			}
		}
		for(int i=0;i<b.size();i++) {
			System.out.println(b.get(i));
		}System.out.println("The oldest book: "+b.get(min_po));

	}

}
