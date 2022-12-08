import java.util.Arrays;
public class Sinif13 {

	
	
	
	private static int j;

	public static void main(String[] args) {
		
		String str = "hosgeldinz";
		char gecici = 0;
		char arr[] = str.toCharArray();  //str.split("")
		
	
		System.out.println(Arrays.toString(arr)+"\n"); //[H, o, s, g, e, l, d, i, n, z, .]
		
		for( int i=0; i<arr.length; i++ ) {
			for (j=0; j<arr.length;j++ ) {
				if(arr[j]>arr[i] ) {
					gecici = arr[i];
					arr[i] = arr[j];
					arr[j] = gecici;
					
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));  //[d, e, g, h, i, l, n, o, s, z]
	}

}
