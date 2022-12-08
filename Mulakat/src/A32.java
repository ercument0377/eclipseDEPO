import java.util.ArrayList;
import java.util.List;

public class A32 {

	//blistteki çift sayilarin karesini bir boşluk bırakarak
	// yazdıran bir kod yazınız.
	// Lambda kullanarak yapınız.
	
	public static void main(String[] args) {
		
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(131);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);
        System.out.println(l); // [12, 9, 131, 14, 9, 10, 4, 12, 15]
		
        l.stream().filter(t-> t%2 ==0).map(t-> t*t).forEach(t->System.out.print(t+" ")); // 144 196 100 16 144 
		
        
	}

}
