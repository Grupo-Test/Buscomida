package edu.cibertec.buscomida.seguridad.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;

import java.util.Date;


/**
 * The persistent class for the usuario database table.
 * 
 */
@Entity
@Table(name="usuario")
public class UsuarioEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_usu")
	private int idUsu;

    @Temporal( TemporalType.DATE)
	@Column(name="fecha_ingreso")
	private Date fechaIngreso;

	private String login;

	@Column(name="nombre_completo")
	private String nombreCompleto;

	private String pass;

	//bi-directional many-to-one association to Restaurante
    @ManyToOne
	@JoinColumn(name="id_rest")
	private RestauranteEntity restaurante;

    public UsuarioEntity() {
    }

	public int getIdUsu() {
		return this.idUsu;
	}

	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	}

	public Date getFechaIngreso() {
		return this.fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNombreCompleto() {
		return this.nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public RestauranteEntity getRestaurante() {
		return this.restaurante;
	}

	public void setRestaurante(RestauranteEntity restaurante) {
		this.restaurante = restaurante;
	}
	
}