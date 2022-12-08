package defaoult;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
public class Market {

	public static void main(String[] args) {
		
		Set<String> marketUrunleri = new HashSet<String>();
		
		marketUrunleri.add("Beyaz Peynir");
		marketUrunleri.add("Zeytin");
		marketUrunleri.add("Beyaz Peynir");   // aynı ismi 2 defa kabul etmez
		marketUrunleri.add("Yumurta");
		marketUrunleri.add("Ekmek");
		marketUrunleri.add("Salam");
		marketUrunleri.add("Pirinc");
		marketUrunleri.add("Mercimek");
		marketUrunleri.add("Sut");
		Iterator<String> iterator = marketUrunleri.iterator();
		
		System.out.println("Elimizdeki market urunleri");
		while(iterator.hasNext())
		{
			String urun = iterator.next().toString();
			System.out.println(urun+ " hash code: "+ urun.hashCode());
		}
		int counter = 0;
		String[] market = new String [marketUrunleri.size()];
		while(iterator.hasNext())
		{
			String urun = iterator.next().toString();
			market[counter] = urun;
			counter++;
		}
	}
		
	}


