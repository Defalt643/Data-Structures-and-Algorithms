
import java.util.*;
public class testFruit {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Stack<Fruit> f=new Stack<Fruit>();
		for(;;) {
			String name=kb.next();
			if(name.equals("*")) {
				break;
			}else {
				f.add(new Fruit(name,kb.nextDouble()));
			}
		}for(int i=f.size()-1;i>-1;i--) {
			System.out.println(f.get(i).toString());;
		}

	}

}
