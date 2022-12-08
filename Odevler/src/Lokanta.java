import java.util.Scanner;
public class Lokanta {

	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lokantamiza hos geldiniz. Siparis vermek icin 1e basiniz" 
		+ "Cikmak icin 2ye basiniz:" );
	
		int tercih = klavye.nextInt();
		
		if(tercih == 2)
		{
			System.out.println("Hoscakalin. Yine bekleriz");
		}
		else if(tercih == 1)
		{
			System.out.println("Corbalar icin 1");
		    System.out.println("Burgerler icin 2");
		    System.out.println("Kebaplar icin 3");
		    System.out.println("Salata icin 4");
		    System.out.println("Tatli icin 5");
		    System.out.println("Cikmak icin 6 ya basiniz");
		    tercih = klavye.nextInt();
		    if(tercih==6)
		    {
		    	System.out.println("Hoscakalin. Yine bekleriz");
		    }
		    else if(tercih==1)
		    {
		    	System.out.println("Mercimek corbasi icin 1");
				System.out.println("Yayla corbasi icin 2");
				System.out.println("Ezogelin corbasi icin 3");
				System.out.println("Domates corbasi icin 4");
				System.out.println("Cikmak icin 5 ya basin:");
                tercih = klavye.nextInt();
                if(tercih>=1 && tercih<=4) {
                	System.out.println("Afiyet olsun corbaniz hazirlaniyor.");
                }
                else 
                	System.out.println("Hoscakalin. Yine bekleriz");
            
		    }
		    else if(tercih==2)
		    {
		    	System.out.println("Hamburger icin 1");
				System.out.println("Cheseburger icin 2");
				System.out.println("Double King Menu icin 3");
				System.out.println("Cikmak icin 4 ya basin:");
                tercih = klavye.nextInt();
                if(tercih>=1 && tercih<=3) {
                	System.out.println("Afiyet olsun burgeriniz hazirlaniyor.");
                }
                else 
                	System.out.println("Hoscakalin. Yine bekleriz");
		    }
                	else if(tercih==3)
        		    {
        		    	System.out.println("Adana Kebap icin 1");
        				System.out.println("Beyti Kebap icin 2");
        				System.out.println("Urfa Kebap icin 3");
        				System.out.println("Yogurtlu Kebap icin 4");
        				System.out.println("Cikmak icin 5 ya basin:");
                        tercih = klavye.nextInt();
                        if(tercih>=1 && tercih<=4) {
                        	System.out.println("Afiyet olsun kebabiniz hazirlaniyor.");
                        }
                        else 
                        	System.out.println("Hoscakalin. Yine bekleriz");
                    
        		    }
                	else if(tercih==4)
        		    {
        		    	System.out.println("Coban Salata icin 1");
        				System.out.println("Mevsim Salata icin 2");
        				System.out.println("Sogus  icin 3");
        				System.out.println("Kasik Salatasi icin 4");
        				System.out.println("Cikmak icin 5 ya basin:");
                        tercih = klavye.nextInt();
                        if(tercih>=1 && tercih<=4) {
                        	System.out.println("Afiyet olsun salataniz hazirlaniyor.");
                        }
                        else 
                        	System.out.println("Hoscakalin. Yine bekleriz");
                    
        		    }
                	else if(tercih==5)
        		    {
        		    	System.out.println("Kabak tatlisi icin 1");
        				System.out.println("Incir tatlisi icin 2");
        				System.out.println("Gullac  icin 3");
        				System.out.println("Kazandibi icin 4");
        				System.out.println("Baklava icin 5");
        				System.out.println("Cikmak icin 6 ya basin:");
                        tercih = klavye.nextInt();
                        if(tercih>=1 && tercih<=5) {
                        	System.out.println("Afiyet olsun tatliniz hazirlaniyor.");
                        }
                        else 
                        	System.out.println("Hoscakalin. Yine bekleriz");
        		    }
		    
		}
	}

	
		
	}

