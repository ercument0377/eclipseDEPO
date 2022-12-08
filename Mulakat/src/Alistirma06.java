import java.util.Arrays;
import java.util.Scanner;

public class Alistirma06 {

	public static void main(String[] args) {
	
	String t [] = new String[5];
		t[0] ="Ali";
		t[1] ="veysel";
		t[2] ="ayse";
		t[3] ="zeynep";
		t[4] ="fetma";  
		
		char tt [] = new char[6];
		 tt[0]='A';
		 tt[1]='B';
		 tt[2]='C';
		 tt[3]='D';
		 tt[4]='E';
		
		 System.out.println(t[0]);            // tek bir elemanı yazdırmak için kullanılır
		System.out.println(Arrays.toString(t)); // bütün elemanları yazdırmak için kullanılır [Ali, veysel, ayse, zeynep, fetma]
		System.out.println(Arrays.toString(tt)); //[A, B, C, D, E, 
		
		
		int arr[] = {-12,23,16,5,23};
		
		Scanner scan = new Scanner(System.in);
		System.out.println( " bir sayi giriniz");
		int sayi = scan.nextInt();
		
		int sayac = 0; //flag
		
		for(int w : arr) {
			if (w==sayi) {
				sayac++;
			}
		}
		
		if (sayac>0) {
			System.out.println( sayi + " sayisi eleman " + sayac+ " kez kullanilmistir.");
			
		}else {
			System.out.println( sayi + " sayisi kullanilmamistir");

		}
			
			scan.close();
		}
		
	}


