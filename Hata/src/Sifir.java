import java.util.Scanner;
public class Sifir {

	
	
	public static void main(String[] args) {

		Scanner klavye = new Scanner(System.in);
		boolean hataVarMi = false;
		
		
		
		int a = 0;
		int b = 0;
		
		do {
			System.out.println("lutfen ilk sayi giriniz");
			a = klavye.nextInt();
		}while (a==0);
		System.out.println("lutfen ikinci sayi giriniz");
		b = klavye.nextInt();
		System.out.println(b/a);
		
	}
}

// aşaıdakinin daha kısa yazılmısı yukarısı = aşagısı ile aynı sonucu verir
		
	/*	 do {
			try{
				System.out.println( "Lutfen bir sayi giriniz");
				do {
			    int a = klavye.nextInt();
				}
			    while(a==0);
			    int b = klavye.nextInt();
			
			    System.out.println(b / a);
			    hataVarMi = false;
			}catch (ArithmeticException ae) {
				System.out.println("Girdiginiz ilk sayi sifir olamaz");
				hataVarMi = true;
			}finally {
				System.out.println("Dongu tamamlandi");
}
		}while(hataVarMi);
		 
} 
}
*/

		
		

