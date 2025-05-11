import java.time.LocalDate;

public class Persona {
	private String nombre;
	private int edad;
	private String ci;
	private String apellidoMaterno;
	private String apellidoPaterno;
	private LocalDate fechaNacimiento;
	private Usuario user;
	private Direccion direccion;
	private Contacto contacto;
	InfoBancaria infoBancaria;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public contacto getContacto() {
		return contacto;
	}
	public void setContacto(contacto contacto) {
		this.contacto = contacto;
	}
	public InfoBancaria getInfoBancaria() {
		return infoBancaria;
	}
	public void setInfoBancaria(InfoBancaria infoBancaria) {
		this.infoBancaria = infoBancaria;
	}
	public Direccion(String nombre, int edad, String ci, String apellidoMaterno, String apellidoPaterno,
			LocalDate fechaNacimiento, Usuario user, Direccion direccion, contacto contacto,
			InfoBancaria infoBancaria) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.ci = ci;
		this.apellidoMaterno = apellidoMaterno;
		this.apellidoPaterno = apellidoPaterno;
		this.fechaNacimiento = fechaNacimiento;
		this.user = user;
		this.direccion = direccion;
		this.contacto = contacto;
		this.infoBancaria = infoBancaria;
	}
	
	static boolean registroUsuario(String usuariosTxt){
		
		return false;
		
	}


}

