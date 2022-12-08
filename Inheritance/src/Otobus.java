
public class Otobus extends Arac {  //subsclass, alt sınıf
	public String renk;
	
	public Otobus(String marka, int model, String renk) {
		super(marka, model);   //arac sınıfındaki marka model gelir
		this.renk = renk;
	}

	public static void main (String[] args) {
		Otobus otobus = new Otobus("Mercedes",2020,"Siyah");
		otobus.marka = "Mercedes";
		otobus.model = 2000;
		otobus.renk= "Siyah";
		
		otobus.kornayaBas(); // HOOONNK HONNKK Arac sınıfından alıyor ortak olarak
		
	}
	public void otobusuBoya(String renk) {
		this.renk = renk;
	}

}
