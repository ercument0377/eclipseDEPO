package defaoult;

import java.util.Queue;
import java.util.PriorityQueue;

public class Sira {

	public static void main(String[] args) {
		PriorityQueue<String> kuyruk = new PriorityQueue<String>();
		
		kuyruk.add("Selim");
		kuyruk.add("Ahmet");
		kuyruk.add("zaykut");
		kuyruk.add("fatih");
		kuyruk.add("mustafa");
		
	//	System.out.println(kuyruk.remove());
		
		System.out.println(kuyruk.peek());  // en usttekini 
		

	}

}
