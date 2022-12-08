
public class Menemen extends Yemek {
	private static String yanUrun;
	String yanUrun1 = "Ekmek";
	
	public Menemen(String[] icerikler, double kalori,int maliyet,int satisFiyati) {
		super(icerikler, kalori, maliyet, satisFiyati, yanUrun);
		
	}
	

	public static void main(String[] args) {
		String [] icerik = {"Domates","Biber","Yumurta","Tereyag"};
		Menemen m1 = new Menemen(icerik,250,21,42);
		m1.pisir();
		System.out.println(zaman);
		
		
	}

}
