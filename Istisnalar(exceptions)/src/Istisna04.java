import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Istisna04 {
	
	

	public static void main(String[] args) {
		
		try {
			BufferedReader dosya = new BufferedReader(new FileReader("src/File01"));
			String satir = dosya.readLine();
		
		while (satir != null) {
			
			System.out.println( satir);
			
			satir = dosya.readLine();
		}
		dosya.close();
		
		} catch (FileNotFoundException e) {
			System.out.println( "dosyayi bulamiyorum  " + e.getMessage());
			
		} catch (IOException e) {
			
			System.out.println( "dosyanin icerigini okuyamiyorum");
		}
	
	}

}
