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
@Table(name = "Pelicula")
public class Pelicula {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpelicula;
	@Column(name = "nombrepelicula", nullable = false)
	private String nombrepelicula;
	@ManyToOne
	@JoinColumn(name = "idgenero", nullable = false)
	private Genero genero; 
	@Column(name = "cantidadduracion", nullable = false)
	private int cantidadduracion;
	@Column(name = "director", nullable = false)
	private String director;
	
	
	public int getId() {
		return idpelicula;
	}
	public void setId(int id) {
		this.idpelicula = id;
	}

	public String getNombrePelicula() {
		return nombrepelicula;
	}
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public void setNombrePelicula(String nombrepelicula) {
		this.nombrepelicula = nombrepelicula;
	}
	public int getCantidadDuracion() {
		return cantidadduracion;
	}
	public void setCantidadDuracion(int CantidadDuracion) {
		this.cantidadduracion = CantidadDuracion;
	}
	public String getDirector() {
		return director;
	}
	public void setDirectorn(String Director) {
		this.director = Director;
	}
	
}
