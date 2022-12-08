import java.util.Scanner;

public class Switch05 {

	public static void main(String[] args) {
	
			Scanner klavye = new Scanner(System.in);
			
			int y = 11;
			int z =11;
			
            int sonuc = y<10 ? y++ : z++;
			System.out.println(y+","+z);
	}

}
