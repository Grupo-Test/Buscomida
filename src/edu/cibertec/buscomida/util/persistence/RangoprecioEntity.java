package edu.cibertec.buscomida.util.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

import java.util.Set;


/**
 * The persistent class for the rangoprecio database table.
 * 
 */
@Entity
@Table(name="rangoprecio")
public class RangoprecioEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_rango")
	private int idRango;

	private String descripcion;

	@Column(name="max_precio")
	private int maxPrecio;

	@Column(name="min_precio")
	private int minPrecio;

	//bi-directional many-to-one association to Plato
	@OneToMany(mappedBy="rangoprecio")
	private Set<PlatoEntity> platos;

    public RangoprecioEntity() {
    }

	public int getIdRango() {
		return this.idRango;
	}

	public void setIdRango(int idRango) {
		this.idRango = idRango;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getMaxPrecio() {
		return this.maxPrecio;
	}

	public void setMaxPrecio(int maxPrecio) {
		this.maxPrecio = maxPrecio;
	}

	public int getMinPrecio() {
		return this.minPrecio;
	}

	public void setMinPrecio(int minPrecio) {
		this.minPrecio = minPrecio;
	}

	public Set<PlatoEntity> getPlatos() {
		return this.platos;
	}

	public void setPlatos(Set<PlatoEntity> platos) {
		this.platos = platos;
	}
	
}