import java.util.ArrayList;

public class Calisan {
	
	
	String isim;
	String soyisim;
	String TCNo;
	String sicilNo;
	String gorev;
	double maas;
	String baslangicTarihi;
	boolean primVarMi;
	
	//bos construktor
	public Calisan()
	{
			
	}
	
	// tam dolu construktor
	public Calisan(String isim, String soyisim, String TCNo,String sicilNo, 
			String gorev, double maas, String baslangicTarihi, boolean primVarMi)
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.TCNo = TCNo;
		this.sicilNo = sicilNo;
		this.gorev = gorev;
		this.maas = maas;
		this.baslangicTarihi = baslangicTarihi;
		this.primVarMi = primVarMi;
	}
	
	//Eksik construktor
	public Calisan(String isim, String soyisim,String sicilNo, 
			 double maas, String baslangicTarihi)
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.sicilNo = sicilNo;
		this.maas = maas;
		this.baslangicTarihi = baslangicTarihi;
	}
	
	public static void main(String[] args) {
		Calisan c001= new Calisan ("Burak", "YILMAZ", "1111111111", "001", "Mekanik",
				25000, "01.01.2022", true);
		Calisan c002= new Calisan ("Hande", "YENER","002",15000, "01.01.2022");
		Calisan c003= new Calisan ("Arda", "TURAN", "11111222", "003", "Yikamaci",
				8000, "01.09.2022", true);
		
		System.out.println("Maas artirimindan once");
		System.out.println(" Calisan sicil no: "+ c001.sicilNo +". Calisan maasi: "+c001.maas);
		System.out.println(" Calisan sicil no: "+ c002.sicilNo+". Calisan maasi: "+c002.maas);
		System.out.println(" Calisan sicil no: "+c003.sicilNo +". Calisan maasi: "+c003.maas);
		
		/*c001.maas = c001.maas * 1.25;    // bu sekilde de zam yapılabilir
		c002.maas = c002.maas * 1.25;
		c003.maas = c003.maas * 1.25;
		
		System.out.println("\n Maas artirimindan sonra \n");
		System.out.println(" Calisan sicil no: "+ c001.sicilNo +". Calisan maasi: "+c001.maas);
		System.out.println(" Calisan sicil no: "+ c002.sicilNo+". Calisan maasi: "+c002.maas);
		System.out.println(" Calisan sicil no: "+c003.sicilNo +". Calisan maasi: "+c003.maas);
		*/
		c002.TCNo = "22222222222";
		c002.gorev = "Resepsiyonist";
		c002.primVarMi = false;
		
		Calisan[] calisanArrayi = {c001, c002, c003};
		
		for ( int i=0; i < calisanArrayi.length; i++) {
			//calisanArrayi[i].maas *=1.25;  // butun calisanlara tek seferde zaam yapar
			switch(calisanArrayi[i].gorev)
			{
				case("Yikamaci"):
				{
					calisanArrayi[i].maas *= 1.50;
					break;
				}
				case("Mekanik"):
				{
					calisanArrayi[i].maas *= 1.20;
					break;
				}
				case("Resepsiyonist"):
				{
					calisanArrayi[i].maas *= 1.40;
					break;
				}
			}
		}
		System.out.println("\n Maas artirimindan sonra \n");
		System.out.println(" Calisan sicil no: "+ c001.sicilNo +". Calisan maasi: "+c001.maas);
		System.out.println(" Calisan sicil no: "+ c002.sicilNo+". Calisan maasi: "+c002.maas);
		System.out.println(" Calisan sicil no: "+c003.sicilNo +". Calisan maasi: "+c003.maas);
	}
		public static void calisanYazdir(ArrayList<String>calisan) {
			for (int i=0; i < calisan.size(); i++) {
				
				System.out.println("Dizideki " + (i + 1) + " . eleman: " +calisan.get(i) );
		
	}
}
}