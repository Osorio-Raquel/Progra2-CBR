import java.time.LocalDate;

public class Usuario {
	private String nombreUsuario;
	private String contraseña;
	boolean estado;
	Persona persona;
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	
	static boolean registroPersona(
	 String nombre,
	 int edad,
	 String ci,
	 String apellidoMaterno,
	 String apellidoPaterno,
	 LocalDate fechaNacimiento,
	 Usuario user,
	 Direccion direccion,
	 Contacto contacto,
	 InfoBancaria infoBancaria) {
		
		return false;
	}
	

}

