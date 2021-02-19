package Week7;
import java.util.*;

public class Fibonacci_recursive {
	public static long fib(int n) {
		if(n<=1) {
			return n;
		}else {
			return fib(n-2)+fib(n-1);
		}
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
      	int n = kb.nextInt();
      	long start, stop;
      	start = System.nanoTime();
      	System.out.println(fib(n));
      	stop = System.nanoTime();
      	System.out.println("time = " + (stop-start) * 1E-9 + "secs.");
		

	}

}
