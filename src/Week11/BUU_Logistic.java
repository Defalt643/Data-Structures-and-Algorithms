package Week11;
import java.util.*;
public class BUU_Logistic {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int number_of_warehouses=kb.nextInt(),number_of_shipping_path=kb.nextInt(),number_of_questions=kb.nextInt();
		Graph g = new Graph(number_of_warehouses*number_of_shipping_path);
		for(int i=0;i<number_of_warehouses-1;i++) {
			g.addEdge(kb.nextInt(), kb.nextInt());
			
		}ArrayList<String> cost=new ArrayList<>();
		for(int i=0;i<number_of_questions;i++) {
			int quantity=kb.nextInt(),origin=kb.nextInt(),destination=kb.nextInt();
			BreadthFirstPaths bfp = new BreadthFirstPaths(g,origin);
			if(bfp.hasPathTo(destination)) {
				cost.add(Integer.toString((bfp.distTo(destination)*125*quantity)));
			}else {
				cost.add("NO SHIPMENT POSSIBLE");
			}
		}for(int i=0;i<cost.size();i++) {
			System.out.println(cost.get(i));
		}
	}

}
