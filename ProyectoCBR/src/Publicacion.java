import java.time.LocalDate;
import java.util.ArrayList;

public class Publicacion {
	private LocalDate fechaPublicacion;
	private Artista autor;
	private String imagen;
	private String descripcion;
	private boolean estado;
	private ArrayList<Comentario> comentarios;
	
	public Publicacion(LocalDate fechaPublicacion, Artista autor, String imagen, String descripcion, boolean estado,
			ArrayList<Comentario> comentarios) {
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.imagen = imagen;
		this.descripcion = descripcion;
		this.estado = estado;
		this.comentarios = new ArrayList<>();
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	public Artista getAutor() {
		return autor;
	}

	public void setAutor(Artista autor) {
		this.autor = autor;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public ArrayList<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(ArrayList<Comentario> comentarios) {
		this.comentarios = comentarios;
	}
	
	public void agregarComentario(Comentario c) {
        comentarios.add(c);
    }
	
}
