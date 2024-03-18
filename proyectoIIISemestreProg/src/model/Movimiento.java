package model;

import model.*;

public class Movimiento {
	private int retiro;
	private int deposito;

	// Método para realizar un retiro
	public void retirar(int cantidad) {
		if (cantidad > 0) {
			retiro += cantidad;
			System.out.println("Se ha retirado $" + cantidad + " correctamente.");
		} else {
			System.out.println("Cantidad inválida para retirar.");
		}
	}

	// Método para realizar un depósito
	public void depositar(int cantidad) {
		if (cantidad > 0) {
			deposito += cantidad;
			System.out.println("Se ha depositado $" + cantidad + " correctamente.");
		} else {
			System.out.println("Cantidad inválida para depositar.");
		}
	}

	// Método para obtener el monto retirado
	public int getRetiro() {
		return retiro;
	}

	// Método para establecer el monto retirado
	public void setRetiro(int retiro) {
		this.retiro = retiro;
	}

	// Método para obtener el monto depositado
	public int getDeposito() {
		return deposito;
	}

	// Método para establecer el monto depositado
	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}
}
