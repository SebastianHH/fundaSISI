package pe.upc.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Sala")
public class Sala {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idsala;
	@Column(name = "numerosala", nullable = false)
	private String numerosala;
	@Column(name = "cantidad butacas", nullable = false)
	private int cantidadbutacas;
	@Column(name = "nombretiposala", nullable = false)
	private int nombretiposala;
	@ManyToOne
	@JoinColumn(name = "idFuncion", nullable = false)
	private Funcion funcion; 
	 
	public Long getId() {
		return idsala;
	}
	public void setId(Long id) {
		this.idsala = id;
	}

	public String getNumeroSala() {
		return numerosala;
	}

	public void setNumeroSala(String NumeroSala) {
		this.numerosala = NumeroSala;
	}
	public int CantidadButacas() {
		return cantidadbutacas;
	}
	public void setCantidadButacas(int CantidadButacas) {
		this.cantidadbutacas = CantidadButacas;
	}
	public int NombreTiposala() {
		return nombretiposala ;
	}
	public void setNombreTiposala(int NombreTiposala) {
		this.nombretiposala = NombreTiposala;
	}
	public Funcion getFuncion() {
		return funcion;
	}

	public void setFuncion(Funcion funcion) {
		this.funcion = funcion;
	}
	
}
