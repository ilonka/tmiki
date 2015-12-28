import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Needle {
	public static  double needle(int n, double l, double t) {
		int k = 0;
		for (int i = 0; i < n; i++) {
			double alpha = Math.toRadians(Math.random() * 90); // kat igly (0,pi)
			double center = Math.random() * t; // polozenie srodka igly (0,t)
			double x = (l / 2) * Math.sin(alpha); // igla przecina jesli odleglosc srodka
													// igly od linii jest
													// mniejszy niz
													// l/2*sin(alpha)
			if (center < x||(center+x)>t) {
				k++;
			}
		}
		double pi = (2 * l * n) / (t * k);
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
		System.out.println("Ile igieł?");
		int n = s.nextInt();
		double l = 2.5; //dlugosc igly
		double t = 3.0; //odleglosc miedzy liniami
		for (int i = 0; i < 1000; i++) {
			zapis(needle(n, l, t));
		}
		
	}
}
