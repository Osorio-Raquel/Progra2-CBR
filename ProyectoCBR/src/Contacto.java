package work;

public class Contacto {
	private String instagram, facebook, tiktok;
	private String gmail, telefono;
	
	public String getInstagram() {
		return instagram;
	}
	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}
	public String getTiktok() {
		return tiktok;
	}
	public void setTiktok(String tiktok) {
		this.tiktok = tiktok;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Contacto(String instagram, String facebook, String tiktok, String gmail, String telefono) {
		super();
		this.instagram = instagram;
		this.facebook = facebook;
		this.tiktok = tiktok;
		this.gmail = gmail;
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Contacto [instagram=" + instagram + ", facebook=" + facebook + ", tiktok=" + tiktok + ", gmail=" + gmail
				+ ", telefono=" + telefono + "]";
	}
	
	
	
	
}
