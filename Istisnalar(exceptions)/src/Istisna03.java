
public class Istisna03 {
	
	// ArithmeticException 
	// unchecked exeption > RunTimeError     kod çalıştırıldığında verilen hatalardır
	// checked exeption   > CompileTimeError  kodları yazarken altı çizili hatalara denir
	public static void main(String[] args) {
		int x = 25;
		int y = 5;
		try {
		
		System.out.println(x/y);
		}catch (ArithmeticException e) {
			System.out.println("herhangi bir sayiyi sifira bolme islemi gerceklestirilemez");
		}
		
		
	//	System.out.println(x);

	}

}
