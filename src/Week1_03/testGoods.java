package Week1_03;
import java.util.ArrayList;
import java.util.Scanner;
public class testGoods {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Goods> g= new ArrayList<>();
		int total=0;
		for(;;) {
			String goods=kb.next();
			if(goods.equals("*")) {
				break;
			}else {
				int quatity=kb.nextInt();
				int s=0;
				for(int j=0;j<g.size();j++) {
					if(goods.equals(g.get(j).name)) {
						s=1;
						g.get(j).quatity=g.get(j).quatity+quatity;
					}
				}if(s!=1) {
					Goods G=new Goods(goods,quatity);
					g.add(G);
				}
			}
		}for(int i=0;i<g.size();i++) {
			System.out.println(g.get(i));
			total=total+g.get(i).quatity;
		}System.out.println("Total "+total+" pieces");
	}

}
