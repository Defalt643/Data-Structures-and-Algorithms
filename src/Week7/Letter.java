package Week7;
import java.util.*;
public class Letter {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String letter= kb.next();
		ArrayList<Character> Letter = new ArrayList<Character>(); 
		for(int i=0;i<letter.length();i++) {
			Letter.add(letter.charAt(i));
		}for(int i=0;i<Letter.size()-1;i++) {
			if(Letter.get(i)==Letter.get(i+1)) {
				Letter.remove(i);
			}
		}for(int i=0;i<Letter.size();i++) {
			System.out.print(Letter.get(i));
		}
	}
}
