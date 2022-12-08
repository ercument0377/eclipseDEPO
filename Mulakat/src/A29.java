
public class A29 {
	// Ogrencilerin isimlerini ve sinavlarinin ( 2, 3, 4, 5 sinav olabilir) 
	//  ortalamasini alan bir method yaziniz
	

	public static void main(String[] args) {
		
		System.out.println(sinavOrtalama("Ahmet",68,78 ));
		System.out.println(sinavOrtalama("Mehmet",68,59,95,78 ));

		System.out.println(sinavOrtalama("Ali",68,59,95,78,55,26,35,89,55,77 ));
		
	}
	// ... (3 noktalı kısım)a varargs denir
	public static String sinavOrtalama(String isim, double ... puan) {
		double ortalama =0;
		for(double notlar: puan) {
			ortalama +=notlar;
			
		}
		
		
		
		return isim+ "'in sinavlari ortalamasi: "+ String.format("%.2f", ortalama/puan.length);
		// %.2f ==> % => isareti noktadan onceki butun rakamları al demek
		// 2f ==> noktadan sonraki 2 rakamı yazdır demek
		// 63.70  
		//  %.2f
	}

}
