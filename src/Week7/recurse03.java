package Week7;

import java.util.Scanner;

public class recurse03 {

	public static void daisy ( int   n )
	{
	    if ( n == 0) return;
		System.out.println("Daisy counts the star number " + n);
		oreo(n-1);
	}
	
	public static void oreo ( int n )
	{
		if ( n == 0) return; 
		System.out.println("Oreo counts the star number " + n);
	     daisy(n-1);
	}
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int n = kb.nextInt();
		oreo(n);
	}
}
