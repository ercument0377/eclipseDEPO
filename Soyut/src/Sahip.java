
public class Sahip {
	Hayvan hayvan;

	public static void main(String[] args) {
		
  
		Sahip insan = new Sahip();
		
		Hayvan evHayvani = new Kedi();
		
		insan.sahiplendir(evHayvani);
		insan.hayvan.sesCikar();
	}
	
	public void sahiplendir(Hayvan h)
	{
		this.hayvan = h;
	}

}
