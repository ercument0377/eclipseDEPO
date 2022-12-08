import java.util.Scanner;

public class A23 {
	
	//kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdıran bir kod yazınız
	

	public static void main(String[] args) {
		Scanner sayi = new Scanner(System.in);
		
		System.out.print("lutfen bir sayi giriniz");
		int rakam= sayi.nextInt();
		
		int rakamlariToplami = 0;
		
		do {
			rakamlariToplami += rakam%10;
			rakam = rakam/10;
		
		}while(rakam>0);
		
		/*
		for (int i=0; i<rakam; i++) {
			rakamlariToplami += rakam%10;
			rakam = rakam/10;
			i--;
		} */
		
		
		
		System.out.println(rakamlariToplami);
		sayi.close();
		
	}

}
