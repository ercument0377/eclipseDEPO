import java.util.Scanner;

public class A27 {

	public static void main(String[] args) {
	 /*
	  Alis adeti ve urunun fiyatini musteriden alin
	  Magaza uyelik karti olup olmadığını sorun,
	  uyelik kartı var ise ve 10 urunden fazla alırsa %20, uyelik var ve 10 urun yada az alırsa %15
	  Magaza uyelik kartı yok ve 10 urunden fazla alırsa %15, uyelik yok ve 10 urun  yada az alırsa %10
	  indirim uygulayan bir kod yaziniz
	  
	  
	  */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Urun adeti giriniz");
		int adet = scan.nextInt();
		adet = Math.abs(adet);
		
		System.out.println("Urun fiyatini giriniz");
		double fiyat = scan.nextDouble();
		
		System.out.println("Uyelik kartiniz var mi kart = 1:var 2:yok ");
		int kart = scan.nextInt();
		
		if(kart==1 && adet>10) {
			System.out.println("%20 indirimli toplam fiyati: "+adet*fiyat*0.80);
		}else if(kart == 1 && adet<11) {
			System.out.println("%15 indirimli toplam fiyati: "+adet*fiyat*0.85);

		}else if(kart == 2 && adet>10) {
			System.out.println("%15 indirimli toplam fiyati: "+adet*fiyat*0.85);
			
		}else if(kart == 2 && adet<11) {
			System.out.println("%10 indirimli toplam fiyati: "+adet*fiyat*0.90);
			
		}else {
			System.out.println("lutfen dogru bilgileri giriniz");
		}


		

	}

}
