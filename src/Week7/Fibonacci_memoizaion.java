package Week7;
import java.util.*;
public class Fibonacci_memoizaion {
	static ArrayList<Long> cached=new ArrayList<Long>();
	static Long fib(int n) {
		if(n< cached.size()) {
			return cached.get(n);
		}Long v;
		if(n<=1) {
			v=(long) n;
		}else {
			v=fib(n-2)+fib(n-1);
		}if(n== cached.size()) {
			cached.add(v);
		}return v;
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
