
public class Kedi {

	private String isim;
	private int yas;
	private Sahip sahip;
	
	//Constructor
	public Kedi(String isim, int yas, Sahip sahip)
	{
		this.isim = isim;
		this.yas = yas;
		this.sahip = sahip;
		boolean kediEklendiMi = false;
		for(int i=0;i<sahip.getKediler().length;i++)
		{
			if(sahip.getKediler()[i]==null)
			{
				kediEklendiMi = true;
				sahip.getKediler()[i]=this;
				break;
			}
		}
		if(!kediEklendiMi)
			System.out.println("Kedi limitinizi doldurdunuz "+this.isim+ " eklenemedi. Baska kedi ekleyemezsiniz.");
	}
	
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public Sahip getSahip() {
		return sahip;
	}
	public void setSahip(Sahip sahip) {
		this.sahip = sahip;
	}
	public String getYas() {
		return yas;
	}
	public void setYas(String yas) {
		this.yas = yas;
	}
}
	
	
	
