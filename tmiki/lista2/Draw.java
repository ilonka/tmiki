import java.util.Arrays;

/**
 * 
 * @author Krzysztof Bachta
 * 
 * Klasa do eksperymentów z kulami i pojemnikami
 *
 */
public class Draw {

	private int[] bins = null; // zmienna reprezentująca pojemniki do których wrzucane są kule
	private int quantity_balls = 0; // zmienna przechowująca ilość kul do wrzucenia
	private int quantity_puts_balls = 0; // zmienna przechowuje aktualną ilość wrzuconych kul 
	/**
	 * Konstruktor tworzy nam tablicę, która reprezentuje pojemniki oraz podajemy ilość kul, które będą wrzucane.
	 * @param quantity_balls - ilość kul.
	 * @param quantity_bins - ilość pojemników.
	 */
	public Draw(int quantity_balls, int quantity_bins) {
		bins = new int[quantity_bins];
		this.quantity_balls = quantity_balls;
	}
	/**
	 * Funkcja sortuje nam pojemniki od najwięszego najmniejszego.
	 * @return jeżeli poprawnie zostanie posortowane zwraca nam true, w p.p. false.
	 */
	public boolean sort_bins() {
		Arrays.sort(bins);
		// odwracanie posortowanej tablicy
		int left = 0;
	    int right = bins.length - 1;
	    while( left < right ) {
	        // przestawianie wartości tablicy z początku na koniec
	        int temp = bins[left];
	        bins[left] = bins[right];
	        bins[right] = temp;
	        // przesuwanie wartości lewej i prawej do środka
	        left++;
	        right--;
	    }
		return true;
	}
	/**
	 * Funkcja, która umieszcza nam kule, w pojemniku.
	 * @param number - numer pojemnika do którego należy wrzucić kulę.
	 */
	public void put_ball(int bin_number) {
		bins[bin_number]++;
	}
	/**
	 * Funkcja zwraca ilość kul, w danym pojemniku.
	 * @param number - numer pojemnika z którego chcemy pobrać ilość.
	 * @return ilość kul w danym pojemniku.
	 */
	public int get_quantity(int bin_number) {   
		return bins[bin_number];
	}
	/**
	 * Funkcja zwraca nam ilość pustych pojemników, po wrzuceniu wszystkich kul.
	 * @return ilość pustych pojemników.
	 */
	public int get_quantity_empty_bins() { 
		int counter = 0; //licznik, zliczjaący ilość pustych pojemników
		for(int i : bins) {
			if (i == 0){ 
				counter++; // jeśli liczba kul w pojemniku jest = 0 wtedy inkrementujemy licznik
			}
		}
		return counter;
	}
	/**
	 * Funkcja służy do czyszczenia pojemników z kul.
	 * @return zwraca nam wartość true, w przypadku powodzenia, w p.p. false.
	 */
	public boolean clean_bins() {
		for(int i=0; i<bins.length; i++) {
			bins[i] = 0;
		}
		return true;
	}
	/**
	 * Fukcja służy do wyczyszczenia ilości aktualnie wrzuconych kul; 
	 * @return zwraca nam wartość true, w przypadku powodzenia, w p.p. false.
	 */
	public boolean clean_balls() {
		this.quantity_puts_balls = 0;
		return true;
	}
}
