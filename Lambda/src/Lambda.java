import java.util.Scanner;

public class Lambda {

	public static void main(String[] args) {
/*	 PIarayuzu pi;
	 pi = ()->Math.PI;
	 */
	 System.out.println("Lutfen bir sayi giriniz");
	
	 Scanner klavye = new Scanner(System.in);
	 KarasiniAl kare;
	 kare =(sayi1)-> sayi1 * sayi1;
	 
	 System.out.println("PI sayisinin degeri"+pi.PIdegeriniDondur());
	 
		
/*		double pi = PIdegeriniDondur();
	  System.out.println("PI sayisinin degeri"+pi);

	}
	public static double PIdegeriniDondur() {
		return Math.PI;
	} */
}
@FunctionalInterface
interface PIarayuzu
{
	double PIdegeriniDondur();
}
@FunctionalInterface
interface karasiniAl
{
	abstract double karesiniAl(int param1){
		
	}
}
}

// (parameter list) -> {body}