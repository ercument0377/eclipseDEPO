
public class A30 {

	/*
	 
	 Abstack Class ile interface arasındaki farklar nelerdir.
	 
	 Methodlar için:
	 1- Abstact classlar hem absract  hem de concrate methodlara sahiptir
	   -Interface'ler sadece abstract methodlara sahip olabilir
	NOT: Eğer interface için concrete method olusturmak istiyorsak, ya "static" ya da "default" kavramlarını kullanmalıyız
	 2- Abstract classlardaki methodlar herhangi bir access modifier alabilir
	   - interface'lerki methodlar KESİNLİKLE public'tir
	 3- Abstract class'larda constructor vardır, interface'lerde constructor yoktur.
	   - her ikisinde obje oluşturulmaz
	 
	 
	 Variable (değişken) için:
	 1- Abstract class'ta tüm değişken çeşitleri kullanılabilir
(ÖNEMLİ)- interface'lerde SADECE "public", "static" ve "final"  değişkenleri kullanılabilir
	     NOT: interface de değişkenler final oldugu için MUTLAKA değer atanmalı 
	     int x=12; gibi 
	     
	 2- interface'ler yardımıyla class'lar için çoklu ebeveynlik kullanılabilir
	    (multiple parents)
	    
	 3- Class "extends" class
	    interface  "extends" interface
	    Class "implements" interface
	    interface'ler bir (class) sınıfın cocugu olamaz.
	 
	 */
	
	
	public static void main(String[] args) {
	

	}

}
