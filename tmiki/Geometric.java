import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.*;

public class Geometric {
	public static double geometric(double p) throws IOException {

		double x;
		double u;

		u = Math.random();
		x = Math.log(u) / Math.log(p);

		return x;

	}

	public static void zapis(double x) throws IOException {
		FileWriter tworzeniePliku = new FileWriter("DANE.csv", true);
		BufferedWriter zapis = new BufferedWriter(tworzeniePliku);
		String px = Double.toString(x);

		try {
			zapis.write(px);
			zapis.newLine();
		} finally {
			zapis.close();
		}
	}

	public static void main(String args[]) throws IOException {
		for (int i = 0; i < 1000; i++) {
			double a = geometric(0.2);
			System.out.println(i + 1 + " " + a);
			zapis(a);
		}
	}
}
