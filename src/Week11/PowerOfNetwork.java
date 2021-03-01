package Week11;
import java.util.*;
public class PowerOfNetwork {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int number_of_lan_cable=kb.nextInt(),number_of_questions=kb.nextInt();
		Graph g = new Graph(number_of_lan_cable);
		for(int i=0;i<number_of_lan_cable;i++) {
			g.addEdge(kb.nextInt(), kb.nextInt());
		}for(int i=0;i<number_of_questions;i++) {
			DepthFirstPaths bfp = new DepthFirstPaths(g,kb.nextInt());
			
		}
		
	}

}
