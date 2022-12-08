public class Ogrenci {
	String ID;
	String isim;
	String soyisim;
	double vize1;
	double vize2;
	double donemSonu;
	double finalNotu;
	static int sinifMevcudu=0;

	public Ogrenci(String ID, String isim, String soyisim, double vize1, double vize2, double donemSonu) {
		this.ID = ID;
		this.isim = isim;
		this.soyisim = soyisim;
		this.vize1 = vize1;
		this.vize2 = vize2;
		this.donemSonu = donemSonu;
		sinifMevcudu++;
		System.out.println(ID+ "'li "+isim+ " "+soyisim+ " sinifimiza kaydolmustur. Yeni sinif mevcudumuz "
				+ sinifMevcudu   +   "    olmustur.");
	}

	public static void main(String[] args) {

		Ogrenci ogr1 = new Ogrenci("1001", "Ahmet", "TUFAN", 50, 60, 95);
		Ogrenci ogr2 = new Ogrenci("1002", "Yavuz", "AKGUN", 75, 60, 55);
		Ogrenci ogr3 = new Ogrenci("1003", "Selim", "SUKUR", 95, 85, 92);
		Ogrenci ogr4 = new Ogrenci("1004", "Hurrem", "ERDEM", 65, 65, 98);
		Ogrenci ogr5 = new Ogrenci("1005", "Buket", "KORKMAZ", 95, 70, 70);
		Ogrenci ogr6 = new Ogrenci("1006", "Betul", "OZTURK", 30, 60, 74);
		Ogrenci ogr7 = new Ogrenci("1007", "Hasan", "YILMAZ", 40, 65, 25);
		Ogrenci ogr8 = new Ogrenci("1008", "Kerem", "DEMIR", 66, 99, 55);
		Ogrenci ogr9 = new Ogrenci("1009", "Eysan", "KAYNAK", 98, 70, 60);
		Ogrenci ogr10 = new Ogrenci("1011", "Merve", "IKBAL", 81, 60, 95);
		Ogrenci ogr11 = new Ogrenci("1012", "Hakan", "BURUK", 87, 80, 80);

		Ogrenci[] ogrenciler = { ogr1, ogr2, ogr3, ogr4, ogr5, ogr6, ogr7, ogr8, ogr9, ogr10, ogr11 };
		Ogrenci[] siraliDizi = diziyiSirala(ogrenciler);
	for (int i = 0; i < ogrenciler.length; i++) {
			ogrenciler[i].ogrenciyiNotlandir();
			
		}

	}

	public void ogrenciyiNotlandir() {
		char harfNotu;
		double finalNotu = this.vize1 * 0.25 + this.vize2 * 0.25 + this.donemSonu * 0.5;

		if (finalNotu >= 90) {
			harfNotu = 'A';
		} else if (finalNotu >= 80) {
			harfNotu = 'B';
		} else if (finalNotu >= 70) {
			harfNotu = 'C';
		} else if (finalNotu >= 60) {
			harfNotu = 'D';
		} else
			harfNotu = 'F';

		System.out.println(this.ID + " nolu " + this.isim + " " + this.soyisim + "'in harf notu: " + finalNotu + "'den "
				+ harfNotu);
		System.out.println("Sinifin mevcudu "+ sinifMevcudu);
	}

}
