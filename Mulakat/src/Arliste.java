import java.util.ArrayList;
import java.util.Collections;
import java.util.Array;
	import java.util.List;
public class Arliste {

		/*
		 * Array listlerin boyutları esnektir, değiştirilebilir
		 * ArrayListler sadece non-primitiveleri (Wropper class veya Strin) depolayabilir.
		 */

		public static void main(String[] args) {
			//Bir ArrayList nasıl olusturulur.
			
			
			//1. yol
			ArrayList <Integer> list1 = new ArrayList<Integer>();
			//2.yol
			ArrayList <Integer> list2 = new ArrayList<>();
			//3.yol
			List <String> list3 = new ArrayList<String>();
			//4.yol
			List <String> list4 = new ArrayList<>();
			list3.add("Zeynep");
			list3.add("Fatma");
			
			list4.add("Ali");     // eleman ekler
			list4.add("Veli");
			list4.add("Ayse");
			list4.add("Yilmaz");
			
			
			System.out.println(list4);//[Ali,Veli,Ayse,Yilmaz]
			
			list4.add(1,"Ahmet"); //1.indexe Ahmet i ekler 
			System.out.println(list4); //[Ali,Ahmet,Veli,Ayse,Yilmaz]
			list4.addAll(1,list3); //1. index e bir listenin tamamı eklenir 
			
			System.out.println(list4); //[Ali,Zeynep,Fatma,Ahmet,Veli,Ayse,Yilmaz]
			
			Collections.sort(list4); //kucukten buyuge sıralar
			System.out.println(list4); //[Ahmet,Ali,Ayse,Fatma,Veli,Yilmaz,Zeynep]
			
			
			Collections.sort(list4,Collections.reverseOrder()); //buyukten kucuge sıralar
			System.out.println(list4);  // [Zeynep,Yilmaz,Veli,Fatma,Ayse,Ali,Ahmet]
			
			
			// Spesifik bir elemanı yazdırmak için 
			System.out.println(list4.get(1)); //list4 un 1. elemanını yazdırır
			
			// Arrayda kaç eleman oldugunu yazdırmak için
			System.out.println(list4.size()); //list4 un kaç tane elemeanı var eleman sayısını yazdırı
			
			
			
			
			
			
		}

	}

