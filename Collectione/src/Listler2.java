import java.util.ArrayList;

public class Listler2 {

	public static void main(String[] args) {
		ArrayList<Integer> sayiListesi = new ArrayList<Integer>();
		
		sayiListesi.add(10);    // diziye sayı ekler eklenen her zaman en sona atar
		sayiListesi.add(5);     // diziye sayı ekler her zaman en sona atar
		sayiListesi.add(1,9);  // 1.indexe 19 u ekler
		sayiListesi.add(5);
		sayiListesi.add(9);
		sayiListesi.add(8);
		sayiListesi.add(5);
		
		arrayListYazdir(sayiListesi);
	}
public static void arrayListYazdir(ArrayList<Integer>alist) {
	for (int i=0; i < alist.size(); i++) {
		System.out.println("Dizideki " + (i + 1) + " . eleman: " +alist.get(i) );
		
	}
}
}
