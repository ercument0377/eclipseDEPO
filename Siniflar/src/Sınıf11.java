
public class Sınıf11 {

	public static void main(String[] args) {
		
		int[] sayiDizisi = {2,3,6,5,2,1,1,48,2,6,1,11,22,5,88,6};
		int[] sayiDizisi2 = {55,33,66,5,6,1,22,33,88,7,1,8,9,5,55,11,6} ;
		
		sayiDizisi=diziyiSirala(sayiDizisi);
		diziyiYazdir(sayiDizisi);
		
		sayiDizisi2 = diziyiSirala(sayiDizisi2);
		diziyiYazdir(sayiDizisi2);
		
		
		
	}
	//verilen dizinin sıralanmış halini döndürür.
	public static  int[] diziyiSirala(int[] dizi) {
		
		
		
		
		for(int j=0; j<dizi.length;j++) {
			int enKucuk = dizi[j];
			int enKucukIndex  =j;
		for(int i=j; i<dizi.length; i++) {
			if(dizi[i]<enKucuk) {
				enKucuk = dizi[i]; 
				enKucukIndex  = i;
			}
		}
	
		dizi[enKucukIndex] = dizi[j];
		dizi[j] = enKucuk;
	
	
	}
		return dizi;
}
		
		
	
	

	
	
	// verilen dizinin elemanlarını birer birer indexleri ile yazdırır.
			public static void diziyiYazdir(int[] dizi) {
				for (int i=0; i<dizi.length; i++) {
					System.out.println((i+1)+ ". eleman:\t" + dizi[i] );
		}
}
}
