import java.util.LinkedList;
import java.util.ArrayList;
public class Listler1 {

	public static void main(String[] args) {
		ArrayList<Integer> sayiListesi = new ArrayList<Integer>();
		
		sayiListesi.add(10);  // diziye sayı ekler eklenen her zaman en sona atar
		sayiListesi.add(5);  // diziye sayı ekler her zaman en sona atar
		sayiListesi.add(1,9);  // 1.indexe 19 u ekler
		sayiListesi.add(5);
		sayiListesi.add(9);
		sayiListesi.add(8);
		sayiListesi.add(5);
		
		arrayListYazdir(sayiListesi);
	}
	//	sayiListesi.lastIndexOf(5);  // en son 5 in bulunduğu index i verir  
		
		//sayiListesi.clear(); // listesi tamamen temzilemekde kullanılır

	
	/*	for (int i=0; i< 11; i++) {
			if (sayiListesi.contains(i)) {
				System.out.println("Listede " + i + " sayisinin yeri : "+ sayiListesi.indexOf(i));
			}else
				System.out.println("Listede " + i + " sayisinin yok");
		}
		System.out.println(sayiListesi);                //[10, 9, 5, 5, 9, 8, 5]
		System.out.println(sayiListesi.lastIndexOf(5)); //6
	}*/
public static void arrayListYazdir(ArrayList<Integer>alist) {
	for (int i=0; i < alist.size(); i++) {
		System.out.println("Dizideki " + (i + 1) + " . eleman: " +alist.get(i) );
		
	}
}
}
