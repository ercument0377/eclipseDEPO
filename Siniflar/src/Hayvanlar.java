public class Hayvanlar {

	String ID;
	
	String tur;
	String cins;
	
	boolean etcilMi;
	boolean evcilMi;
	boolean ucanMi;
	
	int yas;
	String renk;
	
	boolean disiMi;
	String kafesNo;
	
	//bos constructor
	public Hayvan() {
		
	}
	//dolu constructor
	public Hayvanlar(String p1,String p2, String p3, boolean p4, boolean p5,
			boolean p6, int p7, String p8, boolean p9, String p10)
	{
		 ID = p1;
		
		 tur = p2;
		 cins= p3;
		
		 etcilMi= p4;
		 evcilMi= p5;
		 ucanMi= p6;
	
		 yas= p7;
		renk= p8;
		
		 disiMi= p9;
		kafesNo= p10;
		
	}
	public Hayvanlar(String p1,String p2,  boolean p4, boolean p5,
			boolean p6, int p7,boolean p9, String p10)
	{
		 ID = p1;
		 tur = p2;
		 etcilMi= p4;
		 evcilMi= p5;
		 ucanMi= p6;
		 yas= p7;
		 disiMi =p9;
		kafesNo= p10;
		
	}
	public static void main(String[] args) {
		
		Hayvanlar aslan1 = new Hayvanlar("Asl01", "Aslan", "Afrika Aslani",true,false,false,10,"Sari",true,"B110");
		Hayvanlar aslan2 = new Hayvanlar("Asl02", "Aslan", "Afrika Aslani",true,false,false,10,"Sari",true,"B110");

		Hayvanlar tarantula1 = new Hayvanlar("Tar01", "Orummcek",true,false,false,1,false,"D520");

		Hayvanlar yarasa1 = new Hayvanlar("Yar01", "Yarasa", false,false, true, 2, true,"F201");

		Hayvanlar[] hayvanlar = { aslan1, aslan2, tarantula1, yarasa1};
		
		for(int i =0; i<hayvanlar.length; i++)
		{
			if(hayvanlar[i].kafesNo.charAt(0)=='B'){
				hayvanlar[i].kafesNo = hayvanlar[i].kafesNo.replace("B","A");
			}
		}
		for(int i =0; i<hayvanlar.length; i++){
			System.out.println(hayvanlar[i].tur+ "lar "+hayvanlar[i].kafesNo+" da ziyarete aciktir.");
		}
			
		
		
	}

}
