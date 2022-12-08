import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class B2 {

	public static void main(String[] args) {
		
		List<String>list01 = new ArrayList<>();
		
		list01.add("Tom");
		list01.add("Ali");
		list01.add("Canan");
		
		
		
		System.out.println(list01);  //[Tom, Ali, Canan]
		
		for (String w:list01) {
			w = w+"+";
		}
	
		System.out.println(list01);  //[Tom, Ali, Canan]
		
		// loop (döngü) kullanarak, collectionların elemanlarını GÜNCELEYEMEYİZ
		
		ListIterator<String>listItr = list01.listIterator(); // [Tom,      Ali,       Canan]
		
		
		while(listItr.hasNext()) {
			String element =listItr.next();
			
			// System.out.print(element);   // Tom* Ali* Canan*
			
			listItr.set(element+ "* ");   // bununla dizide gösterme yapar
			
			
		}
		System.out.print(list01);  // [Tom* , Ali* , Canan* ]
		
		
		
		// burada güncelleme ve tersten yazdırma yapıyoruz//
		
		List<String>list2 = new ArrayList<>();
		list2.add("Aplle");
		list2.add("Samsung");
		list2.add("Huawei");
		System.out.println(list2);  // [Aplle, Samsung, Huawei]
		
		//Elemanlarını guncelle ve tersten yazdır
		ListIterator<String> itr = list2.listIterator(); 
	//	System.out.print(list2);         // [     Aplle,    Samsung,    Huawei]
		// pointeri sona taşımak için once "hasNext()" sonra "Next()" kullanmak lazım
	
		while (itr.hasNext()) {    // elemanın üzerinden atlatıyor burada 
			itr.next();           // üzerinden atladıgı elemanı döndürüyor
		}    
		
		while (itr.hasPrevious()) {
			String eleman = itr.previous();  //senden önce birşey var mı ona bakar 
			itr.set(eleman+"? ");            // gunceller ? ekler
		}
		Collections.reverse(list2);
		
		System.out.println(list2);  // [Huawei? , Samsung? , Aplle? ]
		
		// biter burada yenisi baslar //
		
		
		List<String>list03 = new ArrayList<>();
		list03.add("A");
		list03.add("B");
		list03.add("C");
		
		//listItretor kullanarak bir elemanı listeden kaldırmak istiyorum
		
		ListIterator<String>i01 = list03.listIterator();
		System.out.println("Eleman silinmeden once "+  list03); // [A, B, C]
		
		
		i01.hasNext(); // sadece elemanın üzerinden atlatır
		i01.next();    // hangi elemanı atladıysa onu döndürür // A
		i01.remove();  // elemanı siler  A yı siler
		
		System.out.println("Sildikten sonra  "+ list03);
		
	
		// biter burada yenisi baslar //
		
		
		//listItretor kullanarak  elemanı eklemek istiyorum	
		
		List<String>list04 = new ArrayList<>();
		
		list04.add("X");
		list04.add("Y");
		list04.add("Z");
		
		ListIterator<String>i2 = list04.listIterator();
		
		
		System.out.println(list04); // eklenmeden önce  [X, Y, Z]
		
		// eger loop kullanırsanız, eklediginiz eleman en sona eklenir
		// eger loop(döngü kullanmazsanız elemanı başa ekler
		while (i2.hasNext()) {     // atlama yaparak sona gider 
			i2.next();             // bu 2 satır olmazsa başa ekler
		}
			i2.add("T");
			i2.add("V");
			System.out.println(list04); // [X, Y, Z, T, V]
	
			
			
			//ListIterator ile Iterator farkı
			
			List<String>list05 = new ArrayList<>();
			list05.add("XX");
			list05.add("YY");
			list05.add("ZZ");
			// Iterator da hasPrevious() ile prevous yoktu, tek boyuttur
			// Iterator da, add() yoktur bu nedenle yensi eleman eklenemez
			// Iterator da set() yoktur bu nedenle elemanlar guncellenemez
			// her ikisinde de remove() kullanılabilir.
			// Iterator, collection'lardan (map,set ve list) calısabilir, ListIteratorda sadece listleri kullanabiliriz
			
			
			Iterator <String> it2 = list05.iterator();
			
			while(it2.hasNext()) {
			
			System.out.println(list05); // [XX, YY, ZZ]
				
			
		}
	}
}
		
		
		
		
		
	



