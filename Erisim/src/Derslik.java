
public class Derslik {
	
	String isim;
	int kapasite;
	
public Derslik( String isim, int kapasite)
      {
	
	this.isim = isim;
	this.kapasite = kapasite;
	Okul.derslikler.add(this);
	
	
        }
}
