
public class Sinif15 {
	
	
	
	
	

	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7,9}; //uzunlk 8 ama 1 eksik
		int uzunluk = arr.length+1; //9 uzunluk gösterir
		
		int k = kayipDeger(arr,uzunluk);
		System.out.println(k); //eksik elemanı verir

	}
	public static int kayipDeger(int arr [], int uzunluk) {
		int toplam = uzunluk*(uzunluk+1)/2; //45
		for (int i=0; i<arr.length; i++) {
			toplam = toplam - arr[i];
			
			
		}
		
		
		return toplam;
	}

}
