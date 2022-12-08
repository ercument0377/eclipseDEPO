import java.util.Scanner;
public class Sifir01 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
				
				int[] notlar = {  100,90,85,95,85,100,50};
				
				try{
					System.out.println(notlar[10]);
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.println("Yanlis index girdiniz");
				}
				

	}
}



