
public class Alistirma03 {

	// verilen n-1 integer Array de elemanlar 1 ile 'n' arasindadir.
	///1,2,3,4 ==> 5-1 > 4  n-1 demek elemanlar 1 ile 4 arasındadır demek.
	// 1,2,3,4 ==> 10
	// verilen bir integer Array de kayıp degeri (sayiyi) bulan bir java  kodu yaziniz(Arrayde tekrar eden eleman yoktur)
	// orn: n=10 ise elemanları toplamı 
	 //   toplam = (n*(n+1)/2 =55
	
	
	public static void main(String[] args) {
		
		int [] arr = {1,2,3,4,6,5,7,9};
		int uzunluk = arr.length+1;  //  uzunluk 9 yaptık
		
		int k =kayipDeger(arr,uzunluk);
		System.out.println(k);  // 8 sonuc kayip deger


	}
	public static int kayipDeger(int arr [], int uzunluk) {
		
		int toplam = uzunluk*(uzunluk+1)/2;  // toplamı 45 olacak
		
	 for ( int i=0; i<arr.length; i++) {
		 
		 toplam = toplam - arr[i];
		 
	 }
	 
		return toplam ;
 }
	
}
