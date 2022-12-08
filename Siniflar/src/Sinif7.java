import java.util.Arrays;

public class Sinif7 {

	public static void main(String[] args) {
		
		int arr [] = new int[3];
		System.out.println(Arrays.toString(arr));  //[0, 0, 0]
	//deger atadık	
		arr[1]=11;
		arr[0]=12;
		arr[2]=14;
		
		System.out.println(Arrays.toString(arr));  //[12, 11, 14]

		System.out.println(arr[2]);  //14
		
		
		String isim[] = new String[5];
		System.out.println(Arrays.toString(isim));  //[null, null, null, null, null]
	//deger atadık	
		isim[1]="Ahmet Can";
		isim[0]="Mehmet Art";
		isim[2]="SElami Sel";
		isim[3]="Mustafa Mus";
		isim[4]="Osman OS";
		
		System.out.println(Arrays.toString(isim));  //[Mehmet Art, Ahmet Can, SElami Sel, Mustafa Mus, Osman OS]

		
		
		
	}

}
