package work;

import java.time.LocalDate;

public class PagoTarjeta extends Pago{
	private String ultimos4Digitos;
	private boolean tipoTarjeta;
	
	public String getUltimos4Digitos() {
		return ultimos4Digitos;
	}
	public void setUltimos4Digitos(String ultimos4Digitos) {
		this.ultimos4Digitos = ultimos4Digitos;
	}
	public boolean isTipoTarjeta() {
		return tipoTarjeta;
	}
	public void setTipoTarjeta(boolean tipoTarjeta) {
		this.tipoTarjeta = tipoTarjeta;
	}
	
	public PagoTarjeta(LocalDate fechaEmisión, boolean tipoPago, boolean estado, String ultimos4Digitos,
			boolean tipoTarjeta) {
		super(fechaEmisión, tipoPago, estado);
		this.ultimos4Digitos = ultimos4Digitos;
		this.tipoTarjeta = tipoTarjeta;
	}
	@Override
	public String toString() {
		return "PagoTarjeta [ultimos4Digitos=" + ultimos4Digitos + ", tipoTarjeta=" + tipoTarjeta + "]";
	}
	
	
	
	
	
}
