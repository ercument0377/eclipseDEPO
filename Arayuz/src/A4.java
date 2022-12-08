
public class A4  implements Mekanik, Guvenlik{
	
	String renk;
	int koltukSayisi;
	double motorHacmi;
	String yakitTuru;
	int fiyat;
	boolean sunRoof;
	boolean hizSabitleyici;
	double lastikCapi;
	
	@Override
	public void boya(String renk) {
		this.renk = renk;
		System.out.println("1.kalite boya kullanildi");
	}

	@Override
	public void setKoltukSayisi() {
		this.koltukSayisi = 5;
	}
	
	@Override
	public void setMotorHacm() {
		this.motorHacmi =2.0;
		
	}
	
	@Override
	public void setYakitTuru(String yakitTuru) {
		this.yakitTuru = yakitTuru;
		
	}
	@Override
	public boolean testEt()
	{
		System.out.println("100 km test surusu yapildi");
		return true;
	}
	@Override
	public void satisFiyatiBelirle()
	{
		this.fiyat = 1000;
		
	}
	public void sunRoof()
	{
		this.sunRoof = true;
		this.fiyat+=50;
		
	}
	public void lastikCapi(double cap) {
		this.lastikCapi = cap;
	}
	@Override
	public void hizSabitleyici(boolean isteniyorMu)
	{
		if(isteniyorMu){
		this.hizSabitleyici=true;
		this.fiyat+=10;
	}else
		this.hizSabitleyici=false;
	}
	@Override
	public void seritTakip() {
		
	}
	@Override
	public void parkSensor() { 
		
	}
	@Override
	public void yolcuAirbag() {
		
	}
	@Override
	public void soforAirbag() { 
		
	}
	@Override
	public void yokusDestek() { 
		
	}
	
	
	
	public static void main(String[] args) {
		A4 araba1 = new A4();
		A4 araba2 = new A4();
		araba2.testEt();
		araba2.soforAirbag();
		
		
		

	}

}
