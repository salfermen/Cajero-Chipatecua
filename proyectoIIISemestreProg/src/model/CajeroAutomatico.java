package model;

import java.util.HashMap;
import java.util.Map;

public class CajeroAutomatico {
    private Map<String, Cuenta> cuentas;

    public CajeroAutomatico() {
        this.cuentas = new HashMap<>();
    }

    public void agregarCuenta(String id, double saldo) {
        Cuenta cuenta = new Cuenta(id, saldo);
        this.cuentas.put(id, cuenta);
    }

    public void retirar(String id, double cantidad) {
        Cuenta cuenta = this.cuentas.get(id);
        if (cuenta != null) {
            cuenta.retirar(cantidad);
        } else {
            System.out.println("La cuenta con id " + id + " no se encuentra.");
        }
    }

    public void depositar(String id, double cantidad) {
        Cuenta cuenta = this.cuentas.get(id);
        if (cuenta != null) {
            cuenta.depositar(cantidad);
        } else {
            System.out.println("La cuenta con id " + id + " no se encuentra.");
        }
    }

    public void mostrarCuentas() {
        System.out.println("Lista de cuentas:");
        for (Map.Entry<String, Cuenta> entry : this.cuentas.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Saldo: " + entry.getValue().getSaldo());
        }
    }
}
