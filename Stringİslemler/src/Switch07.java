import java.util.Scanner;

public class Switch07 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		String s4 = "java";
String s5 = "Java kolaydir";
String s6 = "Java ogrenmek guzeldir";
String s7 = "Java ogren, para kazan, hayatini yasa";

System.out.println(s4.toUpperCase());

// s4 = s4.toLowerCase();

System.out.println(s4.toLowerCase());
System.out.println(s5.contains("a"));
System.out.println(s5.length());
System.out.println(s5.indexOf("v"));
System.out.println(s5.indexOf("ava"));
System.out.println(s6.indexOf('e' , 10));
System.out.println("aferin");

   System.out.println(s7.lastIndexOf("a"));
   System.out.println(s7.lastIndexOf("ren"));
   System.out.println(s7.lastIndexOf(" "));
   System.out.println(s7.lastIndexOf("a",4));
   
   for(int i=0; i<s7.length(); i++) {
   if (s7.indexOf(s7.charAt(i)) == s7.lastIndexOf(s7.charAt(i))) {
	   System.out.print(s7.charAt(i)+ " ");
 // }else {
//   System.out.print( s7.charAt(i)+ " ");
   }
	   
   }
   System.out.println(" ");
   
   for( int i= s7.length()-1; i>=0; i--) {
	   
	   System.out.print(s7.charAt(i)+ " ");
	   
   }
   
   String s8 = "Java Kolaydir";
   
   System.out.println();
   System.out.println(s8.startsWith("J"));
   System.out.println(s8.startsWith("Java"));
   System.out.println(s8.startsWith("K", 5));
   System.out.println(s8.endsWith("Kolaydir"));
  
   String s9 = "";
   String s10 = null;
   String s11 = "             ";
   String s12 = "      abc     ";
   
   System.out.println(s9.isEmpty());
   System.out.println(s11.isBlank());
   System.out.println(s12.isBlank());
   
   
   String s13= "Ahmet";
   String s14 = "Mehmet";
   System.out.println(s13+ " "+s14 );
   
   
   char a='u';
   char b='y';
   int z = 13;
   System.out.println(a+b);
   System.out.println(12+s13+12);
   
   String s15= "$399.99";
   System.out.println(s15.replace("$" , "").replace(".","abc" ).replace("9", "i"));
   
   
   System.out.println(s8.replace("Java", "ilyas").replace("Kolaydir", "yakisiklidir"));
   
   String s19= " Java kolaydir";
		   System.out.println(s19.substring(2,5));
		   
		 
		   System.out.println("lutfen bir cumle giriniz");
		   String str = scan.nextLine();
		   
		  String ilk = str.substring(0, 1); // charAt(0)
		   String son = str.substring(str.length()-1);  // str.charAt()str.length()-1);
		   
		   System.out.println("ilk karakter: " + ilk );
		   
		   
		   System.out.println("son karakter: "+ son);
		   
		   
		   

	}

}
