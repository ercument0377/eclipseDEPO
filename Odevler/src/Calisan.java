import java.util.*;

public class Calisan {
	
	
	String isim;
	String soyisim;
	int sicilNo;
	
	static ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
	
	// tam dolu construktor
	public Calisan(String isim, String soyisim,int sicilNo)
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.sicilNo = sicilNo;
		calisanlar.add(this); //olusturulan nesneler dogrudan arraye gönderilir

	}
	
public static void main(String[] args) {
	
		new Calisan("Burak", "YILMAZ", 1001);
		new Calisan("Hande", "YENER",1002);
		new Calisan("Arda", "TURAN",1003);
		new Calisan("Mustafa", "MUTLU",1004);
		new Calisan("Hayri", "Yoksul",1005);
		new Calisan("Ayse", "Tiknaz",1006);
		new Calisan("Baris", "Barlas",1007);
		new Calisan("Ebru", "Coban",1008);
		new Calisan("Bahar", "Pinar",1009);
		new Calisan("Burhan", "Danis",1010);
		
		calisanYazdir();
		
		}
	
		public static void calisanYazdir() {
		for (int i=0; i < calisanlar.size(); i++) {
			
		System.out.println(calisanlar.get(i).sicilNo + " nolu calisanin adi soyadi :  "+
			 calisanlar.get(i).isim +" "+  calisanlar.get(i).soyisim );
		
		
	}
}
}