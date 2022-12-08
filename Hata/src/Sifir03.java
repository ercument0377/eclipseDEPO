import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sifir03 {
	//karakter karaekter okuyor burada

	public static void main(String[] args) {
		FileReader okuyucu = null;
		FileWriter yazici = null;
		
		try {
			int character;
			okuyucu = new FileReader( "Kaynak\\Veri");
			while((character = okuyucu.read())!=-1){  
				System.out.println(character);
			}
		
	} catch (IOException ioe) {
		System.err.println("Dosya bulunamadi");
		
		}

	}

	}
