
public class Istisna06 {
	/* 
	   1. ArrayIndexOutOfBoundsException istisnasına (hatasina) arrayde var olmayan bir index kullandığımızda karşılaşırız
	   2. ArrayIndexOutOfBoundsException unchecked exception dur.
	   
	   3. ClassCastException eger bir data type yi cast yapmak istersek (dönüştürmek istersek)
	      fakat java tarafından desteklenmiyorsa bu hatayı alırız
	   4. ClassCastException  unchecked exceptiondur.
	   5. NumberFormatException eger icinde sayi olmayan bir karakter kullanırsanız
           parsInt() ile uygularsanız bu tür istisnayı alırız
        6.NumberFormatException unchecked istisnasıdır.
	      
	 */
	

	public static void main(String[] args) {
		String str [] = {"A","B", "C","D"};
		
		System.out.println(str[2]);  // C 
		
		try {
		System.out.println(str[4]);  //  ArrayIndexOutOfBoundsException
		
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.err.println("Array'de var olmayan bir index kullandiysaniz 'ArrayIndexOutOfBoundsException' mesaji alirsiniz ");
		}
		// ClassCastException hatası alırız
		try {
		Object t = 70;
		String sayi = (String) t;  // ClassCastException hatası alırız
		} catch (ClassCastException e) {
			System.err.println( " class cast istisnasi alindi");
		}
		
		String s1 = "1234";
		System.out.println(s1+ 5);  //  12345 verir 
		
		
		int s2 = Integer.parseInt(s1);
		System.out.println(s2+ 5);  // 1239
		
		
		String s3 = "1a2b3c!";
		
		try {
		int deger = Integer.parseInt(s3);  // NumberFormatException  hatası alırız
		} catch (NumberFormatException e) {
			System.err.println( " String icinde rakam disinda karakter kullanilmistir");
		}
		
		
	}

}
