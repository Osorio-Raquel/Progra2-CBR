import java.time.LocalDate;

public class Comentario {
    private Cliente clienteComentarista;
    private Artista artistaRecibidor;
    private String mensaje;
    private LocalDate fechaComentario;
    
	public Comentario(Cliente clienteComentarista, Artista artistaRecibidor, String mensaje,
			LocalDate fechaComentario) {
		this.clienteComentarista = clienteComentarista;
		this.artistaRecibidor = artistaRecibidor;
		this.mensaje = mensaje;
		this.fechaComentario = fechaComentario;
	}

	public Cliente getClienteComentarista() {
		return clienteComentarista;
	}

	public void setClienteComentarista(Cliente clienteComentarista) {
		this.clienteComentarista = clienteComentarista;
	}

	public Artista getArtistaRecibidor() {
		return artistaRecibidor;
	}

	public void setArtistaRecibidor(Artista artistaRecibidor) {
		this.artistaRecibidor = artistaRecibidor;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public LocalDate getFechaComentario() {
		return fechaComentario;
	}

	public void setFechaComentario(LocalDate fechaComentario) {
		this.fechaComentario = fechaComentario;
	}

	@Override
	public String toString() {
		return "Comentario [artistaRecibidor=" + artistaRecibidor + ", mensaje=" + mensaje + ", fechaComentario="
				+ fechaComentario + "]";
	}

	
	
    
}
