
public class Istisnalar10 {

	public static void main(String[] args) {
		try {
		bolme(4,1);
	}catch (SayiyiBireBolmeException e){
		System.out.println(e.getMessage);
	}
	
	public static void bolme ( int a, int b) throws SayiyiBireBolmeException {
		if (b ==1) {
			throw new SayiyiBireBolmeException("Bir sayiyi 1'e bolmek sayinin kendisini verir, dolayisiyla sayiyi 1!e bolme ihtiyaci yoktur");
		}
	}

	private static class SayiyiBireBolmeException extends Throwable {
		public SayiyiBireBolmeException(String s) {
			super(s);
		}
	}
}
