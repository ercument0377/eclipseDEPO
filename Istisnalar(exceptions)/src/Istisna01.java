
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Istisna01 {

	//   int x = "gunduz"; = checked Exceptions başlangıçta uyaran istisnalardır
	
    //	Exception'lar beklenmeyen sorunlardır.
	/*
	 1. FileNotFoundException:
	    a) eger dosya(file) adresi yazlış ise
	    b) eger dosyayı buldu fakat dosyaya erişemiyorsa 
	    
	  2. IOException:
	     a) bu exception input ve output ile ilgili butun exceptionlar müdahale eder
	     Not: IOException, FileNotFoundExceptionların ebeveynidir
	     Not: eger IOException kullanıyorsanız, FileNotFoundException kullanmaya gerek yoktur.
	 3. eger bir exception görürseniz (altı çzizili hata demek) 2 seçeneğimiz var
	    a) 'throws'  declaration'ı method signiture kısmına / satırına eklenir
	    b) try-catch block kullanılır
	 
	 */
	
	
	
	public static void main(String[] args) throws IOException {
	
	FileInputStream dosya = new FileInputStream("src/File01");
	
	int i = 0;
	while ((i = dosya.read()) !=-1 ) {
		// System.out.println(i);   // asgi değerini yazdırır
		System.out.print((char) i);  // yazının kendisini yazdırır
		
	}
	dosya.close();
	}

}
