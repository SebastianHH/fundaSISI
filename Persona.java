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


import org.hibernate.validator.constraints.Email;
import org.springframework.format.annotation.DateTimeFormat;




@Entity
@Table(name = "Persona")//nombre de la tabla de la base de datos 
public class Persona {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idpersona;
	@Column(name = "nombre", nullable = false)
	private String nombre;
	@Column(name = "ApellidoPatero", nullable = false)
	private String ApellidoPaterno;
	@Column(name = "ApellidoMatero", nullable = false)
	private String ApellidoMaterno;
	@Email 
	@Column(name = "correo", length = 60)
	private String correo;
	@ManyToOne
	@JoinColumn(name = "idtipodocumento", nullable = false)
	private TipoDocumento tipodocumento;
	@Column(name = "numerodocumento")
	private int numerodocumento;
	@Column(name = "fechanacimiento")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date fechanacimiento;
	@Column(name = "genero", nullable = false)
	private String genero;
	@Column(name = "numerotelefono", nullable = false)
	private int numerotelefono;
	@Column(name = "clave", length = 10, nullable = false)
	private String clave;
	@Column(name = "numerotarjeta")
	private int numerotarjeta;
	@Column(name = "clavetarjeta", nullable = false)
	private int clavetarjeta;
	@Column(name = "ncvc")
	private int ncvc;
	
	public int getIdPersona() {
		return idpersona;
	}
	public void setIdPersona(int idPersona) {
		this.idpersona = idPersona;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre(String nombre) {
		this.nombre = nombre;
	}
	public String getnApellidoPaterno() {
		return ApellidoPaterno;
	}
	public void setApellidoPaterno(String apellidopaterno) {
		this.ApellidoPaterno = apellidopaterno;
	}
	public String getApellidoMaterno() {
		return ApellidoMaterno;
	}
	public void setApellidoMaterno(String apellidomaterno) {
		this.ApellidoMaterno = apellidomaterno;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String Correo) {
		this.correo= Correo;
	}
	public TipoDocumento getTipoDocumento() {
		return tipodocumento;
	}

	public void setTipoDocumento(TipoDocumento tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public int getNumeroDocumento() {
		return numerodocumento;
	}
	public void setNumeroDocumento(int NumeroDocumento) {
		this.numerodocumento = NumeroDocumento;
	}
	public Date getFechaNacimiento() {
		return fechanacimiento;
	}
	public void setFechaNacimiento(Date FechaNacimiento) {
		this.fechanacimiento = FechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String Genero) {
		this.genero = Genero;
	}
	public int NumeroTelefono() {
		return numerotelefono;
	}
	public void setNumeroTelefono(int NumeroTelefono) {
		this.numerotelefono = NumeroTelefono; 
	}
	public String Clave() {
		return clave;
	}
	public void setClave(String Clave) {
		this.clave = Clave;
	}
	public int getNumeroTarjeta() {
		return numerotarjeta;
	}
	public void setNumeroTarjeta(int NumeroTarjeta) {
		this.numerotarjeta = NumeroTarjeta;
	}
	public int getClaveTarjeta() {
		return clavetarjeta;
	}
	public void setClaveTarjeta(int ClaveTarjeta) {
		this.clavetarjeta= ClaveTarjeta;
	}
	public int getNCVC() {
		return ncvc;
	}
	public void setNCVC(int NCVC) {
		this.ncvc= NCVC;
	}
}
