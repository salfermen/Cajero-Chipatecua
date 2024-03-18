package control;

import model.*;

public class Controller {
    private static final int ContrasenaDefault = 0; // Ejemplo de contraseña
    private final Movimiento movimiento;
    private final Contrasena contrasena;
    private boolean accesoPermitido;

    // Constructor
    public Controller() {
        movimiento = new Movimiento();
        contrasena = new Contrasena(ContrasenaDefault);
        accesoPermitido = false;
    }

    // Método para determinar el acceso
    public void determinarAcceso(int usuario, int contraseña) {
        if (contrasena.verificarContrasena(usuario, contraseña)) {
            System.out.println("Acceso permitido.");
            accesoPermitido = true;
        } else {
            System.out.println("Acceso denegado.");
            accesoPermitido = false;
        }
    }

    // Método para verificar si el acceso está permitido
    public boolean isAccesoPermitido() {
        return accesoPermitido;
    }

    // Método para realizar un retiro
    public void realizarRetiro(int cantidad) {
        if (accesoPermitido) {
            movimiento.retirar(cantidad);
        } else {
            System.out.println("No tiene acceso para realizar esta operación.");
        }
    }

    // Método para realizar un depósito
    public void realizarDeposito(int cantidad) {
        if (accesoPermitido) {
            movimiento.depositar(cantidad);
        } else {
            System.out.println("No tiene acceso para realizar esta operación.");
        }
    }

    // Método para verificar saldo
    public void verificarSaldo() {
        if (accesoPermitido) {
            System.out.println("El saldo actual es: " + movimiento.getSaldo());
        } else {
            System.out.println("Acceso denegado. No tiene permiso para verificar el saldo.");
        }
    }

    // Método para modificar contraseña
    public void modificarContraseña(int nuevaContraseña) {
        if (accesoPermitido) {
            contrasena.cambiarContrasena(nuevaContraseña);
        } else {
            System.out.println("No tiene acceso para realizar esta operación.");
        }
    }

    // Método para finalizar la sesión
    public void finalizar() {
        System.out.println("Sesión finalizada.");
        accesoPermitido = false;
    }
}
