import java.util.Scanner;
public class odev3Mahalle {
	
	public static void main(String [] args)
	{
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen adresinizi giriniz: ");
		
		
		String adres = klavye.nextLine();
		String arananMahalle = "Mahallesi";
		String arananSokak = "Sokak";
		String arananNo = "No: 123/A";
		String arananCadde = "Caddesi";
		String arananilce = "ilceniz";
		String arananil = "İzmir";
		String caddemiz = adres.substring(adres.indexOf(arananMahalle)+arananMahalle.length(),
				adres.indexOf(arananCadde));
		System.out.println("caddemizin ismi: "+ caddemiz);
		
		String sokak = adres.substring(adres.indexOf(arananCadde)+arananCadde.length(),
				adres.indexOf(arananSokak));
		
		System.out.println("Sokaginizin ismi: " + sokak  );
		
		String ilceniz = adres.substring(adres.indexOf(arananNo)+arananNo.length(),
				adres.indexOf(arananil));
		System.out.println("ilcenizin ismi: "+ ilceniz);
		
		
		String mahalleniz = adres.substring(adres.indexOf("ArananMahalle"),
				adres.indexOf(arananMahalle)-7);
		System.out.println("mahallenizin  ismi: "+ mahalleniz);
		
		
				

	}



		
	}


