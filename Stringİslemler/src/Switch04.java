import java.util.Scanner;
public class Switch04 {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		
		System.out.println("Lutfen cinsiyetinizi giriniz (E veya K)");
		String cinsiyet = klavye.nextLine();
		System.out.println("Lutfen yasinizi giriniz");
		int yas = klavye.nextInt();
		String sonuc = yas > 65 && cinsiyet.equals("e") ? "emekli"
				: (yas > 60 && cinsiyet.equals("k") ? "emekli" : "calismali");
		System.out.println(sonuc);
	}
}