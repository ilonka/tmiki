import java.util.Random;
import java.util.Scanner;

public class Square {
	public static void monte(int n) {

		double x, y;

		int k = 0;
		for (int i = 0; i < n; i++) {
			x = Math.random();
			y = Math.random();
			if ((x * x + y * y) <= 1) {
				k++;
			}
		}
		double pi = 4 * (double) k / n;
		System.out.println(pi);

	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ile punktów?");
		int n = s.nextInt();
		for (int i = 0; i < 100; i++) {
			monte(n);
		}
	}
}
