
public class Corba extends Yemek {
	String yanUrun = "Limon";
	String  ad;

	
	public Corba(String[] icerikler, double kalori,int maliyet,int satisFiyati,String ad) {
		super(icerikler, kalori, maliyet, satisFiyati, ad);
		this.ad = ad;
	}
	

	public static void main(String[] args) {
		String [] icerik = {"Mercimek","Patates","Yarma","Baharatlar"};
		Corba mercimekCorbasi = new Corba(icerik,100,18,35,"Mercimek corbasi");
		mercimekCorbasi.pisir();
		
		
		String [] icerik2 = {"Domates","Biber","Yumurta","Tereyag"};
		Menemen m1 = new Menemen(icerik,250,21,42);
		m1.pisir();
		System.out.println(zaman);
		
	}
	

}
	
	

