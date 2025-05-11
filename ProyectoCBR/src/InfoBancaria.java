package work;

public class InfoBancaria {
	private String cuenta, tarjeta, nroTarjeta;

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(String tarjeta) {
		this.tarjeta = tarjeta;
	}

	public String getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(String nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}

	public InfoBancaria(String cuenta, String tarjeta, String nroTarjeta) {
		super();
		this.cuenta = cuenta;
		this.tarjeta = tarjeta;
		this.nroTarjeta = nroTarjeta;
	}

	@Override
	public String toString() {
		return "InfoBancaria [cuenta=" + cuenta + ", tarjeta=" + tarjeta + ", nroTarjeta=" + nroTarjeta + "]";
	}
	
	
	
}
