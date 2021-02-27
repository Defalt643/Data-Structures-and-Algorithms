package Week10;
import java.util.*;;
public class OverSort {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int menu=kb.nextInt(),n=kb.nextInt();
		if(menu==1) {
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=kb.nextInt();
			}Arrays.sort(arr);
			for(int i=0;i<n;i++) {
				System.out.printf(arr[i]+" ");
			}System.out.println();
			for(int i=n-1;i>-1;i--) {
				System.out.printf(arr[i]+" ");
			}
			
		}else if(menu==2){
			double arr[] = new double[n];
			for(int i=0;i<n;i++) {
				arr[i]=kb.nextDouble();
			}Arrays.sort(arr);
			for(int i=0;i<n;i++) {
				System.out.printf("%.0f",arr[i]);
				System.out.print(" ");
			}System.out.println();
			for(int i=n-1;i>-1;i--) {
				System.out.printf("%.0f",arr[i]);
				System.out.print(" ");
			}
		}else if(menu==3){
			char arr[] = new char[n];
			for(int i=0;i<n;i++) {
				arr[i]=kb.next().charAt(0);
			}Arrays.sort(arr);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			for(int i=n-1;i>-1;i--) {
				System.out.print(arr[i]+" ");
			}
		}else if(menu==4){
			String arr[] = new String[n];
			for(int i=0;i<n;i++) {
				arr[i]=kb.next();
			}Arrays.sort(arr);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+" ");
			}System.out.println();
			for(int i=n-1;i>-1;i--) {
				System.out.print(arr[i]+" ");
			}
		}

	}

}
