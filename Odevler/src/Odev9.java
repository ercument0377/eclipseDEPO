import java.util.Scanner;
public class Odev9 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
	
		int sayi=klavye.nextInt(); 
		
		
		for(int i=1;i<=sayi;i++)
		{
			for(int j=1;j<=sayi-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
			
			System.out.println();
		}
	
		for(int i=sayi-1;i>=1;i--)
		{
			for(int j=1;j<=sayi-i;j++)
				System.out.print(" ");
			
			for(int j=1;j<=2*i-1;j++)
				System.out.print("*");
		
			System.out.println();
		}
		
	}
}