import java.util.ArrayList;
import java.util.List;

public class A22 {
// bir integer List te bulunan butun maasları %10 artıran bir kod yazdırın
	// [5000,6000,4500,3900,7200]
	
	public static void main(String[] args) {
		
		List<Double> maas = new ArrayList<>();
		
		maas.add(500.0);
		maas.add(6000.0);
		maas.add(4500.0);
		maas.add(3900.0);
		maas.add(7200.0);
		System.out.println( maas);  //[500.0, 6000.0, 4500.0, 3900.0, 7200.0]
		
		for ( int i=0; i<maas.size(); i++) {
			maas.set(i, maas.get(i)*1.1);
			
		}
		System.out.println(maas); //[550.0, 6600.000000000001, 4950.0, 4290.0, 7920.000000000001]
		
	}
	
	
	
	
}
