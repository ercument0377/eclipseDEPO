
public  class Arac {    // superclass, ust sınıf
	
	protected String marka;
	public int model;
	
	//consractor overloding
	public Arac(String marka, int model) {
		this.marka = marka;
		this.model = model;
	}
	

	public void kornayaBas() {
		System.out.println("HOOONNK   HONNKK");
	}
	
	protected void setMarka(String marka) {
		this.marka = marka;
	}
	
	public static void main(String[] args) {
		Arac arac = new Arac("BMW", 2020);
		
		
	}

}
