import java.util.ArrayList;
import java.util.Scanner;

public class Araba {
	
	
	int yil;                       //bunlar asagiya parametre olarak girildi
	String marka;
	double motorHacmi;
	int beygirGucu;
	String renk;
	boolean duzVitesMi;
	String yakit;
	int odometre;
	String plaka;
	double alisFiyati;
	double beklenenSatisFiyati;
	boolean satistaMi;
	static int envanterdekiAracSayaci= 0;
	static double kasa=30.0;
	public static ArrayList<Araba> envanter = new ArrayList<Araba>();
	
	
	//constructor - yapici
	public Araba() {
		
	}
	
	public Araba(int yil, String marka, double motorHacmi, int beygirGucu, String renk,
	             boolean duzVitesMi, String yakit, int  odometre,String  plaka, 
	             double alisFiyati, double  beklenenSatisFiyati, boolean  satistaMi)    //dummy name bu isimlerin bir onemi yok istenilen konulabilir
	          
           {
		 this.yil        = yil;               
		 this.marka = marka ;
		 this.motorHacmi = motorHacmi;
		 this.beygirGucu = beygirGucu;
		 this.renk = renk;
		 this.duzVitesMi = duzVitesMi;
		 this.yakit = yakit;
		 this.odometre = odometre;
		 this.plaka = plaka;
		 this.alisFiyati = alisFiyati;
		 this.beklenenSatisFiyati = beklenenSatisFiyati;
		 this.satistaMi  = satistaMi;
		 kasa-= alisFiyati;
		 envanterdekiAracSayaci++;
		 envanteriYazdir();
	}
	
	public static void main(String[] args) {

		
		
		Araba araba001 = new Araba(2020, "Audi", 2000.0, 240, "Lacivert", false, "Dizel", 25000, "34HHH1234", 4.5, 5.25, true);
		
		Araba araba002 = new Araba(2022, "Toyota", 1600.0, 240, "Beyaz", false, "Dizel", 5000, "77HHH1234", 5.5, 6.25, true);
		
		Araba araba003 = new Araba(2010, "Renault", 1600.0, 95, "Siyah", false, "LPG", 5000, "33LHM524", 8.5, 10.25, true);
		
		Araba araba004 = new Araba(2011, "Ford", 1400.0, 140, "Gri", false, "Benzin", 5000, "35MNB534", 5.5, 6.25, true);

		Araba araba005 = new Araba(2015, "Mercedes", 1000.0, 195, "Sari", false, "Benzin", 5000, "32SDFR234", 6.5, 8.25, true);

		
		
		//System.out.println("ilk arabanin markasi:  " + araba001.marka);
		//System.out.println("ikinci arabanin markasi:  " + araba002.marka);
		//System.out.println("Ucuncu arabanin plakasi:  " + araba003.plaka);
		
		araba002.araciSat();
		araba005.araciSat();
		araba001.araciSat();
		araba002.araciSat();
		
}	
	public void araciSat()
	{
		if(satistaMi)
		{
			satistaMi = false;
			kasa += this.beklenenSatisFiyati;
			envanterdekiAracSayaci--;
			System.out.println( this.plaka + " 'li arac "+ this.beklenenSatisFiyati+ " TL ye satilmistir. "  );
			envanteriYazdir();
			
		}else{
			System.out.println(this.plaka + " plakali arac satista degil");
		}
	}
	public static void envanteriYazdir()
	{
		 System.out.println(" Envanterdeki arac sayisi: "+envanterdekiAracSayaci+ "\n kasada olan para: "+kasa);

	}
	
}

