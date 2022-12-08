
public class A20 {

	
/*
 * bir Stringin Polindrase olup olmadıgını check eden bir kod yazınız
 * Polindrone : kelimenın tersten yazılısı kendisine esit
 * "121" == "121" tersten yazımı aynı olacak
 */
	public static void main(String[] args) {
		
		String s = "kucuk";
		 String terstenS = "";
		 int sonIndex = s.length()-1;
		 
		 while ( sonIndex>-1) {
			terstenS = terstenS + s.charAt(s.length()-1);
			 sonIndex--; 
		 }
		if (s.equals(terstenS)) {
			System.out.println("Bu bir palindrom");
		}else {
			System.out.println("Bu bir palindrom degildir.");
		}

	}

}
