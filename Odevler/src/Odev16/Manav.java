package Odev16;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Manav {

	
	    public static final File Urunler = new File("C:\\Users\\Asus\\eclipse-workspace\\Odevler\\src\\Odev16\\Urunler.txt");

	    public static void main(String[] args) {
	        Scanner klavye = new Scanner(System.in);
	        System.out.println("Domates almak icin 1e basiniz. ");
	        System.out.println("Muz almak icin 2e basiniz: ");
	        System.out.println("Elma icin 3e basiniz: ");
	        System.out.println("Uzum icin 4e basiniz: ");
	        System.out.println("Salatalik almak icin 5e basiniz: ");
	        System.out.println("incir almak icin 6 ya basiniz: ");
	        System.out.println("Mantar almak icin 7 ye basiniz: ");
	        System.out.println("Havuc almak icin 8e basiniz: ");
	        System.out.println("Ispanak almak icin 9a basiniz: ");
	        System.out.println("Brokoli almak icin 10a basiniz: ");
	        System.out.println("Karnabahar almak icin 11e basiniz: ");
	        System.out.println("Patates almak icin 12ye basiniz: ");
	        System.out.println("Sogan almak icin 13e basiniz: ");
	        System.out.println("Pirasa almak icin 14e basiniz: ");
	        System.out.println("Cikmak icin 15e basiniz: ");
	        int tercih = klavye.nextInt();

	        while (tercih != 15) {
	            switch (tercih) {
	            case (1): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo domates almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(Urunler, not, tercih);

	                break;
	            }
	           
	            case (2): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo muz almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (3): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo elma almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (4): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo Uzum almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (5): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo Salatalik almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (6): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo Incir almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            
	            }
	            case (7): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo mantar almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	                
	            }
	            case (8): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo havuc almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (9): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo ıspanak almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (10): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo brokoli almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (11): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo karnabahar almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (12): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo patates almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (13): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo sogan almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	            }
	            case (14): {
	                System.out.println("Ne almak istediginizi giriniz");
	                String ogrenciNo = klavye.next();
	                System.out.println("Kac kilo pirasa almak istediinizi giriniz");
	                int not = klavye.nextInt();
	                istenenKG(UrunNo, not, tercih);

	                break;
	           
	            }
	            case (15): {
	                break;
	            }
	            }

	            if (tercih != 15) {
				        Scanner klavye = new Scanner(System.in);
				        System.out.println("Domates almak icin 1e basiniz. ");
				        System.out.println("Muz almak icin 2e basiniz: ");
				        System.out.println("Elma icin 3e basiniz: ");
				        System.out.println("Uzum icin 4e basiniz: ");
				        System.out.println("Salatalik almak icin 5e basiniz: ");
				        System.out.println("incir almak icin 6 ya basiniz: ");
				        System.out.println("Mantar almak icin 7 ye basiniz: ");
				        System.out.println("Havuc almak icin 8e basiniz: ");
				        System.out.println("Ispanak almak icin 9a basiniz: ");
				        System.out.println("Brokoli almak icin 10a basiniz: ");
				        System.out.println("Karnabahar almak icin 11e basiniz: ");
				        System.out.println("Patates almak icin 12ye basiniz: ");
				        System.out.println("Sogan almak icin 13e basiniz: ");
				        System.out.println("Pirasa almak icin 14e basiniz: ");
				        System.out.println("Cikmak icin 15e basiniz: ");
	                     tercih = klavye.nextInt();
	            }
	        }
	    }

	    public static void kalanKGHesapla(String urunNo) {

	    }

	    public static void istenenKG(String urunNo, int KG, int fiyat) {
	        
	        try {
	            BufferedReader okuyucu = new BufferedReader(new FileReader(Urunler));

	            String metin = "";
	            String satir = "";
	            boolean urunBulunduMu = false;
	            while ((satir = okuyucu.readLine()) != null) {
	                int cizgiSayaci = 0;
	                if (satir.substring(0, 3).equals(urunNo)) {
	                    urunBulunduMu = true;
	                    if (fiyat < 2) {
	                        for (int i = 0; i < satir.length(); i++) {
	                            if (satir.charAt(i) == '-') {
	                                cizgiSayaci++;
	                            }
	                        }
	                      
	                    } else if (urunTuru == 4) {
	                        String satirYedek = satir.replace("\t", "");
	                        satirYedek = satirYedek.replace(" ", "");
	                        String[] KgFiyatDizisi = satirYedek.split("-");

	                        if (KgFiyatDizisi.length == 6) {
	                            double vize1Notu = Double.parseDouble(KgFiyatDizisi[2]);
	                            double vize2Notu = Double.parseDouble(KgFiyatDizisi[3]);
	                          

	                            double kalanKG = KG   + fiyat  ;
	                            satir += "\t- " + fiyat;
	                        } else if (KgFiyatDizisi.length < 15) {
	                            System.out.println("kg girilmeden fiyat hesaplanamz");
	                        } else if (KgFiyatDizisi.length > 15) {
	                            System.out.println("urun onceden satilmis");
	                        }
	                    }

	                }
	                metin += satir + "\n";
	            }
	            if (!urunBulunduMu) {
	                System.out.println("Girilen urun numarasi tasiyan bir urun bulunamadi!");
	            }
	            okuyucu.close();
	            BufferedWriter yazici = new BufferedWriter(new FileWriter(Urunler));
	            yazici.write(metin);
	            yazici.close();
	        } catch (IOException ioe) {   

	        }
	    }
	}

