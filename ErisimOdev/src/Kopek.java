
public class Kopek {

	private String isim;
	private int yas;
	private Sahip sahip;
	
	
	//Constructor
		public Kopek(String isim, int yas, Sahip sahip)
		{
			this.isim = isim;
			this.yas = yas;
			this.sahip = sahip;
			
			boolean kopekEklendiMi = false;
			for(int i=0;i<sahip.getKopekler().length;i++)
			{
				if(sahip.getKopekler()[i]==null){
					kopekEklendiMi = true;
					sahip.getKopekler()[i]=this;
					break;
				}
			}
			if(!kopekEklendiMi)
				System.out.println("Kopek limitinizi doldurdunuz "+this.isim+ " eklenemedi. Baska kopek ekleyemezsiniz.");
		}
	
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getIsim() {
		return isim;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	public int getYas() {
		return yas;
	}
	public void setSahip(String sahip) {
		this.sahip = sahip;
	}

	public String getSahip() {
		return sahip;
	}

	
}
