
public class Alistirma02 {
	/*
	String alan bir method olusturun ve karakterleri rakam ile alfabe seklinde ayristirin.
	Method String dondurmeli. Orn: a1b2c,34!?
	
	*/
	
	

	public static String ayristirma(String str) {
		
		String harf="", rakam="", diger="";
		
		
		for (int i=0; i<str.length(); i++) {
			
			char karakter = str.charAt(i);
			if(Character.isLetter(karakter)) {
				harf+=karakter;
				
				
			}else if (Character.isDigit(karakter)) {
				rakam+=karakter;
				
			}else {
				diger+=karakter;
			}
		}
		return "Harfler: "+ harf+"," + " rakamlar:  " + rakam+","+  " diger :  "	+ diger;
		}

	public static void main(String[] args) {
		
	
		String t  = ayristirma( "s1e2l3%am/?!"); //Harfler: selam, rakamlar:  123, diger :  /%?!
		System.out.println(t);
		
		
		

	}

}
