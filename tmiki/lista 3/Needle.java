import java.util.Scanner;

public class Needle {
	public static void needle(int n, double l, double t) {
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
	}

	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ile igieł?");
		int n = s.nextInt();
		double l = 2.5; //dlugosc igly
		double t = 3.0; //odleglosc miedzy liniami
		for (int i = 0; i < 100; i++) {
			needle(n, l, t);
		}
		
	}
}
