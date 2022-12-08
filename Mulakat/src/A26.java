
public class A26 {

	public static void main(String[] args) {
		
/*
 ekmek kelimesinin ilk ve son görünüşü arasında kullanılan bir string sandawiç olusturup olurmadıgını gösteren 
 bir kod yazınız
 ornk: 
 ekmekMaydanosekmek => Maydanos ==> ekmekMaydanos ==> hicbirsey
 
 */
	String sandwich = "ekmekMaydanosekmek";
	
	int ilkGorunum = sandwich.indexOf("ekmek");
	int sonGorunum = sandwich.lastIndexOf("ekmek");
	
	if (ilkGorunum == sonGorunum) {
		System.out.println("sandwich degildir");
	}else 
		System.out.println(sandwich.substring(ilkGorunum+5,sonGorunum));
	
	}

}
