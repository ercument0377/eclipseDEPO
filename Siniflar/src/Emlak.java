import java.util.ArrayList;
import java.util.Scanner;

public class Emlak {
	
	public static ArrayList<Emlak> satilikEvler = new ArrayList<Emlak>();
	public static ArrayList<Emlak> kiralikEvler = new ArrayList<Emlak>();
	String portfoyNo;
	int odaSayisi;
	int salonSayisi;
	int banyoSayisi;
	double alan;
	String adres;
	boolean kiralikMi;
	boolean satilikMi;
	double satilikFiyati;
	double kiralikFiyatiFiyati;
	String isitma;
	int bulunduguKat;
	int binaYasi;
	String emlakTuru;
	
	//bos construktor
	public Emlak()
	{
		satilikEvler.add(this);
	}
	//Overloaded Constructor II
	public Emlak ( String portfoyNo,int odaSayisi,int salonSayisi,int banyoSayisi,double alan,
	String adres,boolean kiralikMi,boolean satilikMi,double satilikFiyati,double kiralikFiyati,
	String isitma,int bulunduguKat,int binaYasi,String emlakTuru)
	{
		this.portfoyNo=portfoyNo;
		this.odaSayisi=odaSayisi;
		this.salonSayisi=salonSayisi;
		this.banyoSayisi=banyoSayisi;
		this.alan=alan;
		this.adres=adres;
		this.kiralikMi=kiralikMi;
		this.satilikMi=satilikMi;
		this.satilikFiyati=satilikFiyati;
		this.kiralikFiyatiFiyati=kiralikFiyati;
		this.isitma=isitma;
		this.bulunduguKat=bulunduguKat;
		this.binaYasi=binaYasi;
		this.emlakTuru=emlakTuru;
		if(satilikMi)
				satilikEvler.add(this);
		else
			kiralikEvler.add(this);
	}
	//Overloaded Constructor II
	public Emlak ( String portfoyNo,int odaSayisi,int salonSayisi,int banyoSayisi,double alan,double satilikFiyati,String isitma,int bulunduguKat,String emlakTuru)
			{
				this.portfoyNo=portfoyNo;
				this.odaSayisi=odaSayisi;
				this.salonSayisi=salonSayisi;
				this.banyoSayisi=banyoSayisi;
				this.alan=alan;
				this.satilikFiyati=satilikFiyati;
				this.isitma=isitma;
				this.bulunduguKat=bulunduguKat;
				this.emlakTuru=emlakTuru;
				satilikEvler.add(this);
			
			}

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		Emlak ev1 = new Emlak("1001",3,1,1,100,"Ankara Caddesi no 5", false,true,15.5,0,"kombi",2,25,"daire");
		Emlak ev2 = new Emlak("1002",5,1,3,220,25,"yerden isitmali",7,"daire");
		Emlak ev3 = new Emlak("1003",5,1,3,180,45,"yerden isitmali",7,"daire");

		//Emlak[] satilikEvler = {ev1,ev2,ev3};
		
		Emlak ev4 = new Emlak("1004",3,1,3,140,15,"yerden isitmali",7,"daire");
		
		System.out.println("Istediginiz fiyat araligi icin dusuk degeri giriniz: ");
		int dusukDeger = klavye.nextInt();
		
		System.out.println("Istediginiz fiyat araligi icin yuksek degeri giriniz: ");
		int yuksekDeger = klavye.nextInt();
		
		System.out.println("Istediginiz istediginiz en dusuk alan degeri giriniz: ");
		int alan = klavye.nextInt();
		
		for (int i=0; i<satilikEvler.size(); i++)
		{
			if(satilikEvler.get(i).satilikFiyati<=yuksekDeger && satilikEvler.get(i).satilikFiyati>=dusukDeger)
			{
				System.out.println(satilikEvler.get(i).portfoyNo+" nolu ev "+satilikEvler.get(i).satilikFiyati +
						" liraya satiliktir");
			}
		}
		
		
		

	}

}
