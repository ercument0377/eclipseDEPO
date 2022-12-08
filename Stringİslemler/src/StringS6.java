import java.util.Scanner;

public class StringS6 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		
		System.out.println("lutfen bir kelime giriniz");
		String kelime = klavye.nextLine();
		
		
		String ilk = kelime.substring(0, 1); // kelime.cajharAt(0)
		
		String son = kelime.substring(kelime.length()-1); // kelime.charAt(kelime.length()-1);
		
		
		System.out.println("ilk karakter: "+ ilk+ "son karakter: "+son);
		
	}
}