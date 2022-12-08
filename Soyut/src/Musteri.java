
public class Musteri extends KisiselBilgiler {
	String isim;
	String adres;
	String telNo;
	String vergiBilgileri;
	
	public Musteri(String isim, String adres, String telNo, String vergiBilgileri )
	{
		this.isim = isim;
		this.adres = adres;
		this.telNo = telNo;
		this.vergiBilgileri = vergiBilgileri;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Musteri m = new Musteri("Caner Erkin","1001.Sokak","5555555","555555");
    
	}

}
