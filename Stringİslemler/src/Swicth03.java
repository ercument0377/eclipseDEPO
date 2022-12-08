import java.util.Scanner;
public class Swicth03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println( "lutfen bir sehir giriniz");
		String sehir = scan.next().substring(0,2);
		
		
		String sonuc = sehir.length()==2 ? (6>8 ? "kucuk" : "buyuk") : "gecersiz" ;

		System.out.println( sonuc);
	}

}
