import java.util.Scanner;
public class ForDongusu {

		public static void main(String [] args)
		{
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Lutfen  bir sifre    giriniz");
			
		
			char karakter = scan.next().charAt(0);
			
			if (karakter >='A'&& karakter <='Z') {
				if (karakter =='A') {
				
					System.out.println("gecerli sifre");
				}else {
					System.out.println("gecersiz sifre");
				} 
			}
			
		else if (karakter >='a' && karakter<='z') {
				if(karakter=='z') {
					System.out.println("gecerli");
				}else {
				System.out.println("gecersiz");
			}
		}else {
					System.out.println("lutfen dogru sifre giriniz");
				
			}
		
		}	

}



					
				
	



		

  

	


