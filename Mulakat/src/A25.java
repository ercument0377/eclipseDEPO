import java.util.Scanner;

public class A25 {

	public static void main(String[] args) {
		
		/* kullanıcıdan 10 dan kucuk bir sayı alın ve carpım tablusu olusturun
		   orn: sayı 4
		   1    2    3    4
		   2    3    4    5 
		   3    6    9    12
		   4    8    12   16
		   
           */
		
		Scanner carpim = new Scanner(System.in);
		System.out.println("Lutfen 10 dan kucuk bir sayi giriniz");
		int sayi = carpim.nextInt();
		
	
		if(sayi<10 && sayi>0) {
		for (int i=1; i<=sayi; i++) {
			
			for (int j=1; j<=sayi; j++ )
				
				System.out.print(i*j+" ");
				
				System.out.println();
			}
			
		}else {
		System.out.println( "Lutfen 0 ile 10 arasinda bir sayi giriniz" );
	}
		
	}

}
