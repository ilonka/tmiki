import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Geometric {
	public static int geometric(double p) throws IOException {

		int x;
		double u;

		u = Math.random();
		x = (int) (Math.log(u) / Math.log(p));

		return x;

	}

	public static void zapis(int x) throws IOException {
		FileWriter tworzeniePliku = new FileWriter("DANE.csv", true);
		BufferedWriter zapis = new BufferedWriter(tworzeniePliku);
		String px = Long.toString(x);

		try {
			zapis.write(px);
			zapis.newLine();
		} finally {
			zapis.close();
		}
	}

	public static void main(String args[]) throws IOException {
		for (int i = 0; i < 1000; i++) {
			zapis(geometric(0.2));
		}
	}
}
