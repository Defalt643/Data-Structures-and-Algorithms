package Week10;
import java.util.*;
public class Worthiness {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n=kb.nextInt();
		item arr[]=new item[n];
		for(int i=0;i<n;i++) {
			item I=new item(i,kb.nextInt(),kb.nextInt());
			arr[i]=I;
		}Collections.sort(arr);

	}

}
