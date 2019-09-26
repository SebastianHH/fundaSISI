package pe.upc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "Genero")

public class Genero {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idgenero;
	@Column(name = "nombregenero", nullable = false)
	private String nombregenero;
	 
	public int getId() {
		return idgenero;
	}
	public void setId(int id) {
		this.idgenero = id;
	}

	public String getNombreGenero() {
		return nombregenero;
	}

	public void setNombreGenero(String nombregenero) {
		this.nombregenero = nombregenero;
	}

	
	
}
