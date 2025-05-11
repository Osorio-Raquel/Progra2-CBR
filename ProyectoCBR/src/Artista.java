import java.util.ArrayList;

public class Artista {
	private String portafolio;
	private ArrayList<Publicacion> publicaciones;
	
	public Artista(String portafolio, ArrayList<Publicacion> publicaciones) {
		super();
		this.portafolio = portafolio;
		this.publicaciones = new ArrayList<>();
	}

	public String getPortafolio() {
		return portafolio;
	}

	public void setPortafolio(String portafolio) {
		this.portafolio = portafolio;
	}

	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	
	@Override
	public String toString() {
		return "Artista [portafolio=" + portafolio + ", publicaciones=" + publicaciones + "]";
	}

	public void agregarPublicacion(Publicacion p) {
        publicaciones.add(p);
        // Aqui se supone que se debe poner lo de la BD
    }
}
