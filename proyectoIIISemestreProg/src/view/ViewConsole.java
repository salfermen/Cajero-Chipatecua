package view;

import java.util.Scanner;

import control.Controller;

public class ViewConsole {
    private final Controller controller;
    private final Scanner scanner;

    public ViewConsole(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        System.out.println("Bienvenido al sistema bancario");
        System.out.println("Por favor, ingrese su usuario y contraseña.");

        int usuario = 0;
        int contraseña = 0;
        boolean entradaValida = false;

        System.out.print("Usuario: ");
        if (scanner.hasNextInt()) {
            usuario = scanner.nextInt();
            entradaValida = true;
        } else {
            System.out.println("Error: Entrada inválida. Por favor, ingrese un valor entero para el usuario.");
            scanner.next(); // Limpia el búfer del scanner
        }

        if (entradaValida) {
            System.out.print("Contraseña: ");
            if (scanner.hasNextInt()) {
                contraseña = scanner.nextInt();
            } else {
                entradaValida = false;
                System.out.println("Error: Entrada inválida. Por favor, ingrese un valor entero para la contraseña.");
                scanner.next(); // Limpia el búfer del scanner
            }
        }

        if (entradaValida) {
            controller.determinarAcceso(usuario, contraseña);
            if (controller.isAccesoPermitido()) {
                mostrarOpciones();
            }
        }
    }

    private void mostrarOpciones() {
        int opcion;
        do {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Realizar retiro");
            System.out.println("2. Realizar depósito");
            System.out.println("3. Verificar saldo");
            System.out.println("4. Modificar contraseña");
            System.out.println("5. Salir");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarRetiro();
                    break;
                case 2:
                    realizarDeposito();
                    break;
                case 3:
                    verificarSaldo();
                    break;
                case 4:
                    modificarContraseña();
                    break;
                case 5:
                    controller.finalizar();
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        } while (opcion != 5);
    }

    private void realizarRetiro() {
        System.out.print("Ingrese la cantidad a retirar: ");
        int cantidad = scanner.nextInt();
        controller.realizarRetiro(cantidad);
    }

    private void realizarDeposito() {
        System.out.print("Ingrese la cantidad a depositar: ");
        int cantidad = scanner.nextInt();
        controller.realizarDeposito(cantidad);
    }

    private void verificarSaldo() {
        controller.verificarSaldo();
    }

    private void modificarContraseña() {
        System.out.print("Ingrese la nueva contraseña: ");
        int nuevaContraseña = scanner.nextInt();
        controller.modificarContraseña(nuevaContraseña);
    }
}