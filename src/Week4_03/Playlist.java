package Week4_03;
import java.util.*;
public class Playlist {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		Queue<Music> PlayList=new LinkedList<>();
		LinkedList<String> list=new LinkedList<>();
		String type=kb.next();
		while(!type.equals("play")) {
			if(type.equals("add")){
				PlayList.add(new Music(kb.next(),kb.next(),kb.nextInt()));
			}else if(type.equals("del")) {
				PlayList.poll();
			}type=kb.next();
		}int target=kb.nextInt();
		for(;;) {
			if(target<=0) {
				break;
			}
			for(Music m:PlayList) {
				if(target>0) {
					target-=m.duration;
					list.add(m.toString());
				}
				
			}
		}for(String l:list) {
			System.out.println(l);
		}
	}

}
