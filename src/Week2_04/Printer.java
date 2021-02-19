package Week2_04;

import java.util.*;
public class Printer {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		LinkedList<Word> word=new LinkedList<Word>();
		int n=kb.nextInt();
		int po=0;
		for(int i=0;i<n;i++) {
			String type=kb.next();
			if(type.equals("i")) {
				word.add(po,new Word(kb.next()));
				po++;
			}else if(type.equals("r")) {
				if(po<word.size()-1) {
					po++;
				}
			}else if(type.equals("l")) {
				if(po>0) {
					po--;
				}
			}else if(type.equals("b")) {
				word.remove(po);
			}else if(type.equals("d")) {
			if(po<word.size()) {
					word.remove(po);
				}
			}
		}
		for(int i=0;i<word.size();i++) {
			System.out.print(word.get(i).toString());
		}

	}

}
