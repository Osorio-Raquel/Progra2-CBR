import java.time.LocalDate;

public class Evento {
	private LocalDate fechaEvento;
	private String direccion;
	private String nombre;
	private String descripcion;
	private String tipo;
	private String publicoObjetivo;
	private int capacidadAsis;

	
	
	public Evento(LocalDate fechaEvento, String direccion, String nombre, String descripcion, String tipo,
			String publicoObjetivo, int capacidadAsis) {
		super();
		this.fechaEvento = fechaEvento;
		this.direccion = direccion;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.publicoObjetivo = publicoObjetivo;
		this.capacidadAsis = capacidadAsis;

	}
	public LocalDate getFechaEvento() {
		return fechaEvento;
	}
	public void setFechaEvento(LocalDate fechaEvento) {
		this.fechaEvento = fechaEvento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPublicoObjetivo() {
		return publicoObjetivo;
	}
	public void setPublicoObjetivo(String publicoObjetivo) {
		this.publicoObjetivo = publicoObjetivo;
	}
	public int getCapacidadAsis() {
		return capacidadAsis;
	}
	public void setCapacidadAsis(int capacidadAsis) {
		this.capacidadAsis = capacidadAsis;
	}
	@Override
	public String toString() {
		return fechaEvento+  direccion + nombre + descripcion + tipo + publicoObjetivo
				+ capacidadAsis;
	}
	


	
}
