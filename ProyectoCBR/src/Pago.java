package work;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pago {
	
	private LocalDate fechaEmisión;
	private boolean tipoPago, estado; //Qr - true   - Cancelado true
	
	

	
	public LocalDate getFechaEmisión() {
		return fechaEmisión;
	}

	public void setFechaEmisión(LocalDate fechaEmisión) {
		this.fechaEmisión = fechaEmisión;
	}

	public boolean isTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(boolean tipoPago) {
		this.tipoPago = tipoPago;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	
	
	
	
	
	@Override
	public String toString() {
		return "Pago [fechaEmisión=" + fechaEmisión + ", tipoPago=" + tipoPago + ", estado=" + estado + "]";
	}

	
	
	
	
	public Pago(LocalDate fechaEmisión, boolean tipoPago, boolean estado) {
		super();
		this.fechaEmisión = fechaEmisión;
		this.tipoPago = tipoPago;
		this.estado = estado;
	}

	static double calcularMontoTotal(ArrayList<ObraArtistica> obrasSelecc) {
		double sum=0.0;
		
		for (ObraArtistica obra : obrasSelecc) {
			//sum += obra.getPrecio();
			
		}
		return sum;
		
	}
	
	static double calcularSubtotal(ArrayList<ObraArtistica> obrasSelec) {
		
		return Pago.calcularMontoTotal(obrasSelec) * Impuestos.ivaLaPaz; 
		
	}
	
	
}

