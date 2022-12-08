import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {

	
	
	public static void main(String[] args) {
		/*
		 Date() kullanarak
		 1. kodların ne kadar surede sonuçlandığını görebiliriz
		 2. ScreenShot yada video kaydı alıp raporlara ekleyebiliriz
		  
		 */
	//	LocalDate.guncelTarih = new LocalDate();
		
		LocalDate guncelTarih = LocalDate.now();
		System.out.println(guncelTarih);   //2022-10-16
		
		System.out.println(guncelTarih.plusDays(5)); //5gun sonrasını verir 2022-10-21

		System.out.println(guncelTarih.minusDays(5)); //5 gun öncesini verir  2022-10-11
	
		System.out.println(guncelTarih.plusMonths(5));	//5 ay sonrasını veririr
		
		System.out.println(guncelTarih.plusYears(5));  // 5 yıl sonrasını verir 2027-10-16
	
		
		// 3 yıl 5 ay 7 gun sonraki tarihi yazdıralım
		
		System.out.println(guncelTarih.plusYears(3).plusMonths(5).plusDays(7)); //2026-03-23
		
		System.out.println(guncelTarih.getDayOfMonth()); //içinde bulundugumuz ayın gununu verir ayın 16sındayız
		
		System.out.println(guncelTarih.getDayOfWeek());  // içinde bulunduğumuz haftanın gununu gösterir SUNDAY cumartesi
		
		System.out.println(guncelTarih.getMonth());   // iç,nde bulunduğumuz yılın hangi ayında olduğumuzu verir OCTOBER ekimdeyiz
		
		System.out.println(guncelTarih.getMonthValue()); // kaçıncı ayda olduğumuzu yazdırır 10. aydayız
		
		
		LocalDate belliBirTarih = LocalDate.of(1991, 3, 25);
		System.out.println(belliBirTarih); //1991-03-25
		
		// 2 tarih arasında kıyaslama yapılabilir
		
		System.out.println( belliBirTarih.isAfter(guncelTarih)); //false
		
		System.out.println( belliBirTarih.isBefore(guncelTarih)); //true
	
	// tarihler  yıl+gun+ay == yyy-MM-dd şeklinde yazılır   defoult format
	// M = month=ay, m = minutes= dakika
		/*
		 MM = kaçıncı aydayız verir (-00-)
		 MMM = bulunduğumuz ayın isminin ilk 3 karakterini verir = October = Ocb
		 MMMM = bulunduğumuz ayın isminin tamamını veir = October
		 */
		
		DateTimeFormatter tarihiFormatla = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
		System.out.println(tarihiFormatla.format(guncelTarih)); //16/Eki/2022
		
		DateTimeFormatter tarihiFormatla1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
		System.out.println(tarihiFormatla1.format(guncelTarih));        //16/Ekim/2022
	
		DateTimeFormatter tarihiFormatla2 = DateTimeFormatter.ofPattern("dd/MM/yy");
		System.out.println(tarihiFormatla2.format(guncelTarih));        // 16/10/22
	
		System.out.println(tarihiFormatla2.format(guncelTarih.minusMonths(3)));  // 3 ay çıkardık 16/07/22
		
		
		LocalTime guncelSaat = LocalTime.now(); // şuanda hangi saatte isek onu verir
		System.out.println(guncelSaat);  //12:43:28.739072600
		
		/*
		 hh = am - pm  format
		 HH = 24 saatlik format verir 
		 */
		
		
		DateTimeFormatter saatiFormatla = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(saatiFormatla.format(guncelSaat));  // 12 saatlik format güncel saati verir 12:50
		
		DateTimeFormatter saatiFormatla1 = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(saatiFormatla1.format(guncelSaat));  // güncel saati verir 01:00 PM
		
		
		DateTimeFormatter saatiFormatla2 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(saatiFormatla2.format(guncelSaat));   // 24 saatlik format verir 13:02
		
		
		LocalDate t1 = LocalDate.now();
		LocalDate t2 = LocalDate.of(2015, 5, 18);
		Period fark = Period.between(t1, t2);
		System.out.println(fark);  // P-7Y-4M-29D
		
		int ayFarki = Period.between(t1,t2).getMonths();
		System.out.println(ayFarki);            // -4 ay fark var 
		System.out.println(Math.abs(ayFarki));  // eksiyi artıya çevirir 4 ay fark var
		
		String toplam = Period.between(t1,t2).getYears()*12+Period.between(t1,t2).
				getMonths()+" ay"+ Period.between(t1, t2).getDays()+ " gun";
		
		System.out.println(toplam); // -88 ay-29 gun  aradaki farkı ay olarak gösterir
		
		
		
		
		
	}

}
