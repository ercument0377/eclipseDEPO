
public class Alistirma08 {
	
	// bir Stringte tekrar eden karakterleri silen String bir metod olusturun
	// orn: aaabbc ==> abc

	public static void main(String[] args) {
		
	String k= tekrarEdenKarakteriSil("acabbc");
	System.out.println(k);  //abc
		
     
	}
	private static String tekrarEdenKarakteriSil(String str ) {

		String str1 = "";
		for( int i=0; i<str.length(); i++) {
			char harf = str.charAt(i);
			if( !str1.contains(harf+"")) {
				str1 = str1+harf;
			
			}
			
		}

		return str1;
}
}