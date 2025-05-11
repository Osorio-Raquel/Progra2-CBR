package work;

import java.time.LocalDate;
import java.util.ArrayList;

public class EspacioCultural extends Usuario {
	
	private String nombre, descripcion, publicoObjetivo, tipo;
	private LocalDate fechaCreacion;
	private InfoBancaria infoBanc;
	private Direccion direccion;
	
	private ArrayList<Eventos> eventos = new ArrayList<Eventos>();
	private ArrayList<Publicaciones> publicaciones = new ArrayList<Publicaciones>();
	
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
	public String getPublicoObjetivo() {
		return publicoObjetivo;
	}
	public void setPublicoObjetivo(String publicoObjetivo) {
		this.publicoObjetivo = publicoObjetivo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public InfoBancaria getInfoBanc() {
		return infoBanc;
	}
	public void setInfoBanc(InfoBancaria infoBanc) {
		this.infoBanc = infoBanc;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Eventos> getEventos() {
		return eventos;
	}
	public void setEventos(ArrayList<Eventos> eventos) {
		this.eventos = eventos;
	}
	public ArrayList<Publicaciones> getPublicaciones() {
		return publicaciones;
	}
	public void setPublicaciones(ArrayList<Publicaciones> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	 static 
	
	
}
