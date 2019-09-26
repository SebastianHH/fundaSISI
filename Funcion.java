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
@Table(name = "Funcion")
public class Funcion {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idfuncion;
	@ManyToOne
	@JoinColumn(name = "pelicula", nullable = false)
	private Pelicula pelicula;
	@Column(name = "diahorafuncion")
	@DateTimeFormat(pattern = "yyyy-MM-dd hh-mm-ss")
	private Date diahorafuncion ;
	public Long getId() {
		return idfuncion;
	}
	public void setId(Long id) {
		this.idfuncion = id;
	}

	public Pelicula getPelicula() {
		return pelicula;
	}

	public void setPelicula(Pelicula pelicula) {
		this.pelicula = pelicula;
	}
	public Date getDiaHorafuncion() {
		return diahorafuncion;
	}
	public void setDiaHorafuncion(Date DiaHorafuncion) {
		this.diahorafuncion = DiaHorafuncion;
	}
}
