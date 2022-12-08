
public class Kopek extends Hayvan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sahip insan = new Sahip();
		Kedi kedi = new Kedi();
		
		kedi.sesCikar();
		kedi.beslen();
		
	//	Hayvan tekir = new Kedi();   // böylede eklenebilir
	//	tekir.sesCikar();
		
		Hayvan golden = new Kopek();   // ne eklersen onu tanır ve sesini çıkartır
		golden.sesCikar();

		insan.sahiplendir(golden);
	}
	
	@Override
	public void sesCikar()
	{
		System.out.println(" havv havvv ");
	}
}
