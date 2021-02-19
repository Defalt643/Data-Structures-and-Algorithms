package Week1_01;
import java.text.DecimalFormat;
import java.util.Scanner;
public class testData {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int x=kb.nextInt();
		int type=kb.nextInt();
		String[] data=new String[x];
		if(type==1) {
			for(int i=0;i<x;i++) {
			Data<Integer> d =new Data<Integer>(kb.nextInt(),kb.nextInt());
			data[i]=Integer.toString(d.getFirst()+d.getSecond());
			}
		}else if(type==2) {
			for(int i=0;i<x;i++) {
				Data<Double> d =new Data<Double>(kb.nextDouble(),kb.nextDouble());
				DecimalFormat df = new DecimalFormat("#.#");
				String formatted = df.format(d.getFirst()-d.getSecond()); 
				data[i]=formatted;
				}
		}else if(type==3) {
			for(int i=0;i<x;i++) {
				Data<String> d =new Data<String>(kb.next(),kb.next());
				data[i]=d.getSecond()+d.getFirst();
				}
		}for(int i=0;i<x;i++) {
				System.out.println(data[i]);
			
		}
		
	}

}
