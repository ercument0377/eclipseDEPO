import java.util.Scanner;
public class Odev5 {

	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		int hedefSayi = (int)(Math.random()*100);
		
		System.out.println("Tahmin Oyununa Hosgeldiniz");
		System.out.println("1 ile 100 arasinda bir sayi giriniz");
		
		boolean sayiyiBulmadimMi = true;
		int  denemeSayisi = 0;
		
		
		while (sayiyiBulmadimMi)
		{
			int tahmin = klavye.nextInt();
			denemeSayisi=denemeSayisi+1;
			if(hedefSayi>tahmin)
				{
				System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
				}
			else if (hedefSayi<tahmin)
			{
				System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
				}
			if (tahmin == hedefSayi)
		
		{
			sayiyiBulmadimMi  = false;
			System.out.println("Tebrikler."+denemeSayisi+". denemenizde bildiniz");
		}
		
	}
	}
	
}