package pe.upc.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "TipoDocumento")//nombre de la tabla de la base de datos 
public class TipoDocumento {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idtipodocumento;
	@Column(name = "nombretipodocumento", nullable = false)
	private String nombretipodocumento;
	 
	public Long getId() {
		return idtipodocumento;
	}
	public void setId(Long id) {
		this.idtipodocumento = id;
	}

	public String getName() {
		return nombretipodocumento;
	}

	public void setName(String name) {
		this.nombretipodocumento = name;
	}

}
