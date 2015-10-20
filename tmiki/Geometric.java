import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.*;

public class Geometric {
	public static double geometric(double p) throws IOException {

		double x;
		double u;

		u = Math.random();
		x = log(u) / log(p);

		return x;

	}

	public static void zapis(int i, double x) throws IOException {
		FileWriter tworzeniePliku = new FileWriter("DANE.csv", true);
		BufferedWriter zapis = new BufferedWriter(tworzeniePliku);
		double px = x;
		int pi = i;

		try {
			zapis.write(pi + ";" + px);
			zapis.newLine();
		} finally {
			zapis.close();
		}
	}
	public static void main(String args[]) throws IOException {
		for(int i=0; i<40; i++){
		System.out.println(geometric(0.2));
		}
	}
}
