package edu.cibertec.buscomida.util.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;

import java.util.Date;


/**
 * The persistent class for the membresia database table.
 * 
 */
@Entity
@Table(name="membresia")
public class MembresiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_membresia")
	private int idMembresia;

    @Temporal( TemporalType.DATE)
	@Column(name="fecha_final")
	private Date fechaFinal;

    @Temporal( TemporalType.DATE)
	@Column(name="fecha_inicio")
	private Date fechaInicio;

	//bi-directional many-to-one association to Restaurante
    @ManyToOne
	@JoinColumn(name="id_rest")
	private RestauranteEntity restaurante;

    public MembresiaEntity() {
    }

	public int getIdMembresia() {
		return this.idMembresia;
	}

	public void setIdMembresia(int idMembresia) {
		this.idMembresia = idMembresia;
	}

	public Date getFechaFinal() {
		return this.fechaFinal;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Date getFechaInicio() {
		return this.fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public RestauranteEntity getRestaurante() {
		return this.restaurante;
	}

	public void setRestaurante(RestauranteEntity restaurante) {
		this.restaurante = restaurante;
	}
	
}