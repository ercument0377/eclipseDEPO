import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Istisnalar08 {

	public static void main(String[] args) {
		// IllegalStateException
		// eger bir method uygun olmayan bir zamanda (yerde) kullanırsak bize IllegalStateException hatası verir
		
		List<Integer>liste = new ArrayList<>();
		liste.add(21);
		liste.add(22);
		liste.add(23);
		System.out.println(liste);  // [21, 22, 23]
		
		Iterator <Integer> itr = liste.iterator();  // [  21,  22,  23]
	//	itr.next();  // bizi bir sonraki satıra götürür.
		itr.remove();  // bunu kullanmak için öncesinde mutlaka "itr.next();" kullanmak gerekir
		
		
		
	}

}
