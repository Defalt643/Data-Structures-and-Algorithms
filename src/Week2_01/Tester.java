package Week2_01;
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		LinkedList<Pokemon> pokemon=new LinkedList<Pokemon>();
		for(;;) {
			String name=kb.next();
			if(name.contentEquals("*")) {
				break;
			}else {
				String type=kb.next();
				int combat_power=kb.nextInt();
				boolean check=false;
				for(int i=0;i<pokemon.size();i++) {
					if(name.equals(pokemon.get(i).name)) {
						if(combat_power>pokemon.get(i).combat_power) {
							pokemon.set(i,new Pokemon(name,type,combat_power));
							check=true;
						}check=true;
					}
				}if(check==false) {
					pokemon.add(new Pokemon(name,type,combat_power));
				}
			}
		}for(int i=0;i<pokemon.size();i++) {
				System.out.println(pokemon.get(i).toString());
		}
	}

}
