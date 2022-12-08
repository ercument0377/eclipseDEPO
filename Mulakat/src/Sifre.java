import java.util.Scanner;

public class Sifre {

	// "admin" olarak kullanıcı adı olusturun 
	// "sfr1234" olarak sifre olusturun
	// kullanıcıdan girmesini isteyin 
	// 3 defa yanlıs girilince bloke edilsin.
	
	public static void main(String[] args) {
		
		
		Scanner klavye = new Scanner(System.in);
		
		String kullaniciAdi = "admin";
		String sifre = "sfr1234";
		
		int denemeSayisi = 3;
		
		while(denemeSayisi>0) {
			System.out.println("Lutfen kullanici adi  giriniz");
			String tahminID = klavye.nextLine();
			
			System.out.println("Lutfen sifre  giriniz");
			String tahminSifre = klavye.nextLine();
			
			
			if(tahminID.equals(kullaniciAdi) && tahminSifre.equals(sifre))
					{
				System.out.println("Hesabiniza giris yaptiniz");
				break;
					}else {
						
				System.out.println("Kullanici adiniz veya sifre yanlis.Tekrar giriniz.");
			}
			denemeSayisi--;
			
		}
		if(denemeSayisi==0)
		System.out.println("Hesabiniz bloke edildi");
		
	}

}
