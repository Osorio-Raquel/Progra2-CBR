package work;

import java.time.LocalDate;

public class PagoQr extends Pago{

	private String codigo, concepto;
	
	public PagoQr(LocalDate fechaEmisión, boolean tipoPago, boolean estado, String codigo, String concepto) {
		super(fechaEmisión, tipoPago, estado);
		// TODO Auto-generated constructor stub
		this.codigo = codigo;
		this.concepto = concepto;
	}
	
}

