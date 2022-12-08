import java.util.Scanner;

public class A28 {

	/* 
	 kullanıcıdan isim, soyisim ve kredi kartını girmesini isteyin ardından
	 isim ve soyisim ilk karakteri ile kredi kartının son 4 rakamı haric
	 diger her bir karakter yerine "*" yazan bir kod yazınız
	 
	 orn: Tom Hanks ==> T** H**** Kredi kart numarası ==> **** **** **** 6785
	 	
	 */
	
	public static void main(String[] args) {
	// 1.Yol
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen isim, soyisim ve  kredi kart no'yu giriniz");
		
		String isim = scan.next();   // Ali
		String soyIsim = scan.next();
		String kartNo = scan.next();
		String gizlenmisIsim = isim.charAt(0)+isim.substring(1).replaceAll("[a-z]", "*");
		String gizlenmisSoyIsim = soyIsim.substring(0,1) + soyIsim.substring(1).replaceAll("[a-z]", "*");
		String gizlenmisKartNo = kartNo.substring(0,9).replaceAll("[0-9]","*") +" "+ kartNo.substring(9);
		
		System.out.println(gizlenmisIsim + "\n" + gizlenmisSoyIsim + "\n" + gizlenmisKartNo);
	
/*	// 2.Yol
		
		String str = scan.nextLine();
		String ad = str.split(" ")[0];
		String soyad = str.split(" ")[1];
		String kart = str.split(" ")[2];
		
		String gizliad = ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("[a-z]", "*");
		String gizliSoyad = soyad.substring(0,1).toUpperCase() + soyad.substring(1).replaceAll("[a-z]", "*");
		String gizliKart = "";
		
		for (int i=0; i<kart.length(); i++) {
			if ( i<kart.length()-4) {
				
				gizliKart = gizliKart + "*";
			}else {
				gizliKart = gizliKart+kart.charAt(i);
			}
		}
		
	System.out.println(gizliad + " "+ gizliSoyad+ " "+ gizliKart);   */
	
	}

}
