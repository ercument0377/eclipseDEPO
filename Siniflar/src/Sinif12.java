
public class Sinif12 {

	String ID;
	String isim;
	String soyisim;
	double not;
	double vize1;
	double vize2;
	double donemSonu;
	

		public void Ogrenci(String ID,String isim, String soyisim, double not,
				 double vize1, double vize2,  double donemSonu)
		{
		this.ID = ID;
		this.isim = isim;
		this.soyisim = soyisim;
		this.vize1 = vize1;
		this.vize2 = vize2;
		this.donemSonu = donemSonu;
		}
		
		

	public static void main(String[] args) {
		
		Ogrenci ogr01 = new Ogrenci ("1001","Ercan", "ER", 50,60,95);
		Ogrenci ogr02 = new Ogrenci ("1002","Bahar", "Toprak", 95,90,95);
		Ogrenci ogr03 = new Ogrenci ("1003","Nigar", "Pinar", 85,80,90);
		Ogrenci ogr04 = new Ogrenci ("1004","İlyas", "Tokat", 75,70,80);
		Ogrenci ogr05 = new Ogrenci ("1005","Eren", "Emreh", 100,100,100);
		Ogrenci ogr06 = new Ogrenci ("1006","Hayri", "Toplu", 45,55,65);
		Ogrenci ogr07 = new Ogrenci ("1007","Ayşe", "Cicek", 60,75,85);
		Ogrenci ogr08 = new Ogrenci ("1008","Fatma", "Yilmaz", 70,80,85);
		
		Ogrenci[] ogrenciler = {ogr01,ogr02,ogr03,ogr04,ogr05,ogr06,ogr07,ogr08  };
		
		for(int i=0; i<ogrenciler.length; i++)
		{
			ogrenciler[i].ogrenciyiNotlandir();
		}
		
	}
	public void ogrenciyiNotlandir() {
	    char harfNotu;
		double finalNotu = this.vize1*0.25+this.vize2*0.25+this.donemSonu*0.5;
		if( donemSonu>=90) {
			harfNotu = 'A';
		}
		else if (finalNotu>=80){
			harfNotu: 'B';
		}
		else if (finalNotu>=70){
			harfNotu: 'C';
		}
		else if (finalNotu>=60){
			harfNotu: 'D';
		}
		else 
		{
			harfNotu: 'F';
			
			System.out.println(this.ID+" nolu"+this.isim+" "+this.soyisim+"'in harf notu: "+
			this.finalNotu+ " den "+ harfNotu);
		}
	}
}


	
	
