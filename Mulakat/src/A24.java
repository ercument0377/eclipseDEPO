import java.util.Arrays;

public class A24 {
	
	/* Ebay Mulakat sorusu
	Sıfır olan integer Array deki elemeanları en sona taşıyan br kod yazınız
	   {3,0,4,2,0} ==> {3,4,2,0,0}
	*/

	public static void main(String[] args) {
		
		int a [] = {3,0,4,2,05,0,0,45,88};
		
		int b[] = new int [a.length];
		
		System.out.println(Arrays.toString(b));  //[0, 0, 0, 0, 0, 0, 0, 0, 0]

		int  index =0;
		
		for( int i=0; i<a.length; i++) {
			if (a[i]!=0 ) {
				b[index]=a[i];
				index++;
				
			}
			
		}
		
		System.out.println(Arrays.toString(b)); //[3, 4, 2, 5, 45, 88, 0, 0, 0]
	}

}
