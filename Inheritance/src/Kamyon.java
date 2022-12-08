
public class Kamyon extends Arac{ //subsclass, alt sınıf
	public double tasimaKapasitesi;
	
	public Kamyon(String marka, int model, double tasimaKapasitesi) {
		super(marka,model);     // Constructor chaining (zincirleme demek)
		this.tasimaKapasitesi = tasimaKapasitesi;
	}
	
	public static void main(String[] args) {
	
	Kamyon kamyon = new Kamyon( "MErcedes", 2000, 25.0 );
	
	kamyon.kornayaBas();

}
	
	
}