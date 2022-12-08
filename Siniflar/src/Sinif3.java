import java.util.Scanner;

public class Sinif3 {
	
	
	

	public static void main(String[] args) {
		
		Scanner dikdortgen = new Scanner(System.in);
		System.out.println("lutfen satir  sayi giriniz");
		
        int satir = dikdortgen.nextInt();
        System.out.println("lutfen  sira için sayi giriniz");
         int kolon = dikdortgen.nextInt();
        
    	for (int i=1; i<= satir; i++) {
    		for (int j=1; j<= kolon; j++) {
    		 System.out.print(" * ");
    		}
    		 System.out.println();
	}

	}
	
}
	

	

