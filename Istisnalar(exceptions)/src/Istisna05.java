
public class Istisna05 {
	/* 
	 1. Eger length(), null bir String obje için kullanırsanız NullPoinExceptio hatasını alırız
	 2. NullPoinExceptio istisnası "unchecked istisnasıdır"
	 3. Eger sınıflar arasında ebeveyn cocuk ilişkisi yok ise catch-blach da sıralama onemlimdegıldır
	    her biriiçin ayrı ayrı catch olusturulmalıdır
	 4. try catch tek başına kullanılmaya bilir
	   a. try+catch 
	   b. try + catch + catch ......+catch  birden fazla catch kullanılabilir
	   c. try + catch + coklu catch + finally kullanılabilir
	   d. try + finally  tek başlarına kullanılabilir.
	    
	 */

	public static void main(String[] args) {
		String str = "";
		System.out.println(str.length());  // 0
		
		String str2 = null;
		
		try {
			System.out.println(12/0);  //ArithmaticException hatası
			
		System.out.println(str2.length());  //NullPoinException boş deger hatasi
		}catch (ArithmeticException e) {
			System.out.println("Sayilari 0'a bolemezsiniz");
		
		}catch (NullPointerException e) {
			System.out.println("Length() null Stringler icin kullanilamaz."+ e.getMessage());
		}finally {
			System.out.println("......finally kimi HER SARTTA calisir.....");
			
		}
		System.out.println(str.length()); //0
	}

}
