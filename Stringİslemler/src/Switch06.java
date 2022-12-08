import java.util.Scanner;

public class Switch06 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		
		System.out.println("lutfen bir sifre giriniz......");
		char karakter = klavye.next().charAt(0);
		
		if(karakter>='A' && karakter<='Z') {
			if ( karakter == 'A') {
				System.out.println("gecerli  Sifre");
			} else {
				System.out.println("gecerli olmayan  Sifre");
			}
		}else if(karakter >='a'  && karakter<='z')
		if(karakter=='z') {
			System.out.println("gecerli   Sifre");
		} else {
			System.out.println("gecerli olmayan  Sifre");
		
		
	}else { 
		System.out.println("dogru sifre giriniz");
		
		


	}

}
}