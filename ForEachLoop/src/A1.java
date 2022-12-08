import java.util.ArrayList;
import java.util.List;

public class A1 {

	public static void main(String[] args) {
		
		List<Character> list1 = new ArrayList<>();
		
		list1.add('a');
		list1.add('b');
		list1.add('c');
		list1.add('d');
		list1.add('e');
		list1.add('g');
		list1.add('t');
		
		System.out.println(list1); //[a, b, c, d, e, g, t]
		
		//1.yol for-loop yani for döngüsü ile ekleme yapılabilir 
		for(int i=0;i<list1.size(); i++) {
		//	System.out.print(list1.get(i)+ " ! "); //a ! b ! c ! d ! e ! g ! t ! 
			
			System.out.print(list1.get(i)+ "" +list1.get(i)+" "); //aa bb cc dd ee gg tt 
		}
		
		System.out.println();
		
		// 2. yol for-each loop ile ekleme de yapılabilir
		
		for (Character w:list1 ) {
			System.out.print(w+ "!!! "); //a!!! b!!! c!!! d!!! e!!! g!!! t!!! 
			
			
		}
		System.out.println();
		
		// listedeki sadece ünsüz olan karakterleri yazdırın.
		for (Character w:list1) {
			if (w=='a' || w=='e' || w=='i' || w=='o' || w=='u'  ) {
				continue;
				
			}
			System.out.print(w+ "? "); //b? c? d? g? t? 
			
		}
		System.out.println();
		
		// listeki tum karakterlerin ASCII degerlerini yazdırın
		// a:      b: 
		
		for (Character asgideger:list1) {
			System.out.print(asgideger+":"+ (int)asgideger+" "  ); //a:97 b:98 c:99 d:100 e:101 g:103 t:116 
			
		}
		System.out.println();
		
		//listeki butun elemanların ASGI degerlerini toplayan bir kod yazınız
		
		int toplam =0;
		for (Character asgideger:list1) {
			toplam += asgideger;
			System.out.print(toplam); //97195294394495598714
		}
			System.out.println();
			
			// for - each loop icin Array'lerde kullanilabilir.
			
			String s [] = { "Ahmet","Mehmet", "Olcay", "Fatma"};
			
			for (String w:s) {
				if (!w.endsWith("y")) {        // sonu y ile bitmeyenler 
					System.out.print(w+ " "); //  Ahmet Mehmet Fatma 
					
					
				}
			}
	}
}
				
				
			
	

			
			
		
		
			
		
		

	


