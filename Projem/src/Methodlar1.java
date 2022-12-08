
public class Methodlar1 {

	public static void main(String[] args) {
		
		int ilkSayi = 20;
		int ikinciSayi = 40;
		int ucuncuSayi = 10;
		
		double ilkDouble = Math.E;
		double ikinciDouble = Math.PI;
		
		double toplam = topla(ikinciSayi,ikinciDouble);
		System.out.println(toplam);
	}
	public static int topla(int a, int b)
	{
		System.out.println( "iki parametreli topla icindeyim ");
		int sonuc = a+b;
		return sonuc;
	}
	
	public static int topla(int a, int b, int c)
	{
		System.out.println( "uc parametreli topla icindeyim ");
		int sonuc = a+b+c;
		return sonuc;
	}
	
	public static double topla(double a, double b)
	{
		System.out.println( "iki double parametreli topla icindeyim ");
		double sonuc = a+b;
		return sonuc;
	}
	public static double topla(int a, double b)
	{
		System.out.println( "Ilki int ikincisi double parametreli topla icindeyim ");
		double sonuc = a+b;
		return sonuc;
	}
	public static double topla(double a, int b)
	{
		System.out.println( "Ilki double ikincisi int parametreli topla icindeyim ");
		double sonuc = a+b;
		return sonuc;
	}
	
}
