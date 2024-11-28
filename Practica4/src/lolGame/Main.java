package lolGame;

import java.util.Hashtable;

public class Main {

	public static void main(String[] args) {
		Campeon c1 = new Campeon("c1", "t1", 3000, 300, 200);
		Campeon c2 = new Campeon("c2", "t2", 2000, 500, 250);
		
		Hashtable<Integer,Habilidad> h_c1 = new Hashtable<Integer,Habilidad>();
		Hashtable<Integer,Habilidad> h_c2 = new Hashtable<Integer,Habilidad>();
		
		Habilidad h1 = new Habilidad("h1", 1000, "t1");
		Habilidad h2 = new Habilidad("h2", 800, "t2");
		Habilidad h3 = new Habilidad("h3", 900, "t3");
		Habilidad h4 = new Habilidad("h4", 1100, "t4");
		Habilidad h5 = new Habilidad("h5", 950, "t5");
		
		h_c1.put(1, h1);
		h_c1.put(2, h3);
		h_c1.put(3, h5);
		
		h_c2.put(1, h2);
		h_c2.put(2, h4);
		
		c1.setHabilidades(h_c1);
		c2.setHabilidades(h_c2);
	}

}
