import java.util.Scanner;

public class Sinif2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("lutfen n bir karakter giriniz.\nA \nB \nC");
		 
		  char secenek = scan.next().toUpperCase().charAt(0);
		  
		 switch (secenek) {
		 case 'A':
			 System.out.println("Java kolaydir");
			 break;
		 case 'B':
			 System.out.println("Java eglencelidir");
			 break;
		 case 'C':
			 System.out.println("Java kogrenmen gerekli");
			 break;
			 default:
				 System.out.println("gecerli karakter giriniz");
				 break;
				 
	}
		// String sonuc = secenek == 'A' ?  "java kolaydir": (secenek== 'B' ? "java eglencelidir":(secenek== 'C' ? "ogrenmek icin cok calismalisin" : "dogru karakter giriniz"));
	//System.out.println(sonuc);
			

scan.close();
	}
}

