package JUnit;

public class Fibonacci_110 {
	public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = b;
            b = a + b;
            a = temp;
        } 
        return b;
    }
}