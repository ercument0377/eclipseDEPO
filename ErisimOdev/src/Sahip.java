
public class Sahip {
	
	
	private String isim;
	private String soyisim;
	private int yas;
	private Kedi[] kediler;
	private Kopek[] kopekler;
	private double mamaMiktari=30.0;
	
		
//Accessors isim
	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}
	//Accessors soyisim
	public String getSoyisim() {
		return soyisim;
	}

	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	//Accessors yas
	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	//Accessors krdiler
	public Kedi[] getKediler() {
		return kediler;
	}

	public void setKediler(Kedi[] kediler) {
		this.kediler = kediler;
	}
	//Accessors kopekler
	public Kopek[] getKopekler() {
		return kopekler;
	}

	public void setKopekler(Kopek[] kopekler) {
		this.kopekler = kopekler;
	}
	//Accessors mamamiktari
	public double getMamaMiktari() {
		return mamaMiktari;
	}

	public void setMamaMiktari(double mamaMiktari) {
		this.mamaMiktari = mamaMiktari;
	}

	public static void main(String[] args)
	{
		Sahip kisi = new Sahip();
		kisi.setIsim("Mehmet Ali");
		kisi.setSoyisim("Erbil");
		kisi.setYas(50);
		kisi.setKediler(new Kedi[2]);
		kisi.setKopekler(new Kopek[2]);
		kisi.setMamaMiktari(50.0);
		
		
		Kedi tekir = new Kedi("Tekir",1,kisi);
		Kedi minnos = new Kedi("Minnos",2,kisi);
		Kedi pamuk = new Kedi("Pamuk",3,kisi);
		Kedi kasap = new Kedi("Kasap",1,kisi);
		
		
		Kopek coni = new Kopek("Coni", 1, kisi);
		Kopek sariKiz = new Kopek("SariKiz", 4, kisi);
		Kopek gece = new Kopek("Gece", 3, kisi);
		Kopek sivriDis = new Kopek("SivriDis", 5,kisi);
		
		kisi.hayvanBesle(tekir);
		kisi.hayvanBesle(minnos);
		kisi.hayvanBesle(coni);
		
		kisi.hayvanBesle(sariKiz);
		kisi.hayvanBesle(tekir);
		kisi.hayvanBesle(pamuk);
	}
	
	public void hayvanBesle(Kedi beslenecekKedi){
		this.setMamaMiktari(this.getMamaMiktari()-0.1);
	System.out.println(beslenecekKedi.getIsim()+ " doydu. Yeni mama miktarimiz "+this.getMamaMiktari());
	this.hayvanKonus(beslenecekKedi);
	}
	public void hayvanBesle(Kopek beslenecekKopek)
	{
		this.setMamaMiktari(this.getMamaMiktari()-0.3);
	System.out.println(beslenecekKopek.getIsim()+ " doydu. Yeni mama miktarimiz "+this.getMamaMiktari());
	this.hayvanKonus(beslenecekKopek);
	}
	
	public void hayvanKonus(Kedi konusacakKedi)
	{
		System.out.println(konusacakKedi.getIsim()+ "  dedi ki, Miyav");
	}
	public void hayvanKonus(Kopek konusacakKopek)
	{
		System.out.println(konusacakKopek.getIsim()+ "  dedi ki, Hav HAv");
	}
	
}


