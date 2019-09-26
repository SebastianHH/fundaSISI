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
@Table(name = "TipoEntrada")
public class TipoEntrada {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipoentrada;
	@Column(name = "nombretipoentrada", nullable = false)
	private String nombretipoentrada;
	@ManyToOne
	@JoinColumn(name = "iddia", nullable = false)
	private Dia dia;
	@Column(name = "precio")
	private double precio;
	
	
	public int getId() {
		return idtipoentrada;
	}
	public void setId(int idTipoEntrada) {
		this.idtipoentrada = idTipoEntrada;
	}
	public String getNombretipoEntrada() {
		return nombretipoentrada;
	}
	public void setNombretipoEntrada(String NombretipoEntrada) {
		this.nombretipoentrada = NombretipoEntrada;
	}
	public Dia getidDia() {
		return dia;
	}

	public void setDia (Dia  Dia ) {
		this.dia = Dia ;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double Precio) {
		this.precio = Precio;
	}
	
}
