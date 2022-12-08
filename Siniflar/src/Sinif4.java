import java.util.Scanner;

public class Sinif4 {

	public static void main(String[] args) {

		Scanner kelime = new Scanner(System.in);
		
		System.out.println("lutfen kelime giriniz");
		
       
         String str = kelime.nextLine();
        
    	if  (str.length()>=4  && str.length() %2 == 0) {
    	String ortaHarfler = str.substring(str.length()/2-1,str.length()/2+1);
    		
    		
			System.out.println(ortaHarfler);
	
	}
	}
}


