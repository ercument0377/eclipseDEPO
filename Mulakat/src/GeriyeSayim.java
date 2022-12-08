
public class GeriyeSayim {

	
	public static void main(String[] args) throws InterruptedException {
		// 5 dk lik bir arayi geriye sayimla (kod vasitasıyla)
		//   yazmak istiyorum.
		
	 int dakika = 5;	
		for (int i = dakika-1; i>=0; i-- ) {
			for (int j=59; j>0; j--) {
				Thread.sleep(1000);        // 1 saniye bekleterek çalıştırı
				System.out.println( i+ " dakika "+j+ " saniye kaldi");
			
	 
	 
	 
	/*	int saat = 5;
		for (int k = saat-1; k>=0; k--) {
			
		for (int i = 59-1; i>=0; i-- ) {
			for (int j=59; j>0; j--) {
				Thread.sleep(1000);        // 1 saniye bekleterek çalıştırı
				
				System.out.println(k+ " saat "+ i+ " dakika "+j+ " saniye kaldi");
		*/	}
			
		}
		System.out.println("vakit doldu");

	}

	}

