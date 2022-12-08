import java.util.ArrayList;

public class Odev {

	public static void main(String[] args) {
		
		 // 2 boyutlu arrayi tek boyutlu arraye cevirme
				
		int [][] arr = { {1,2,3,4}, {5,6,7}, {8,9,10,11,12,13}};
		int uzunluk = 0;
		for (int i=0; i<arr.length; i++) {
			uzunluk+= arr[i].length;
			
		}
		
		int[] tekBoyutluDizi = new int[uzunluk];
		
		int sayac = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				tekBoyutluDizi[sayac] = arr[i][j];
				sayac++;
			}
		}
		
	/*	for (int i=0; i<tekBoyutluDizi.length; i++) {
			System.out.print(tekBoyutluDizi[i]+" "); //1 2 3 4 5 6 7 8 9 10 11 12 13 
		}  */
		
   arrayListleCoz(arr);
	}
	
	public static void arrayListleCoz(int[][] arr) {
		ArrayList<Integer> sayiDizisi = new ArrayList<Integer>();
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				sayiDizisi.add(arr[i][j]);
			}
		}
		for ( int i=0; i< sayiDizisi.size(); i++) {
			System.out.print(sayiDizisi.get(i) + ","); //1,2,3,4,5,6,7,8,9,10,11,12,13,
		}
	}

}
