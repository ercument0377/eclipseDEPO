
public class Sinif17 {
	
	public static void main(String[] args) {
		 
    String k = tekrarEdenKarakteriSil("acaabbc") ;
    System.out.println(k);
}
 private static String  tekrarEdenKarakteriSil(String str) {
	 String str1 = "";
	 for (int i=0; i<str.length();i++) {
		 char harf = str.charAt(i);
		 if (!str1.contains(harf+"")) {
			 str1 = str1+harf;
			 
		 }
		 
	 }
	 
	 return str1;
 }
}

