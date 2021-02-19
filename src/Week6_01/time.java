package Week6_01;

public class time {
	
	public static void f1(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i *= 2)
			for (int j = 1; j <= 2; j++)
				sum++;
		System.out.println("sum = " + sum);
	}

	public static void f2(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i++)
			sum++;
		System.out.println("sum = " + sum);
	}
	
	public static void f3(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i *= 2)
			for (int j = 1; j <= n; j++)
				sum++;
		System.out.println("sum = " + sum);
	}

	public static void f4(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i *= 2) // O(log n)
			for (int j = 1; j <= i; j++)// O(n)
				sum++;
		System.out.println("sum = " + sum);
	}

	public static void f5(int n) {
		long sum = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= n; j++)
				sum++;
		System.out.println("sum = " + sum);
	}

	public static void f6(int n){
		long sum = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= i; j++)
				sum++;
		System.out.println("sum = " + sum);
	}
	
	public static int f7(int n) {
		if (n <= 1) 
			return n;
	    else 
			return f7(n - 2) + f7(n - 1);
	}
	
	public static void main (String[] args) {
		long start, stop;

		start = System.nanoTime();

		f7(50); // try to call other methods and change n value

		stop = System.nanoTime();
		System.out.println("time = " + (stop-start) * 1E-9 + "secs.");
	}

}
