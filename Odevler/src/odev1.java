import java.util.Scanner;

public class odev1 
{
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		int ilkSayi;
		int ikinciSayi;
		int islemSonucu;
		
		System.out.println("Lutfen ilk sayiyi giriniz:");
		ilkSayi = klavye.nextInt();
		
		System.out.println("Lutfen ikinci sayiyi giriniz:");
		ikinciSayi = klavye.nextInt();
		
		islemSonucu = 0 ;
		
		System.out.println("Lutfen yapilacak islemi giriniz: + - * % ");
	    String secilenIslem = klavye.nextInt();
		
		if (secilenIslem.equals("+")) {
			islemSonucu = (ilkSayi + ikinciSayi);
			System.out.println(ilkSayi + " + " + ikinciSayi + " = " + islemSonucu ); 
			
		} else if (secilenIslem.equals("-")) {
			islemSonucu = (ilkSayi - ikinciSayi);
			System.out.println(ilkSayi + " - " + ikinciSayi + " = " + islemSonucu );
		}
		else if (secilenIslem.equals("*")) {
			islemSonucu = (ilkSayi * ikinciSayi);
			System.out.println(ilkSayi + " * " + ikinciSayi + " = " + islemSonucu );
		}
		else if (secilenIslem.equals("/")) {
			double doubleIslemSonucu = ((double)ilkSayi / (double)ikinciSayi);
			System.out.println(ilkSayi + " % " + ikinciSayi + " = " + doubleIslemSonucu );
		}
		else if (secilenIslem.equals("%")) {
			islemSonucu = (ilkSayi % ikinciSayi);
			System.out.println(ilkSayi + " % " + ikinciSayi + " = " + islemSonucu );
		}
		klavye.close();
		
	}				
	
	}
	


