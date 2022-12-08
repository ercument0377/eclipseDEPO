import java.util.Arrays;
import java.util.Scanner;
public class A16 {

	public static void main(String[] args) {
		
		//ornk 3: uzunlugu 6 olan bir double Array olusturun
		// Elelmanları Array in içereisine ekleyen bir program kodlayın
		//Console bu elemanların toplamını yazdırın
		
		double d[] = new double[6];
		System.out.println(Arrays.toString(d)); //[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
		d[0] = 2.3;
		d[1] = 2.4;
		d[2] = 2.9;
		d[3] = 2.6;
		d[4] = 2.4;
		d[5] = 2.8;
		System.out.println(Arrays.toString(d)); //[2.3, 2.4, 2.9, 2.6, 2.4, 2.8]
		
		
		double toplam = 0;
		
	//	for (int i=0; i<d.length; i++) {
		//	toplam = toplam+d[i];
		
		for(double w:d) {
			toplam = toplam +w;
		 }
		System.out.println(toplam); //15.399999999999998
		
		
		//ornk 4: Bir ,string Array olusturun ve "Tom" dan onceki elemanları yazdırın
		
		String ogrenciler[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom","Martin"};
		 
		for (String w:ogrenciler) {
			if(w.equals("Tom")) {
				break;
			}
			System.out.println(w); //Ali Thomas Mark Jackson
		}	
		System.out.println("//////////////////////////////////");
		
		//ornk 5: Bir ,string Array olusturun ve "Tom" dan onceki ve Tom u da  yazdırın
		
				String ogrenci[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom","Martin"};
		
			for (String w:ogrenci) {
				System.out.print(w + " "); //Ali Thomas Mark Jackson Tom 
				if(w.equals("Tom")) {
					break;	
		}
	}
			System.out.println("//////////////////////////////////");

			//ornk 6: Bir ,string Array olusturun ve "Tom" dan ofarkli elemanları yazdırın
			
			String musteri[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom","Martin"};
			

			for (String w:musteri) {
				if(w.equals("Tom")) {
					continue;
		}
				System.out.print(w +" ");	//Ali Thomas Mark Jackson Martin 
		
	}
			
			//ornk 7 : Spesifik bir elemanın Arrayda bulunup bulunmadıgını veya 
			// kaç kez kullanıldığını bulan bir code yazın
			// int arr[] = {-12,23,16,5};   bul 23
			
			int arr[] = {-12,23,16,5};
			Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir sayi giriniz");
			int sayi = scan.nextInt();
			
			int sayac = 0; //flag deniliyor 
			
			for(int w:arr) {
				if(w==sayi) {
					sayac++;

				}
			}
			
			if (sayac>0) {
				System.out.println(sayi + " sayisi eleman olarak "+sayac+ " kez kullanilmistir.");
				
			}else {
				System.out.println(sayi + " sayisi eleman olarak hic  kullanilmamistir.");

			}
			scan.close();
						
	}
}

