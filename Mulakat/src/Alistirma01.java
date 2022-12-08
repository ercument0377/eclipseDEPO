import java.util.Arrays;

public class Alistirma01 {
	
	
	//verilen bir Stringdeki karakterleri A dan Z ye siralayiniz
	//ornek: str = "Hosgeldiniz;     

	public static void main(String[] args) {
		
		String str = "hosgeldiniz";
		char gecici =0;
		char arr[] = str.toCharArray();  // str.split("");
		System.out.println(Arrays.toString(arr)); //[H, o, s, g, e, l, d, i, n, i, z]
		System.out.println(Arrays.toString(arr)+ "\n");
		
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (arr[j]>arr[i]) {
					gecici = arr[i];
					arr[i] = arr[j];
					arr[j] = gecici;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(arr)); //[d, e, g, h, i, i, l, n, o, s, z]
	}

}
