import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Sifir04 {
	//karakter karaekter okuyor burada
   // sonuna true eklersek saklıyor üzerine yazıyor
	
	static final File veriDosyasi = new File( "C:\\Users\\Asus\\eclipse-workspace\\Hata\\Kaynak\\Veri");
	public static void main(String[] args) {
		BufferedReader okuyucu = null;
		BufferedWriter yazici = null;

		try {
			yazici =new BufferedWriter (new FileWriter(veriDosyasi,true));
			yazici.write("1\n2\n3\n\4\n");
			yazici.close();              // verileri kaydedince dosyayı kapatıyor
			
			String satir;
			okuyucu = new BufferedReader(new FileReader(veriDosyasi)); 
			while((satir = okuyucu.readLine()) != null) {  
				System.out.println(satir);
			}
			okuyucu.close();
	} catch (IOException ioe) {
		System.err.println("Dosya bulunamadi");
		
		}

	}

	}
