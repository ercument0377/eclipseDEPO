import java.util.Scanner;

public class Sinif8 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	
	System.out.println("lutfen ucgen buyuklugunu giriniz");
	int kenar = scan.nextInt();
	
	for ( int i=1; i<=kenar; i++) {
		for (int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
    }
	
	scan.close();
	}
	}

