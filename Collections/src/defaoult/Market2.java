package defaoult;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
public class Market2 {

	public static void main(String[] args) {
		
		Map<String, Double> marketUrunleri = new HashMap<String, Double>();
		
		marketUrunleri.put("Beyaz Peynir", 25.0);
		marketUrunleri.put("Zeytin", 85.0);
		marketUrunleri.put("Beyaz Peynir", 50.0);   // aynı ismi 2 defa kabul etmez
		marketUrunleri.put("Yumurta", 60.0);
		marketUrunleri.put("Ekmek", 56.0);
		marketUrunleri.put("Salam", 90.0);
		marketUrunleri.put("Pirinc", 45.0);
		marketUrunleri.put("Mercimek", 85.0);
		marketUrunleri.put("Sut", 15.0);
		
		Set urunlerSeti = marketUrunleri.entrySet();
		Iterator iterator = marketUrunleri.iterator();
		
		System.out.println("Elimizdeki market urunleri");
		while(iterator.hasNext())
		{
			String urun = iterator.next().toString();
			System.out.println(urun);
		}
		int counter = 0;
		String[] market = new String [marketUrunleri.size()];
		while(iterator.hasNext())
		{
			String urun = iterator.next().toString();
			market[counter] = urun;
		//	counter++;
		}
	double fiyat = marketUrunleri.get("Ekmek");
	System.out.println(fiyat);
	}
		
	}


