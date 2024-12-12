package Objetos;

public class Maleta1 {

	
	private String modelo;
	private int peso;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Maleta1(String modelo, int peso) {
		super();
		this.modelo = modelo;
		this.peso = peso;
	}
	
}
