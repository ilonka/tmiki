import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Cube {
	public static int six (){
		Random r = new Random();
		Random rand = new Random();
		int x=0;
		int y=0;
		while(y<2){
			int z=r.nextInt(6) + 1;
			x++;
			System.out.println("z: "+z +" y: "+y+ " x: "+x);
		if(z==6){
			//System.out.println("z: "+z +" y: "+y+ " x: "+x);
			int k=rand.nextInt(6) + 1;
			x++;
			System.out.println("k: "+k +" y: "+y+ " x: "+x);
			if(k==6){
				y=2;
				
			}
			else{
			y=0;
			}
			
		}
		
	//	System.out.println("z: "+z +" y: "+y+ " x: "+x);
			
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
		
		
		for (int i = 1; i <= 1000; i++) {
			//six();
			zapis(i,six());
		}

	}

}