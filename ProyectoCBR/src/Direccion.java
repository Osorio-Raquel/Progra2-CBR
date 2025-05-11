import java.time.LocalDate;

public class Direccion {
	private String zona;
	private String departamento; 
	private String calle;
	private String nro;
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public Direccion(String zona, String departamento, String calle, String nro) {
		super();
		this.zona = zona;
		this.departamento = departamento;
		this.calle = calle;
		this.nro = nro;
	}
	public String getNro() {
		return nro;
	}
	public void setNro(String nro) {
		this.nro = nro;
	}
	

	


}

