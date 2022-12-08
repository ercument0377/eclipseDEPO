
  public class Araba  extends Arac{  //subsclass, alt sınıf
	public int odometre;
	
	public Araba(String marka, int model,  int odometre) {
		super(marka, model);    //Constructor chaining, zincirleme demek
		this.odometre = odometre;
	}
	
	public static void main(String[] args) {
		Araba araba = new Araba("Audi", 2010, 50000);
		araba.kornayaBas();
		
		
		

 }
   @Override
   public  void kornayaBas() {            // o sınıfa özel değişiklik yapar
	System.out.println(" DUUUT DUUT");
	super.kornayaBas();                 // Duuut duut ve hoonk hook verir hem kendisin hem ana sınıfın 
  }
	/*
	public void arabaYikama() {
		icDisYikama();
		super.cila();
		super.boyaKoruma();
		*/
	}
	

	

  