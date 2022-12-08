import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Istisna02 {
	
	/* 
	 1. bir tane try - block için birden fazla cath blogu kullanılabilir.
	 2. eger birden fazla "catch-black" kullanılmıssa, daima Exception sıralaması
	    child-parent seklinde olmalı
	    aksi takdirde CTE hatası alırız.
	 3.  eger birden fazla "catch-black" kullanacaksanız, herbiri için farklı mesaj yazdırabilirsiniz.
	 4. try-black tek başına kullanılamaz
	 5. eger java kodları okurken bir hata bulursa ( try-cath veya Throws ustesinden gelinmezse) çalışmayı durdurur.
	  
	 */

	public static void main(String[] args) {
		
		
		try {
			FileInputStream	 dosya = new FileInputStream("src/File01");
			
		
		int i = 0;
		
			while ((i = dosya.read()) !=-1 ) {
				// System.out.println(i);   // asgi değerini yazdırır
				System.out.print((char) i);  // yazının kendisini yazdırır
				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Verdiginiz adres yanlistir");
		//	e.printStackTrace();
		} catch (IOException e){
			System.out.println("Dosya adresi dogru fakat karakterleri okuyamiyorum");
		}
	
		
		}
	}



