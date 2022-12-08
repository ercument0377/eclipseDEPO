import java.util.*;

public class A17 {

	public static void main(String[] args) {
	
		Character arr [] = new Character[4];
		arr[0]='a';
		arr[1]='b';
		arr[2]='c';
		arr[3]='d';
		
		
		System.out.println(Arrays.toString(arr));  //[a,b,c,d]
		
//1.yol Arrayleriliste cevirmede 
		
		List<Character> c = new  ArrayList <> ();
		
		for(int i=0; i<arr.length; i++) {
			c.add(arr[i]);
		}
		
		c.add('f');
		c.remove(2);  // c de  2. indexi siler
	//	c.clear(); // bütün elemanları siler
		
		System.out.println(c); //[a,b,c,d,f]
	
//2.yol Arrayleriliste cevirmede 
		
		List<Character> c1 = Arrays.asList(arr);
		
		// c1.add('g') ;  // asList oldugu icin hata veriri eklenmez
		// c1.remove(1);  //asList oldugu icin  hata verir silmez
        // c1.clear();    //asList oldugu icin   silmez
		
		System.out.println(c1); //[a,b,c,d]
		
	//List i Array e nasıl cevrilir
		
		List<Integer> list4 = new ArrayList<>();
		
		list4.add(12);
		list4.add(1);
		list4.add(6);
		list4.add(32);
		System.out.println(list4); //[12,1,6,32]
		
		Integer arr2[] = list4.toArray(new Integer[0]);   //listi Array e ceviriyor
		System.out.println(Arrays.toString(arr2));      // [12,1,6,32]
		
		
		// set() ==>  elemanı silip yerine yeni bir eleman ekler
		
		list4.set(2, 8);  // 2.indexi siler yerine 8 yazar
		
		System.out.println(list4); // [12,1,8,32]
		
// List veya ArrayList e bir eleman nasıl guncellenir veya silinir
		
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Ali");
		list1.add("Veli");
		list1.add("Bahar");
		list1.add("Kaan");
		list1.add("Leyla");
		list1.add("Onur");
		
		System.out.println(list1);                   // [Ali,Veli,Bahar,Kaan,Leyla,Onur]
		list1.remove(list1.indexOf("Kaan"));          // list1 deki kaan ı siler
		list1.set(list1.indexOf("Leyla"), "Mustafa");  //list1 deki leylayı mustafa ile değiştirir
		
		
		System.out.println(list1);            // [Ali,Veli,Bahar,Mustafa,Onur]
		
		
		
		
		
		
	}

}
