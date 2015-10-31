import java.util.*;


public class Statistic_calculator {

	public double average(Integer[] data) {
		double result = 0.0;
		int sum = 0;
		for (int i = 0; i<data.length; i++) {
			sum+=data[i];
		}
		result = (double)sum/data.length;
		return result;
	}
	
	public double median(Integer[] data) {
		double result = 0.0;
		Arrays.sort(data);
		int n = data.length;
		if (n%2 == 1){
			result = data[((n+1)/2)-1];
		} else {
			result = (data[(n/2)-1] + data[(n/2)])/2.0;
		}
		return result;
	}
	
	public double variance(Integer[] data) {
		double result = 0.0;
		double avg = average(data);
		double sum = 0.0;
		for (int i = 0; i<data.length; i++) {
			sum += Math.pow(data[i] - avg,2);
		}		
		result = sum/data.length;
		return  result;
	}
	
	public double fast_average(int x, int y) {
		double result = 0.0;
		result = (x+y)/2;
		return result;
	}
	
}
