import java.util.Arrays;

public class Sinif6 {

	public static void main(String[] args) {
		
		String s1 = "Java lava degildir";
		
		System.out.println(s1.toUpperCase().replaceAll ("L" , "s").replaceAll ("JAVA" , "armut"));  //*1*2*3*5***4*5*4**4*
		
		String s2 ="A1B2C3D5  A4D5F4EF4V";
		System.out.println(s2.replaceAll("\\d", "*"));   //*1*2*3*5***4*5*4**4*
		System.out.println(s2.replaceAll("\\D", "*"));   //*1*2*3*5***4*5*4**4*
		
		String s3 ="ABCD DEFG HDTE 123";
		System.out.println(s3.replaceAll("\\D", "*"));  //***************123
		
		String s4 = "a0C1_!   xB9m?";
		System.out.println(s4.replaceAll("\\w", "*"));  //*****!   ****?
		System.out.println(s4.replaceAll("\\W", "*")); //a0C1_****xB9m*
		
		String s5 = "     Ali     okula   gel   ";
		System.out.println(s5.replaceAll("\\s", "*"));  //*****Ali*****okula***gel***
		System.out.println(s5.replaceAll("\\S", "*"));  //     ***     *****   ***  
		
		String s6 = "3,159.99 ";
		System.out.println(s6.replaceAll("\\A", "Dolar "));  //Dolar 3,159.99 
		System.out.println(s6.replaceAll("\\Z", "Dolar"));    //3,159.99 Dolar
		
		String s7 = "Ali Can Bey";
		System.out.println(s7.replaceAll("[lCy]", "x")); //Axi xan Bex
		System.out.println(s7.replaceAll("[^Ai]", "Z"));  //AZiZZZZZZZZ
		
		String s8 = "Ali Can Bey";
		String [] arr = s8.split(" ");
		System.out.println(Arrays.toString(arr));  //[Ali, Can, Bey]
		
		
		
	}
}
