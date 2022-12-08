import java.util.Scanner;

public class Istisna07 {
	/*
	 THROW
	      - Throw anahtar sözcüğü acikca bir istisnayı atmak için kullanılır
	      - Throw anahtar sözcüğünü kullanarak yalnızca bir tek işstisna atılabilir (çözülebilir)
	      - Throw anahtar sözcüğü  YALNIZCA METHOD BODY içinde kullanılabilir
	      - Throw anahtar sözcüğünü bir instance (obje) degişkeni ile çalışır. ==> new IllegalArgumentException()
	      - Checked exectionlar yalnızca THROW ile halledilemez
	 
	 THROWS
	       - Throws anahtar sözcüğü virgülle ayirarak bir veya birden fazla istisna için kullanılabilir
	       - Throws anahtar sözcüğü birden fazla istisna için kullanılabilir.
	       - Throws anahtar sözcüğü  METHOD SIGNITURE ile kullanılabilir
	       - Throws anahtar sözcüğünü Exception class ile kullanmalıyız.   ==>  IllegalArgumentException
	       - Checked exectionlar yalnızca THROWS ile halledebiliriz
	       
	       
	 */
	
	public static void main(String[] args)  {
		
		Scanner scan = new Scanner(System.in);
		System.out.println( " lutfen yasinizi giriniz");
		int yas = scan.nextInt();
		try {
	     yasiniz(yas);
		}catch (Exception e) {
			System.err.println("yas icin negatif degerler kullanilamaz" );
		}
	}
	
	public static void yasiniz(int yas) {
		
		if (yas<=0) {
			throw new IllegalArgumentException();
			
		}else {
//			throw new IllegalArgumentException();
			System.out.println(yas);
		}
		
	}
	
	
}
