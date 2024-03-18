package model;
public class Contrasena extends CVC {
	private int contrasena;

	// Constructor
	public Contrasena(int contrasena) {
		super();
		this.contrasena = contrasena;
	}

	// Método para cambiar la contraseña
	public void cambiarContrasena(int nuevaContrasena) {
		this.contrasena = nuevaContrasena;
		System.out.println("La contraseña se ha cambiado correctamente.");
	}

	// Método para confirmar la contraseña
	public boolean confirmarContrasena(int contrasenaUsuario) {
		return this.contrasena == contrasenaUsuario;
	}

	// Método para obtener la contraseña
	public int getContrasena() {
		return contrasena;
	}

	// Método para establecer la contraseña
	public void setContrasena(int contrasena) {
		this.contrasena = contrasena;
	}

	// Método para verificar la contraseña
	public boolean verificarContrasena(int usuario, int contrasena) {
		return usuario == getContrasena() && contrasena == getContrasena();
	}
}
