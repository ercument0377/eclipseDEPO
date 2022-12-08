import java.util.Arrays;

public class Alistirma04 {

	// verilen bir integer Array de kayıp degeri (sayiyi) bulan bir java  kodu yaziniz
	// int [] arr = {0,1,2,5,3,5,7,7,9,9,9};

	public static void main(String[] args) {
		int [] arr = {0,1,2,5,3,5,7,7,9,9,9};
		int [] yeni = new int[arr.length];
	
		System.out.println(Arrays.toString(yeni));  //[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		for( int w: arr ) {
			yeni[w]=1;
			
		}
		System.out.println(Arrays.toString(yeni)); // [1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0]
		
		for(int i=0; i<yeni.length; i++) {
			if(yeni[i] == 0 ) {
				System.out.print(i+" " );  // 4 6 8 10 
				
			}
			
		}
		
	}

}
