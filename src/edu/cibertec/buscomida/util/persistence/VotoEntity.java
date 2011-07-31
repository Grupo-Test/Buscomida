package edu.cibertec.buscomida.util.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

import java.util.Date;


/**
 * The persistent class for the voto database table.
 * 
 */
@Entity
@Table(name="voto")
public class VotoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_voto")
	private int idVoto;

    @Temporal( TemporalType.DATE)
	private Date fecha;

	private int rate;

	//bi-directional many-to-one association to Plato
    @ManyToOne
	@JoinColumn(name="id_plato")
	private PlatoEntity plato;

    public VotoEntity() {
    }

	public int getIdVoto() {
		return this.idVoto;
	}

	public void setIdVoto(int idVoto) {
		this.idVoto = idVoto;
	}

	public Date getFecha() {
		return this.fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public PlatoEntity getPlato() {
		return this.plato;
	}

	public void setPlato(PlatoEntity plato) {
		this.plato = plato;
	}
	
}