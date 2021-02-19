package Week2_03;
import java.util.*;
public class Santa_Gift {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		LinkedList<Gift_bag> bag1=new LinkedList<Gift_bag>();
		LinkedList<Gift_bag> bag2=new LinkedList<Gift_bag>();
		int capacity=kb.nextInt();
		int count=0;
		for(;;) {
			count++;
			String name=kb.next();
			if(name.equals("*")) {
				break;
			}else {
				int quantity=kb.nextInt();
				if(count==1) {
					if(quantity<51) {
						bag1.add(new Gift_bag(name,quantity));
					}else {
						bag1.add(new Gift_bag(name,50));
						bag2.add(new Gift_bag(name,quantity-50));
					}
				}else {
					boolean name_check=false;
					int po=0;
					for(int i=0;i<bag1.size();i++) {
						if(name.equals(bag1.get(i).name)) {
							name_check=true;
							po=i;
							break;
						}
					}if(name_check=false) {
						if(quantity<51) {
							bag1.add(new Gift_bag(name,quantity));
						}else {
							bag1.add(new Gift_bag(name,50));
							bag2.add(new Gift_bag(name,quantity-50));
						}
					}else {
						if(quantity+bag1.get(po).quantity<51) {
							bag1.get(po).quantity+=quantity;
						}else {
							int overflow_difference=quantity-50;
							int difference=50-bag1.get(po).quantity;
							bag1.get(po).quantity+=difference;
							boolean name_check2=false;
							for(int j=0;j<bag2.size();j++) {
								if(name.equals(bag2.get(j).name)) {
									name_check2=true;
									bag2.get(j).quantity+=overflow_difference;
								}
							}if(name_check2==false) {
								bag2.add(new Gift_bag(name,overflow_difference));
							}
						}
					}
				}
			}
		}for(int i=0;i<bag1.size();i++) {
			System.out.print(bag1.get(i).toString());
		}System.out.println();
		for(int i=0;i<bag2.size();i++) {
			System.out.print(bag2.get(i).toString());
		}
	}

}
