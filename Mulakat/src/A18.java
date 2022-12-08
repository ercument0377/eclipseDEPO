import java.util.Scanner;

public class A18 {
	
	/*
	 * boyutunu ve elemanlarını kullanıcıdan alacagınız bır array olusturun
	 * bu arrayın elemanlarında kaç karakter kullanıldıgınız bulan bır kod yazınız
	 * 
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen arrayin boyutunu giriniz");
		
		int boyut = scan.nextInt();
		
		String arr[] = new String[boyut];  // null dır bilmediğimiz için 
		
		
		for( int i=0; i<arr.length; i++ ) {
			System.out.println("Lutfen "+(i+1)+ ". elemani giriniz");
			arr[i] = scan.next();

	}
	
		int toplam =0;
		for(int i=0; i<arr.length; i++) {
			toplam = toplam+arr[i].length();
	   
   }
   System.out.println(toplam);
}
}
