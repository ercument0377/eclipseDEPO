import java.util.Scanner;

public class Odev8 {

	public static void main(String[] args) {
		 Scanner klavye = new Scanner (System.in);
		 System.out.println("Lutfen tersten yazdirmak istediginiz cumleyi giriniz : ");
		 
		 String metin = klavye.nextLine();
		 String tersMetin= "";
		 
		 for (int i = metin.length()-1; i>=0; i--)
		 {
			tersMetin += metin.charAt(i);
		 }
		 System.out.println(tersMetin);
	}
}
	     