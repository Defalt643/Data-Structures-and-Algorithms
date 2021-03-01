package Week11;
import java.util.*;
public class FileTransfer {
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int number_of_computers=kb.nextInt(),number_of_lan_cable=kb.nextInt(),number_of_questions=kb.nextInt();
		Graph g = new Graph(number_of_computers);
		for(int i=0;i<number_of_lan_cable;i++) {
			g.addEdge(kb.nextInt(), kb.nextInt());
		}ArrayList<String> found = new ArrayList<>(number_of_questions);
		for(int i=0;i<number_of_questions;i++) {
			DepthFirstPaths dfp =new DepthFirstPaths(g,kb.nextInt());
			if(dfp.hasPathTo(kb.nextInt())) {
				found.add("Yes");
			}else {
				found.add("No");
			}
		}for(int i=0;i<found.size();i++) {
			System.out.println(found.get(i));
		}
	}

}
