import java.util.*;


public class Zad_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Statistic_calculator stat = new Statistic_calculator();
		List<Integer> list = new LinkedList<Integer>();
		//List<Integer> list_temp = new LinkedList<Integer>();
		Random generator = new Random();
		int get_result = 4000; //zmienna w której ustalamy w którym momencie ma nam policzyć statystyki
		int x = 0; //zmienna sterująca pętlą
		double sum = 0.0; //zmienna, która przechowuje nam sume poszczególnych składników
		double avg  = 0.0; //zmienna, z wynikiem średniej arytmetycznej liczonej w sposób szybki
		int size_data = 200; //wielkość danych z których chcemy uzyskać statystykę
		Integer[] data = new Integer[size_data];
		double avg_sum = 0.0;
		while(true){ //pętla która nam generuje dane 
			list.add(generator.nextInt(10));
			x++;
			if (list.size() > 1) {
				if (list.size() > size_data){
					sum -= stat.fast_average(list.get(list.size()-(size_data+1)),list.get(list.size()-size_data));
					avg_sum -= list.get(list.size()-(size_data+1));
				}
				sum += stat.fast_average(list.get(list.size()-2),list.get(list.size()-1));
			}
			avg_sum += list.get(list.size()-1);
			if (x == get_result) {
				avg = sum/(size_data-1);
				int j = 0;
				for (int i=x-size_data; i<x; i++) {
					data[j] = list.get(i);
					j++;
				}
				System.out.println("Średnia chronologiczna: " + avg);
				System.out.println("Średnia szybka: " + avg_sum/size_data);
				System.out.println("Średnia: " + stat.average(data));
				System.out.println("Mediana: " + stat.median(data));
				System.out.println("Wariancja: " + stat.variance(data));
				break;
			}
		}
		

	}

}
