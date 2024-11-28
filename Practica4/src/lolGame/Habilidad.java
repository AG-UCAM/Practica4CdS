package lolGame;

import java.util.Timer;
import java.util.TimerTask;

public class Habilidad {
	
	private String nombre;
	private int dano;
	private String tipo;
	private int buffT;
	
	public Habilidad (String nombre, int dano, String tipo) {
		this.nombre = nombre;
		this.dano = dano;
		this.tipo = tipo;
	}
	
	public Habilidad(String nombre, int dano, String tipo, int buffT) {
		this.nombre = nombre;
		this.dano = dano;
		this.tipo = tipo;
		this.buffT = buffT;
	}
	
	public void aplicar(Campeon campeon) {
		if(this.getTipo().equals("cura")) {
			campeon.setPuntos_vida(campeon.getPuntos_vida()+this.dano);
			if(campeon.getPuntos_vida() > 3000)
				campeon.setPuntos_vida(3000);
		}
		if(this.getTipo().equals("buff")) {
			int cDano = campeon.getDano_ataque();
			campeon.setDano_ataque(cDano+this.dano);
			Timer timer = new Timer();
	        timer.schedule(new TimerTask() {
	            @Override
	            public void run() {
	                campeon.setDano_ataque(cDano);
	                timer.cancel();
	            }
	        }, this.buffT);
		}
		else
			campeon.recibir_dano(this.dano);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}