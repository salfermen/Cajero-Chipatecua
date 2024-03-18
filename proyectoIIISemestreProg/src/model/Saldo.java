package model;

public class Saldo {
	private int saldo;

	// Constructor
	public Saldo() {
		this.saldo = 0;
	}

	// Método para obtener el saldo actual
	public int getSaldo() {
		return saldo;
	}

	// Método para establecer el saldo actual
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
