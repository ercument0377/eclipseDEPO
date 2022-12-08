
public class Mudur {
	
	
	public String isim;
	public String soyisim;
	private String TCNo;
	public String sicilNo;
	private double maas;
	
	private Okul okul;
	public int tecrube;
	
	public Mudur (String isim,String soyisim,String TCNo,String sicilNo, double maas)
	{
		this.isim = isim;
		this.soyisim = soyisim;
		this.TCNo = TCNo;
		this.sicilNo = sicilNo;
		this.maas =  maas;
		
	}
	// getter(private olan degerleri okumamızı saglar) ve setter (ayarlamamızı saglar) - accessors
	 public void setMaas(double maas) // maasi ayarla demek
	 {
		 this.maas = maas;
	 }
	
	 public double getMaas()  //maası getir / oku demek
	 {
		return  this.maas;
	 }
	 public void setTCNo(String TCNo) // tcnoyu ayarla demek
	 {
		 if (TCNo.length()==11)
		 this.TCNo = TCNo;
		 else
			 System.out.println(this.isim+" icin TC atanamamistir. TC Kimlik Numaralari 11 hane olmalidir. Islem basarisiz.");
	 }
	
	 public String getTCNo()  //tcno yu getir / oku demek
	 {
		//return  this.TCNo; // bu normal yazım
		return  this.isim + " " + this.soyisim + "'in TC nosu : "+ this.TCNo;
	 }
	 public void setIsim(String isim) // ismi ayarla demek
	 {
		 if(!isim.matches("((\\w)*(\\d)+(\\w)*)+"))
		 this.isim = isim;
		 else
			 System.out.println("Isimler 0 rakami iceremez ");
	 }
	
	 public String getIsim()  //isimi getir / oku demek
	 {
		return  this.isim;
	 }
	 public void setSoyisim(String soyisim) // soyismi ayarla demek
	 {
		 this.soyisim= soyisim;
	 }
	
	 public String getSoyisim()  //soyisimi getir / oku demek
	 {
		return  this.soyisim;
	 }
	 public void setOkul(Okul okul) // okul ayarla demek
	 {
		 this.okul= okul;
	 }
	
	 public Okul getOkul()  //okul getir / oku demek
	 {
		return  this.okul;
	 }
}
