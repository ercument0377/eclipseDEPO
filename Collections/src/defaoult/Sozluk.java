package defaoult;
import java.util.HasMap;
import java.util.Map;
import java.util.Scanner;
import.util.java.Map;


public class Sozluk {
	public static void main(String[] args) {
		
		Map<String, String> sozluk = new HasMap<String,String>();
		sozluk.put("araba", "car");
		
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("ingilizcesiniz ogrenmek istediginiz"  +" bir kelime giriniz");
		String kelime = klavye.nextLine();
		if(sozluk.containsKey(kelime))
			System.out.println(kelime+ " nin ingilizcesi" + sozluk.get(kelime));
		
		else 
			System.out.println("Sozlugumuzde " + kelime+ "bulunmuyor");
		Set kelimeSeti = sozluk.keySeti();
		Iterator iter = kelimeSeti
	}

}
