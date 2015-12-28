import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Square {
	public static double monte(int n) {

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
		return pi;

	}
	public static void zapis(double pi) throws IOException {
		FileWriter tworzeniePliku = new FileWriter("DANE.csv", true);
		BufferedWriter zapis = new BufferedWriter(tworzeniePliku);
		

		try {
			zapis.write(pi + ";" + "3,14");
			zapis.newLine();
		} finally {
			zapis.close();
		}
	}
	public static void main(String args[]) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.println("Ile punktów?");
		int n = s.nextInt();
		for (int i = 0; i < 1000; i++) {
			zapis(monte(n));
		}
	}
}
