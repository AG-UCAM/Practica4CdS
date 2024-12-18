package lolGame;

import java.util.Hashtable;

public class Campeon {
	
	private String nombre;
	private String rol;
	private int puntos_vida;
	private int dano_ataque;
	private int defensa;
	private Hashtable<Integer,Habilidad> habilidades;
	
	//Clase camp
	public Campeon(String nombre, String rol, int puntos_vida, int dano_ataque, int defensa) {
		this.nombre = nombre;
		this.rol = rol;
		this.puntos_vida = puntos_vida;
		this.dano_ataque = dano_ataque;
		this.defensa = defensa;
	}

	public void atacar(Campeon campeon) {
		campeon.recibir_dano(this.dano_ataque);
	}
	
	public void usar_habilidad(Habilidad habilidad, Campeon campeon) {
		habilidad.aplicar(campeon);
	}
	
	public void recibir_dano(int dano) {
		if(this.defensa < dano)
			this.puntos_vida -= (dano-defensa);
	}
	
	public Hashtable<Integer, Habilidad> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(Hashtable<Integer, Habilidad> habilidades) {
		this.habilidades = habilidades;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean esta_vivo() {
		if(this.puntos_vida > 0)
			return true;
		return false;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public int getPuntos_vida() {
		return puntos_vida;
	}

	public void setPuntos_vida(int puntos_vida) {
		this.puntos_vida = puntos_vida;
	}

	public int getDano_ataque() {
		return dano_ataque;
	}

	public void setDano_ataque(int dano_ataque) {
		this.dano_ataque = dano_ataque;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}

}
