import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Alistirma07 {

	public static void main(String[] args) {
		
		//ornk 8: kullanıcıdan bir cumle alınız
		// bu cumlede kac tane kelime yazdırıldıgını göstere kod yazınız
		
		Scanner cumle = new Scanner(System.in);
		
		System.out.println( "Lutfen bir cumle giriniz"); //"Lutfen, bir; cu:mle gi?riniz"  girdik
		
		String metin = cumle.nextLine();
		   String ar[] = metin.replaceAll("[\\p{Punct}]", "").split(" "); //noktalamalardan kurtulunuyor ve boşluktan ayırıyor
		   
		   System.out.println(Arrays.toString(ar));  // [Lutfen, bir, cumle, giriniz] yazdırır
		   System.out.println("bu cumlede kullanilan kelime saiyisi : "+ ar.length); //4
		

		 //ornk 9:  bu cumlede en uzun kelimeyi bulan  kod yazınız
		   
		   String s = "Daha fazla Java ogrenmek icin kursa gitmem gerekli mi";
		   
		   String kelime [] = s.replaceAll("[\\p{Punct}]", "").split(" ");
		   // System.out.println(Arrays.toString(kelime)); //[Daha, fazla, Java, ogrenmek, icin, kursa, gitmem, gerekli, mi]
		  // Arrays.sort(kelime);
		 //  System.out.println(Arrays.toString(kelime)); //[Daha, Java, fazla, gerekli, gitmem, icin, kursa, mi, ogrenmek]
		   
		   Arrays.sort(kelime, Comparator.comparingInt(String::length)); // method referansı denir
		   System.out.println(Arrays.toString(kelime));  // [mi, Daha, Java, icin, fazla, kursa, gitmem, gerekli, ogrenmek]
		   System.out.print(kelime[kelime.length-1]);  // son kelimeyi verir yani en uzunu ogrenmek
	
		  
		   
	}

}
