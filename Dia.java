package pe.upc.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "Dia")
public class Dia {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iddia;
	@Column(name = "nombredia", nullable = false)
	private String nombredia;
	
	public int getId() {
		return iddia;
	}
	public void setId(int idDia) {
		this.iddia = idDia;
	}
	public String getnDia() {
		return nombredia;
	}
	public void setnombreDia(String NombreDia) {
		this.nombredia = NombreDia;
	}
}
