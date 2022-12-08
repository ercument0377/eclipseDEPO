import java.util.Scanner;
public class Tahmin {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		int hedefSayi = (int)(Math.random()*100);   
		
		System.out.println("Tahmin oyununa hosgeldiniz.");
		System.out.println("Hedef sayiniz 1-100 arasindadir.");
		
		int denemeSayisi = 0;
		int tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		
		
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		tahmin = klavye.nextInt();
		denemeSayisi = denemeSayisi+1;
		
		if(hedefSayi == tahmin)
		{
			System.out.println("Tebrikler. "+denemeSayisi+". denemenizde "
					+ "bildiniz");
		}
		else if(hedefSayi>tahmin)
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan kucuk");
		}
		else
		{
			System.out.println(denemeSayisi+". tahmininiz hedef sayidan buyuk");
		}
		
		
		System.out.println("Hedef sayimiz: "+hedefSayi);
	}

}

