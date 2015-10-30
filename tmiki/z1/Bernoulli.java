import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bernoulli {

	public static int getBinomial(int n, double p) throws IOException {
		int x = 0;
		for (int i = 0; i < n; i++) {
			if (Math.random() < p)
				x++;
		}

		return x;
	}

	public static void zapis(int i, int x) throws IOException {
		FileWriter tworzeniePliku = new FileWriter("DANE.csv", true);
		BufferedWriter zapis = new BufferedWriter(tworzeniePliku);
		String px = Long.toString(x);
		String pi = Long.toString(i);

		try {
			zapis.write(pi + ";" + px);
			zapis.newLine();
		} finally {
			zapis.close();
		}
	}

	public static void main(String args[]) throws IOException {
		for (int i = 0; i < 1000; i++) {
			zapis(i, getBinomial(40, 0.5));
		}
	}
}