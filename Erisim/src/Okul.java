import java.util.ArrayList;
public class Okul {
	
	String isim;
	String adres;
	public static ArrayList<Derslik> derslikler = new ArrayList<Derslik>();
	String seviye;
	private double butce;
	
	Mudur mudur;
	Mudur mudurYardimcisi;
	
	Ogretmen rehberOgretmeni;
	public static ArrayList<Ogretmen> sinifOgretmeni = new ArrayList<Ogretmen>();
	Ogretmen resimOgretmeni;
	Ogretmen bedenEgitimiOgtretmeni;
	Ogretmen yabanciDilOgretmeni;
	
	
	public Okul(String isim, String adres,String seviye, double butce)
	{
		this.isim = isim;
		this.adres = adres;
		this.seviye = seviye;
		this.butce = butce;
	}
//get ve set metodlari
	public void setMudur(Mudur mudur)
	{
		if(mudur.tecrube >5) //Mudurler en az 5 yil tecrubeye sahip olmalidirlar.
		this.mudur = mudur;
	}
	public Mudur  getMudur()
	{
		return this.mudur ;
	}
	
	public void setMudurYardimcisi(Mudur mudurYardimcisi)
	{
		this.mudurYardimcisi = mudurYardimcisi;
	}
	public Mudur  getMudurYardimcisi()
	{
		return this.mudurYardimcisi ;
	}
	
	public double emekliyeAyir(Mudur mudur) {
		return 30 * mudur.getMaas() * 1.5;
	}
	public double emekliyeAyir(Ogretmen ogretmen) {
		return 30 * ogretmen.maas * 1.2;
	}
	
	public static void main(String[] args)
	{
		String isim = " Bahçelievler Ilkokulu";
		String adres = " Bahcelievler 5.cadde No:12 Ankara";
		int sinifSayisi = 20;
		String seviye = "Ilkokul";
		double butce = 500000.0;
		
		Mudur bahcelievlerMuduru = new Mudur("Necip", "Uysal","1254888854","11111",12000);
		Mudur bahcelievlerMudurYardimcisi = new Mudur("Emre", "Alkis","58748754","11112",11000);
		
		Ogretmen behcelievlerRehberOgretmeni = new Ogretmen( "Nihal", "Kara","56524758852","2001",9000,"Rehberlik");
		
		 Okul bahcelievlerIlkokulu = new Okul(isim,adres,seviye,butce);
		 bahcelievlerIlkokulu.setMudur(bahcelievlerMuduru);
		 bahcelievlerIlkokulu.setMudurYardimcisi(bahcelievlerMudurYardimcisi);
		 bahcelievlerIlkokulu.rehberOgretmeni = behcelievlerRehberOgretmeni;
		
		 new Derslik("1-A", 35);                 //böylede yazilir 
		 new Derslik("2-A", 30);                 //böyle yazmak daha kolay
		 new Derslik("1-B", 25);
		 Derslik B2 = new Derslik("2-B", 30);       // böylede yazilir.
		 Derslik C1 = new Derslik("1-C", 20);       //ikiside doğru
		 Derslik C2 = new Derslik("2-C", 25);
		 Derslik D1 = new Derslik("1-D", 10);
		 Derslik D2 = new Derslik("2-D", 15);
		 System.out.println("Derslik sayisi : " + derslikler.size()); //8
		 
		 for(int i=0; i< derslikler.size();i++)
		 {
			 if(derslikler.get(i).isim=="3-A")
			 {
				 derslikler.get(i).kapasite +=5;
			 }
		 }
		 
		 
		 
		 /*
		 
		 System.out.println("Mudurumuzun eski maasi : "+ bahcelievlerMuduru.getMaas());
		 bahcelievlerMuduru.setMaas(11000);
		 
		 System.out.println("Mudurumuzun yeni maasi : "+ bahcelievlerMuduru.getMaas());
		 
		 bahcelievlerMuduru.setIsim("0001");
		 System.out.println("Mudurumuzun ismi : "+ bahcelievlerMuduru.getIsim());
		 
		 System.out.println( bahcelievlerMuduru.getTCNo());
		 
		// bahcelievlerIlkokulu.butce = 400000;  //boyle değiştirilebiliryor
		 System.out.println( "Okulumuzun eski butcesi: "+bahcelievlerIlkokulu.butce);
		 
		 bahcelievlerMuduru.setOkul (bahcelievlerIlkokulu);
		 bahcelievlerMuduru.getOkul().butce = 4000;
		 
		 System.out.println( "Okulumuzun yeni butcesi: "+bahcelievlerIlkokulu.butce);
	*/
	
		// bahcelievlerMuduru.setTCNo = ("1230");
	//	 System.out.println(bahcelievlerMuduru.getTCNo());
		  
		/* double tazminat = bahcelievlerIlkokulu.emekliyeAyir(bahcelievlerMuduru);
		 System.out.println(bahcelievlerMuduru.sicilNo+ " numarali mudurumuzun emeklilik tazminati: "+tazminat );
		 tazminat = bahcelievlerIlkokulu.emekliyeAyir(behcelievlerRehberOgretmeni);
		 System.out.println(behcelievlerRehberOgretmeni.sicilNo+ " numarali ogretmenimizin emeklilik tazminati: "+tazminat );
*/
		
	}
	

}
