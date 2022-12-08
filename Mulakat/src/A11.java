import java.util.ArrayList;
import java.util.List;
public class A11 {
/*  list adında bit List olusturun ve 17,23,11,17,3,5,8,-5,-15 degerlerini List e ekleyin 
 * bunu yaptıktan sonra List içindeki en buyuk ve en kucuk elementi bulun.
 * 
 */
	public static void main(String[] args) {
	
		
		List<Integer> list = new ArrayList<>();
		list.add(17);
		list.add(23);
		list.add(111);
		list.add(17);
		list.add(3);
		list.add(5);
		list.add(8);
		list.add(-35);
		list.add(-15);
		
		System.out.println(list); //[17, 23, 111, 17, 3, 5, 8, -35, -15]

		Collections.sort(list);  //kucukten buyuge sıralar
		System.out.println(list); 
		
		System.out.println(list.get(0)); // en kucuk degeriverir -15
		
		System.out.println(list.get(list.size()-1)); // 111 list in en son yanı en buyuk degerini verir
		
	}

}
