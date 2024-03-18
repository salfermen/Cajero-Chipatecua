package model;


import java.util.HashMap;

public class CVC {
	private int cvc;
	private HashMap<Integer, Integer> miniBase;

	// Constructor
	public CVC() {
		this.miniBase = new HashMap<>();
	}

	// Métodos para obtener y establecer el CVC
	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	// Métodos para obtener y establecer la miniBase
	public HashMap<Integer, Integer> getMiniBase() {
		return miniBase;
	}

	public void setMiniBase(HashMap<Integer, Integer> miniBase) {
		this.miniBase = miniBase;
	}
}
