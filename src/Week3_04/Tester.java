package Week3_04;

import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Stack<Character> s= new Stack<Character>();
		String text=kb.next();
		for(int i=0;i<text.length();i++) {
			if(text.charAt(i)=='(' || text.charAt(i)==')' || text.charAt(i)=='{' || text.charAt(i)=='}' || text.charAt(i)=='[' || text.charAt(i)==']') {
				s.push(text.charAt(i));
			}
		}System.out.println(s);
		char open = 0;
		int po=0;
		for(int i=0;i<s.size();i++) {
			if(s.get(i)=='['|| s.get(i)=='{'|| s.get(i)=='(') {
				open=s.get(i);
				po=i;
			}else {
				if(open=='[' && s.get(i)==']') {
					s.remove(i);s.remove(po);
				}else if(open=='{' && s.get(i)=='}'){
					s.remove(i);s.remove(po);
				}else if(open=='(' && s.get(i)==')'){
					s.remove(i);s.remove(po);
				}
			}
		}if(s.size()==0) {
			System.out.println("complete");
		}else {
			System.out.println("incomplete");
		}System.out.println(s);

	}

}
