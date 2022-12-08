import java.util.Scanner;

public class Sinif5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen satir  sayi giriniz");
		
        int kenar = scan.nextInt();
       
        
    	for (int i=1; i<= kenar; i++) {
    		for (int j=1; j<= i; j++) {
    		 System.out.print("* ");
    		}
    		 System.out.println();
	}

	}

}
