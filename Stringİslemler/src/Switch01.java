import java.util.Scanner;
public class Switch01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("bir ay giriniz");
		String ay = scan.next().toLowerCase();
		
		switch(ay) {
		     case "ocak" :
		     case "subat":
		     case "mart":
			System.out.println("girdiginiz ay ylin 1. ceyregindedir");
			break;
		     case "haziran" :
		     case "nisan":
		     case "mayis":
			System.out.println("girdiginiz ay ylin 2. ceyregindedir");
			break;
		     case "temmuz" :
		     case "agustos":
		     case "eylul":
			System.out.println("girdiginiz  ay ylin 3. ceyregindedir");
			break;
		     case "ekim" :
		     case "kasim":
		     case "aralik":
			System.out.println("girdiginiz ay ylin 4. ceyregindedir");
			break;
		
		default:
		System.out.println("dogru giriniz");
		

	}

}
}
