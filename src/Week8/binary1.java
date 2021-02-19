package Week8;
import java.io.*;
import java.util.*;
public class binary1 {
	public static boolean Check(ArrayList<String> l,String name) {
		boolean found = false;
		
		for(String s:l) {
			if(s.equals(name)) {
				found = true;
				break;
			}
		}
		return found;	
	}

	public static void main(String[] args) throws IOException{
		
		ArrayList<String> l =new ArrayList<>();
	
		Scanner in =new Scanner(new File("D:\\Work\\BUU YEAR 2 SEMESTER 2\\8862115959 Data Structures and Algorithms\\Other\\test03.txt"));
		long start,stop;
		while (in.hasNext()) {
			
			String str =in.nextLine();
			if(Check(l,str) == false) {
			l.add(str);
			}
		}
		String name ="daisy";
		
		start = System.nanoTime();
		boolean found = Check(l,name);
		stop= System.nanoTime();
		if(found)
			System.out.println("found");
		else
		    System.out.println("not found");
		
		System.out.println((stop-start)*1E-9+" secs.");

	}

}
