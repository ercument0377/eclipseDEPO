import java.util.Scanner;
public class Stringİslemleri {
	
	public static void main(String [] args)
	{
		Scanner klavye = new Scanner(System.in);
		System.out.println("Lutfen adresinizi giriniz:   ");
		
		
		String adres = klavye.nextLine();
		String arananMahalle = "Mahallesi";
		String arananSokak = "Sokak";
		String arananNo = "No: 123/A";
		String arananCadde = "Caddesi";
		String arananIlce = "ilceniz";
		String arananil = "İzmir";
		String caddemiz = adres.substring(adres.indexOf(arananMahalle)+arananMahalle.length(),
				adres.indexOf(arananCadde));
		System.out.println("caddemizin ismi: "+ caddemiz);
		
		String sokak = adres.substring(adres.indexOf(arananCadde)+arananCadde.length(),
				adres.indexOf(arananSokak));
		
		System.out.println("Sokaginizin ismi: " + sokak  );
		
		String Ilceniz = adres.substring(adres.indexOf(arananNo)+arananNo.length(),
				adres.indexOf(arananil));
		System.out.println("ilcenizin ismi: "+ Ilceniz);
		
		
		int baslangicIndex = 0;
		int mahallesiIndex = adres.indexOf("Mahallesi");
		String mahalle = adres.substring(baslangicIndex,mahallesiIndex);
				
		System.out.println("mahallenizin  ismi: "+ mahalle);
		
		
				

	}
}

