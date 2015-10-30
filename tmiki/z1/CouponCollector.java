import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CouponCollector {
	public static int coupon(int n) {
		boolean[] found = new boolean[n];
		int x = 0;
		int v = 0;
		while (v < n) {
			int val = (int) (Math.random() * n);
			x++;
			if (!found[val])
				v++;
			found[val] = true;

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
			zapis(i, coupon(10));
		}
	}
}
