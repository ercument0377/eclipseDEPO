import java.util.Scanner;

public class Sifir02 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz");
		int yas = klavye.nextInt();
		
		if ( yas < 18) {
			throw new ArithmeticException("Ehliyet alabilmeniz için en az 18 yasında olmalısınız");
		}else {
			System.out.println("Kayıtlar haftaya acilacak");
		}
	}
	
}
