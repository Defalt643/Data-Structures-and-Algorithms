package Week1_04;
import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class testFruit {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		ArrayList<Fruit>f=new ArrayList<>();
		DecimalFormat df = new DecimalFormat("#.##");
		df.setMinimumFractionDigits(2);
		double total=0;
		for(;;) {
			String type=kb.next();
			if(type.equals("finish")) {
				break;
			}else if(type.equals("add")) {
				Fruit F=new Fruit(kb.next(),kb.nextDouble());
				f.add(F);
			}else if(type.equals("del")){
				f.remove(kb.nextInt()-1);
			}
		}System.out.println("Number of fruits: "+f.size());
		for(int i=0;i<f.size();i++) {
			total+=f.get(i).weight;
		}
		System.out.println("Total weight: "+df.format(total));
		System.out.println("List of fruits:");
		for(int i=0;i<f.size();i++) {
			System.out.println(f.get(i).name+" "+df.format(f.get(i).weight));
		}
	}

}
