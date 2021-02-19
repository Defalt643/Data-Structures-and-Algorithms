package Week2_02;
import java.util.*;

public class Locomotive {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		LinkedList<Bogies> bogies = new LinkedList<Bogies>();
		int n=kb.nextInt();
		bogies.add(new Bogies("999"));
		int po=0;
		for(int i=0;i<n;i++) {
			String type=kb.next();
			if(type.contentEquals("call")) {
				System.out.println(bogies.get(po).bogie_number);
			}else if(type.equals("head")) {
				po=0;
			}else if(type.equals("next")) {
				if(po<bogies.size()-1) {
					po+=1;
				}
			}else if(type.equals("tail")) {
				po=bogies.size()-1;
			}else if(type.equals("add")) {
				bogies.add(po+1,new Bogies(kb.next()));
			}else if(type.equals("remove")) {
				if(po!=bogies.size()-1) {
					bogies.remove(po+1);
				}
			}else if(type.equals("list")) {
				for(int j=po;j<bogies.size();j++) {
					System.out.print(bogies.get(j).toString());
				}System.out.println();
			}
		}

	}

}
