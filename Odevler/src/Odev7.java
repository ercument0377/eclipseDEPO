import java.util.Scanner;
public class Odev7 {

	public static void main(String[] args) {
		  Scanner klavye = new Scanner (System.in);

          int [] sayiDizisi = {1,2,3,6,5,4,7,5,8,0,7,3};

          for(int i=1;i<sayiDizisi.length;i++)

          {
              if (sayiDizisi[i-1]<sayiDizisi[i]&&sayiDizisi[i]>sayiDizisi[i+1])
            {

         System.out.println(i+" Indeksindeki "+sayiDizisi[i]+" sayisi, " +(i-1)+" indeksindeki "

                  +sayiDizisi[i-1]+" sayisi ile "+(i+1)+" indeksindeki "+sayiDizisi[i+1]+" sayisindan buyuktur.");

                  }

          }

  }



    }
