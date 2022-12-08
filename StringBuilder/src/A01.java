
public class A01 {

	public static void main(String[] args) {
		// String  immutable (guncellenemezler)
		// bu nedenle JAVA Stringbulder olusturmustur
		// Stringbuilder guncellenebilirler
		
		
		String str = "Alistirma";
		str.substring(2);
		str.toUpperCase();   //ALISTIRMA
		System.out.println(str);               // Alistirma
		System.out.println(str.toUpperCase());  // AL�ST�RMA

		// Stringbulder olusturmak için 3 yol var (bir öncekine ekleme) 
		
		// 1.YOL
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.capacity());  // 16
		
    	sb.append("Ali");
    	sb.append(" javayi seviyorum");
		System.out.println(sb); //  Ali javayi seviyorum
		
		// 2.YOL  ekleme yapar
		
		StringBuilder sb1 = new StringBuilder(" Veli Pyton calisir."); //Veli Pyton calisir.
		System.out.println(sb1);           //  Veli Pyton calisir.
		System.out.println(sb1.length()); // 20 
		sb1.append("Ahmet SQL ogrendi.");
		System.out.println(sb1);  // Veli Pyton calisir.Ahmet SQL ogrendi.
		
		
		// 3.YOL 
		
		StringBuilder sb2 = new StringBuilder(5);
		sb2.append("Zeynep"); //eger rezerve edilen kapasite eklenmek istenen karakterden küçük ise kapasitede rezerve(5) *2+2 olur
		System.out.println(sb2.capacity());  // zeynep =6   5 te kapasite biz verdik = 12 oldu
		System.out.println(sb2.length()); // 6
		
		// ornek
		
		StringBuilder sb3 = new StringBuilder("java");
		sb3.append("+").append("Selenium").append("+").append("SQL").append(" = yuksek maasli bir is verir");
		System.out.println(sb3);  //java+Selenium+SQL = yuksek maasli bir is verir
		
		
		
		// spesifik indexler arasında karakter veya grubu eklnebilir
		
		sb3.append(" + konforlu hayat  ", 0, 18);
		System.out.println(sb3);   // java+Selenium+SQL = yuksek maasli bir is verir + konforlu hayat
		 
		sb3.append(sb2,0, 6);
		System.out.println(sb3);  //java+Selenium+SQL = yuksek maasli bir is verir + konforlu hayat Zeynep
		
		sb3.append(sb2,0, 6);
		System.out.println(sb3.charAt(5)); // S
		System.out.println(sb3.deleteCharAt(5));  // S yi sildi
		System.out.println(sb3.delete(5, 13));  // 5 ile 13 arasını siler
		
		
		// reverse
		
		StringBuilder sb4 = new StringBuilder("Ahmet ve  Ibrahim caliskandir");
	//	sb4.reverse();
		System.out.println(sb4); // ridnaksilac miharb�  ev temhA
		
		System.out.println(sb4.indexOf("b")); // b nin indexini verir 17
		System.out.println(sb4.indexOf("b", 13)); // 13.indexten sonra  b yi ekler
		System.out.println(sb4.indexOf("o"));  // olmayan karakter -1 verir
		
		
		
		// insert   istediğim yere ekleme yapabilirim
		
		System.out.println(sb4.insert(5, " ve Mehmet "));  //ridna ve Mehmet ksilac miharb�  ev temhA
		
		//replace
		System.out.println(sb4.replace(5, 5, " * ")); // Ahmet *  ve Mehmet  ve  �brahim caliskandir
		
		// set char  // belirlediğimiz indexe başka bir karakter ekleriz
		
		sb4.setCharAt(1, '*');
		System.out.println(sb4);  // A*met *  ve Mehmet  ve  Ibrahim caliskandir
		
		// trimToSize  kapasiteyi düşürür
		
		StringBuilder sb5 = new  StringBuilder("Ahmet");
		System.out.println(sb5.capacity()); //21
		sb5.trimToSize();   // kapasiteyi düşürüyoruz burada 
		System.out.println(sb5.capacity());  //  kapasiteyi 5 e düşürdük 
		
		
		
		
	}

}
