
public class Odev11 {
	
	String isim;
	String soyisim;
	String TCNo;
	String bolum;
	double notOrtalamasi;
	
	
	public Ogrenci()
	{
			
	}
	//constructor
		public Ogrenci(String isim, String soyisim, String TCNo,String bolum, double notOrtalamasi )
		{
		this.isim = isim;
		this.soyisim = soyisim;
		this.TCNo = TCNo;
		this.bolum = bolum ;
		this.notOrtalamasi = notOrtalamasi;		
		}
		public static void main(String[] args) {
		
		Ogrenci ogr1 = new Ogrenci ("Ercan", "ER", "123456789", "Hukuk Fak." ,3.5);
		Ogrenci ogr2 = new Ogrenci ("Burcu", "YILMAZ", "258456789", "Uluslar Arasi İliskiler",4.0);
		Ogrenci ogr3 = new Ogrenci ("Duru", "DURMAZ", "1258656789", "Tip Fak.",4.5 );
		Ogrenci ogr4 = new Ogrenci ("Emrah", "CETIN", "123474189", "Dis Hekimligi",3.0 );
		Ogrenci ogr5 = new Ogrenci ("Ahmet", "CALISKAN", "123451209", "Psikoloji",2.5 );
		Ogrenci ogr6 = new Ogrenci ("Burak", "KORKMAZ", "123456987", "İngilizce Ogretmenligi",3.75);
		Ogrenci ogr7 = new Ogrenci ("Bahar", "PINARCI", "1234563214", "Tip Fak.",4.0 );
		
		Ogrenci[] ogrenciler = { ogr1, ogr2, ogr3, ogr4, ogr5, ogr6, ogr7};
	
		Ogrenci[] siraliDizi = diziyiSirala(ogrenciler);
		
		for (int i = 0; i < siraliDizi.length; i++) {
			System.out.println((i+1)+" .ogrenci :"+siraliDizi[i].isim+ siraliDizi[i].soyisim
					+" ortalamasi "+ siraliDizi[i].notOrtalamasi);
		}
		
		}
		
		public static Ogrenci[] diziyiSirala(Ogrenci[] dizi) {
		
		for(int j=0; j<dizi.length; j++) {
			Ogrenci enBuyuk = dizi[j];
			int enBuyukIndex = j;
		for (int i = j; i < dizi.length; i++) {
			if (dizi[i].notOrtalamasi > enBuyuk.notOrtalamasi ) {
				enBuyuk = dizi[i];
			    enBuyukIndex = i;
		 }
		}
		dizi[enBuyukIndex] = dizi[j];
		dizi[j] = enBuyuk;
		}

		return dizi;
		
		
		}
		
	}

	

	
	

	


		
		
	
	


