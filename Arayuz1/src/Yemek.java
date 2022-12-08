import java.time.LocalTime;

public class Yemek {
	String[] icerikler;
	double kalori;
	int maliyet;
	int satisFiyati;
	static  double zaman = 1200.0;
	
	public Yemek(String[] icerikler, double kalori,int maliyet,int satisFiyati,String ad) {
		this.icerikler = icerikler;
		this.kalori = kalori;
		this.maliyet = maliyet;
		this.satisFiyati = satisFiyati;
		
		
		
	}
	
	public Yemek() {
		
	}

	public static void main(String[] args) {

		
	}
public void pisir() 
{
	zaman += 30.0;
}

}
