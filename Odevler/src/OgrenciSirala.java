public class OgrenciSirala {
	String ID;
	String isim;
	String soyisim;
	double vize1;
	double vize2;
	double donemSonu;
	double finalNotu;
	char harfNotu;

	public OgrenciSirala(String ID, String isim, String soyisim, double vize1, double vize2, double donemSonu) {
		this.ID = ID;
		this.isim = isim;
		this.soyisim = soyisim;
		this.vize1 = vize1;
		this.vize2 = vize2;
		this.donemSonu = donemSonu;
	}

	public static void main(String[] args) {

		OgrenciSirala ogr1 = new OgrenciSirala("1001", "Ahmet", "TUFANLI", 50, 60, 95);
		OgrenciSirala ogr2 = new OgrenciSirala("1002", "Yavuz", "AKGUN", 75, 60, 55);
		OgrenciSirala ogr3 = new OgrenciSirala("1003", "Selim", "SUKURLU", 95, 85, 92);
		OgrenciSirala ogr4 = new OgrenciSirala("1004", "Hurrem", "ERDEM", 65, 65, 98);
		OgrenciSirala ogr5 = new OgrenciSirala("1005", "Buket", "KORKMAZ", 95, 70, 70);
		OgrenciSirala ogr6 = new OgrenciSirala("1006", "Betul", "OZTURK", 30, 60, 74);
		OgrenciSirala ogr7 = new OgrenciSirala("1007", "Hasan", "YILMAZ", 40, 65, 25);
		OgrenciSirala ogr8 = new OgrenciSirala("1008", "Kerem", "DEMIR", 66, 99, 55);
		OgrenciSirala ogr9 = new OgrenciSirala("1009", "Eysan", "KAYNAK", 98, 70, 60);
		OgrenciSirala ogr10 = new OgrenciSirala("1011", "Merve", "IKBAL", 81, 60, 95);
		OgrenciSirala ogr11 = new OgrenciSirala("1012", "Hakan", "BURUK", 87, 80, 80);

		OgrenciSirala[] ogrenciler = { ogr1, ogr2, ogr3, ogr4, ogr5, ogr6, ogr7, ogr8, ogr9, ogr10, ogr11 };

		for (int i = 0; i < ogrenciler.length; i++) {
			ogrenciler[i].ogrenciyiNotlandir();
		}
		ogrenciler = ogrencileriSirala(ogrenciler);
		ogrencileriYazdir(ogrenciler);
	}

	public static void ogrencileriYazdir(OgrenciSirala[] ogrenciler) {
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println((i + 1) + ". ogrenci: " + ogrenciler[i].finalNotu + " notu ile " + ogrenciler[i].ID
					+ " nolu " + ogrenciler[i].isim + " " + ogrenciler[i].soyisim +"\t "+ ogrenciler[i].harfNotu+ "  aldi.");
		}
	}

	public void ogrenciyiNotlandir() {
		char harfNotu;
		double finalNotu = this.vize1 * 0.25 + this.vize2 * 0.25 + this.donemSonu * 0.5;
		this.finalNotu = finalNotu;
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
		this.harfNotu = harfNotu;
		

	}

	public static OgrenciSirala[] ogrencileriSirala(OgrenciSirala[] ogrenciler) {
		for (int j = 0; j < ogrenciler.length; j++) {
			OgrenciSirala enBuyuk = ogrenciler[j];
			int enBuyukIndex = j;
			for (int i = j; i < ogrenciler.length; i++) {
				if (ogrenciler[i].finalNotu > enBuyuk.finalNotu) {
					enBuyuk = ogrenciler[i];
					enBuyukIndex = i;
				}
			}
			ogrenciler[enBuyukIndex] = ogrenciler[j];
			ogrenciler[j] = enBuyuk;
		}
		return ogrenciler;
	}

}