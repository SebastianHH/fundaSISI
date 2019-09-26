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
@Table(name = "Butaca")
public class Butaca {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idbutaca;
	@Column(name = "numerobutaca", nullable = false)
	private String numerobutaca;
	@ManyToOne
	@JoinColumn(name = "idSala", nullable = false)
	private Sala sala; 
	
	public Long getId() {
		return idbutaca;
	}
	
	public void setId(Long idbutaca) {
		this.idbutaca = idbutaca;
	}


	public String getNumeroButaca() {
		return numerobutaca;
	}

	public void setNumeroButaca(String NumeroButaca) {
		this.numerobutaca= NumeroButaca;
	}
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

}
