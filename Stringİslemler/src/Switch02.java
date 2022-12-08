import java.util.Scanner;
public class Switch02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println( "lutfen bir sayi giriniz");
		
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		
		System.out.println( a<b ? a : b);



}
}
