import java.util.Scanner;
public class DersNotlari1 extends ForDongusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
       
		System.out.print("Lutfen bir sayi giriniz:  ");
        int girilenSayi = scan.nextInt();
        
        	boolean ilksatirMi = true;
        	boolean sonSatirMi = false;
            for(int i=0; i<girilenSayi; i++) {
            	for(int j=i; j < girilenSayi-1; j++) {
            		System.out.print(" ");
            	}
            	System.out.print("*");
            	
            	for(int k=0; k < i*2-1; k++) {
            		System.out.print(" ");
            	}
            	if (ilksatirMi) {
            	System.out.println(" ");        	
            }
            	else {
            		System.out.println("*");
            	}
            	ilksatirMi = false;  
            } 	
            for (int i = 0; i < girilenSayi-1; i++ ) {
            	if ( i == girilenSayi -2 ) {
            		sonSatirMi = true;
            	}
            	for (int j = 0; j<=i; j++) {
            		System.out.print(" ");
            	}
            	System.out.print("*");
            	for(int k = 0; k < (girilenSayi -3)*2-2 * i+1 ; k++) {
            		System.out.print(" ");
            	}
            	if (!sonSatirMi)
            	System.out.println("*");
            	else {
            		System.out.println(" ");
            	}
            	
            	}
            }
           }
	    