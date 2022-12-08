import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
public class B1 {

	public static void main(String[] args) {
		
		List<String>list01 = new ArrayList<>();
		
		list01.add("Tom");
		list01.add("Ali");
		list01.add("Canan");
		
		
		
		System.out.println(list01);  //[Tom, Ali, Canan]
		
		for (String w:list01) {
			w = w+"*";
		}
	
		System.out.println(list01);   //[Tom, Ali, Canan]
		
		// loop (döngü) kullanarak, collection'ların elemanlarını GÜNCELEYEMEYİZ
		
		ListIterator<String>listItr = list01.listIterator(); // [     Tom,      Ali,       Canan]
		
		
		while(listItr.hasNext()) {
			String element =listItr.next()+ "* ";
			
			System.out.print(element);  // Tom* Ali* Canan*
		}
		
		
	}

}
