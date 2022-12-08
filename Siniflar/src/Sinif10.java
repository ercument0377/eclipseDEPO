
public class Sinif10 {
	String isim;
	String soyisim;
	String TCNo;
	String sicilNo;
	String gorev;
	double maas;
	String baslangicTarihi;
	boolean primVarMi;
	
	public void calisan(String isim, String soyisim, String TCNo,String sicilNo, 
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
	
	public static void main(String[] args) {
		Calisan c001= new Calisan ("Burak", "YILMAZ", "1111111111", "001", "Mekanik",25000, "01.01.2022", true);
		Calisan c002= new Calisan ("Hande", "YENER","25482358125","002","Recepsiyonist",15000,"01.01.2022",true);
		Calisan c003= new Calisan("Arda", "TURAN", "11111222","003", "Yikamaci",8000, "01.09.2022", true);
	
		
		
		
		Calisan[] calisanlar = {c001,c002,c003};
		// zam yapmak
		for (int i=0; i<calisanlar.length; i++ ) {
			calisanlar[i].maas =  calisanlar[i].maasaZamYap(1.75);
		}
		
		
		/*for (int i=0; i<calisanlar.length; i++ )
		{
			calisanlar[i].calisaniYazdir();
			System.out.println("");
		}*/
		
		//dokumunu yazdir
		calisaniYazdir(c001);
		System.out.println();
		calisaniYazdir(c002);
		System.out.println();
		calisaniYazdir(c003);
		System.out.println();
		
	}
	
	public double maasaZamYap(double oran)
	{
		return this.maas * oran;
	}
	 public static void calisaniYazdir(Calisan calisan) {
		System.out.println("calisanin Adi: "+calisan.isim);
		System.out.println("calisanin soy Adi: "+calisan.soyisim);
		System.out.println("calisanin tcno: "+calisan.TCNo);
		System.out.println("calisanin tcno: "+calisan.sicilNo);
		System.out.println("calisanin gorevi: "+calisan.gorev);
		System.out.println("calisanin maasi: "+calisan.maas);
		System.out.println("calisanin baslangicTarihi: "+calisan.baslangicTarihi);
		System.out.println("calisanin pirimVarMi: "+calisan.primVarMi);
		
	}
	
		
}
