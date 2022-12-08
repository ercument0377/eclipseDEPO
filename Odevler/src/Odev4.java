import java.util.Scanner;

public class Odev4 {

	public static void main(String[] args) {
			Scanner klavye = new Scanner(System.in);
			System.out.println("Bir tek sayi girer misiniz?");
			int sayi = klavye.nextInt();
			
			while(sayi >= 0)
			{
				System.out.println(sayi);
				sayi = sayi -2;
			}
			
				
			
		}

	}

