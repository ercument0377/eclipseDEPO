import java.util.Scanner;
public class Odev6 {

	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("Bir cumle girer misiniz?");
		
		String cumle = klavye.nextLine();
		int baslangicIndex = 0;
		int sayac= 0;
		
		for(int i = 0; i<cumle.length();i++)
		{
			if(cumle.charAt(i)==' ')
			{
				sayac++;
				String kelime = cumle.substring(baslangicIndex,i);
				System.out.println("Cumlenizin " + (sayac)+ "."  +  "kelimesi  "   +   kelime  );
				baslangicIndex=i + 1;
				
				
			}
		}
		
		
		
	}
}