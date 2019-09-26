package pe.upc.model.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Reserva")
public class Reserva {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idreserva;
	@ManyToOne
	@JoinColumn(name = "idpersona", nullable = false)
	private Persona persona;
	@Column(name = "fechafactura")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechafactura;
	@Column(name = "importetotal")
	private double importetotal;
	@ManyToOne
	@JoinColumn(name = "idtipoentrada", nullable = false)
	private TipoEntrada tipoentrada;
	@ManyToOne
	@JoinColumn(name = "idbutaca", nullable = false)
	private Butaca butaca;
	

	public int getId() {
		return idreserva;
	}
	public void setId(int idReserva) {
		this.idreserva = idReserva;
		
	}
	public Persona getidPersona() {
		return persona;
	}

	public void setidPersona (Persona  Persona ) {
		this.persona = Persona ;
	}
	public Date getFechafactura() {
		return fechafactura;
	}
	public void setFechafacturao(Date Fechafactura) {
		this.fechafactura = Fechafactura;
	}
	public double getImporteTotal() {
		return importetotal;
	}

	public void setImporteTotal(double ImporteTotal) {
		this.importetotal = ImporteTotal;
	}
	public TipoEntrada getidTipoEntrada() {
		return tipoentrada;
	}

	public void setidTipoEntrada (TipoEntrada  TipoEntrada ) {
		this.tipoentrada = TipoEntrada ;
	}
	
	public Butaca getidButaca() {
		return butaca;
	}

	public void setidButaca (Butaca  Butaca ) {
		this.butaca = Butaca ;
	}
}
