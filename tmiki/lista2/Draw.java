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
		return true;
	}
	/**
	 * Funkcja, która umieszcza nam kule, w pojemniku.
	 * @param number - numer pojemnika do którego należy wrzucić kulę.
	 */
	public void put_ball(int bin_number) {
		
	}
	/**
	 * Funkcja zwraca ilość kul, w danym pojemniku.
	 * @param number - numer pojemnika z którego chcemy pobrać ilość.
	 * @return ilość kul w danym pojemniku
	 */
	public int get_quantity(int bin_number) {
		return 0;
	}
	/**
	 * Funkcja zwraca nam ilość pustych pojemników, po wrzuceniu wszystkich kul.
	 * @return
	 */
	public int get_quantity_empty_bins() { 
		return 0;
	}
	/**
	 * Funkcja służy do czyszczenia pojemników z kul.
	 * @return zwraca nam wartość true, w przypadku powodzenia, w p.p. false.
	 */
	public boolean clean_bins() {
		return true;
	}
	/**
	 * Fukcja służy do wyczyszczenia ilości aktualnie wrzuconych kul; 
	 * @return zwraca nam wartość true, w przypadku powodzenia, w p.p. false.
	 */
	public boolean clean_balls() {
		return true;
	}
}
