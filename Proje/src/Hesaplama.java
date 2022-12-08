

public class Hesaplama {
	public static void main(String [] args) {
		double ilkSayi = 21.0;
		double ikinciSayi = 5.0;
		
		double toplam = (ilkSayi + ikinciSayi);
		double carpim = (ilkSayi * ikinciSayi);
		double fark = (ilkSayi - ikinciSayi);
		double kalan = (ilkSayi % ikinciSayi);
		double bolum = (ilkSayi / ikinciSayi);
		
				
		
		System.out.println("Ilk sayi ile ikinci sayinin toplami: " + toplam);
		System.out.println("Ilk sayi ile ikinci sayinin carpimi: " + carpim);
		System.out.println("Ilk sayi ile ikinci sayinin farki: " + fark);
		System.out.println("Ilk sayi ile ikinci sayinin bolumunden kalan: " + kalan);
		System.out.println("Ilk sayi ile ikinci sayinin bolumu: " + bolum);
	}
}

