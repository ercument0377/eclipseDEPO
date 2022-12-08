
public class Istisnalar09 {

	public static void main(String[] args) {
		// kendimiz bir exception olurturuyoruz burada  IllegalPuanException olusturduk
		try {
			puaniCheckEt(95);
		} catch (IllegalPuanException e) {
			System.out.println(e.getMessage());
		
		}

	}

	public static void puaniCheckEt(int puan) throws IllegalPuanException {
		if (puan<0 || puan>100) {
			throw new IllegalPuanException("Sinav puanı 0 ile 100 arasinda olmali");
			
			
		}
		System.out.println("Sinav punainiz: "+ puan);
	}
	
	private static class IllegalPuanException extends Exception {
		public IllegalPuanException(String mesaj) {
			super(mesaj);
			
		}
	}
}
