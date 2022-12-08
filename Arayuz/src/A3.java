
public class A3  implements Mekanik{
	public static final double lastikCapi =17;
	String renk;
	int koltukSayisi;
	double motorHacmi;
	String yakitTuru;
	int fiyat;
	boolean hizSabitleyici;
	
	
	@Override
	public void boya(String renk) {
		this.renk = renk;
		System.out.println("2.kalite boya kullanildi");
	}

	@Override
	public void setKoltukSayisi() {
		this.koltukSayisi = 5;
	}
	
	@Override
	public void setMotorHacm() {
		this.motorHacmi = 1.6;
		
	}
	
	@Override
	public void setYakitTuru(String yakitTuru) {
		this.yakitTuru = yakitTuru;
		
	}
	
	public boolean testEt()
	{
		System.out.println("80 km test surusu yapildi");
		return true;
	}
	public void satisFiyatiBelirle()
	{
		this.fiyat = 800;
		
	}
	public void hizSabitleyici(boolean isteniyorMu)
	{
		if(isteniyorMu){
		this.hizSabitleyici=true;
		this.fiyat+=8;
	}else
		this.hizSabitleyici=false;
	}
		
	
	
	public static void main(String[] args) {
		

	}

}
/* Inheritance
 * Ortak kullanıma method ozellik aciyorsunuz
 * tek bir sınıf extends edilebiliyor
 * 
 * 
 * 
 * Abstract
 * tek bir sınıf extends edilebiliyor
 * 
 * 
 * 
 * 
 * Interface
 * Methodların isimleri veriyorsunuz, sınıflardan methodları doldurmasını istiyorsunuz
 * tek bir sınıf implements edilebiliyor
 * 
 * ssssss
 * */
