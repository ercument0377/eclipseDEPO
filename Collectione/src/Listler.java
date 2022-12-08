import java.util.LinkedList;
public class Listler {

	public static void main(String[] args) {
		LinkedList<Integer> sayiListesi = new LinkedList<Integer>();
		
		sayiListesi.add(20);  // diziye sayı ekler eklenen her zaman en sona atar
		sayiListesi.add(15);  // diziye sayı ekler her zaman en sona atar
		sayiListesi.add(1,19);  // 1.indexe 19 u ekler
		
		sayiListesi.getLast();  // listenin sonuncu elemanı verir
		sayiListesi.getFirst(); //listenin ilk elemanı demek 
		
		for(int i=0; i<sayiListesi.size(); i++)
		{
			System.out.println("Listemizin "+i+" . elemani: "+ sayiListesi.get(i)); // listedeki elemanları yazdırır
		}
		System.out.println("Listemizin ilk elemani : "+sayiListesi.getFirst()); // Listemizin ilk elemani : 20

		System.out.println("Listemizin sonuncu elemani : "+sayiListesi.getLast()); // Listemizin sonuncu elemani : 15
		
		System.out.println("Listemizin 15 elemaninin bulundugu yer : "+sayiListesi.indexOf(15)); //Listemizin 15 elemaninin bulundugu yer : 2
	//	int[] sayilar = 0,1,2,3,4,5,6,7,8,9,10};
		
	//	System.out.println(sayilar[4]); // dizideki 4. sayiyi getirir
		
	//	System.out.println(sayilar.length); //  dizide kaç tane eleman sayısı olduğunu gösterir 
		
		
		
	}
	public static void diziyeElemanEkle(int[] dizi,int eklenecekSayi) 
	{
		int[] yeniDizi = new int[dizi.length +1];
		for (int i=0; i<dizi.length; i++) {
			yeniDizi[i] = dizi[i];
		}
		yeniDizi[dizi.length] = eklenecekSayi;
		return yeniDizi;
		
	}
}

/*
 * Arraylar
 * 1. hızlı erisim sağlarlar
 * 2. her zaman doludurlar
 * 3. değişime kapalıdırlar.(uzunlugunu değiştirmek, araya eleman sokmak olmaz)
 * 4. Basit yapıdadırlar.
 * 5. hafızada diğer koleksiyonlara göre daha az yer kaplarla
 * 
 * LinkedList
 * 1. yavaş erişim sağlarlar
 * 2. uzunluğu değişkendir. Araya başka eleman eklenebilir
 * 3. değişime açıktır
 * 4. daha fonksiyoneldir
 * 5. hafızada daha çok yer kaplar
 * 
 * 
 * ArrayList  (Array ile LinkedList in olumlu özelliklerinin toplanması)
 * hızlı erişim sağlarla
 * uzunluğu değişkendir. araya başka eleman eklenebilir
 * değişime açıktır
 * daha fonksiyoneldir
 * hafızada çok yer kaplar 
 * 
 */
 
