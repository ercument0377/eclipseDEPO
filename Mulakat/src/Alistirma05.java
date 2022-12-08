
public class Alistirma05 {

	int a;
	int b;
	
	Alistirma05(int a, int b) {
		this.a = a;
		this.b = b;
	}
	Alistirma05(){
	}
	public static void main(String[] args) {
		Alistirma05 or = new Alistirma05(3,5);  // sınıf adi Alistirma05 olduğu için yazıldı
		or = new Alistirma05();
		System.out.println(or.a + or.b);  // 0
		

	}

}
