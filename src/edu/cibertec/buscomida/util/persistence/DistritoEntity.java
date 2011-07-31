package edu.cibertec.buscomida.util.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

import java.util.Set;


/**
 * The persistent class for the distrito database table.
 * 
 */
@Entity
@Table(name="distrito")
public class DistritoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_distrito")
	private int idDistrito;

	private String descripcion;

	//bi-directional many-to-one association to Sucursal
	@OneToMany(mappedBy="distrito",cascade=CascadeType.ALL)
	private Set<SucursalEntity> sucursals;

    public DistritoEntity() {
    	
    }

	public int getIdDistrito() {
		return this.idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<SucursalEntity> getSucursals() {
		return this.sucursals;
	}

	public void setSucursals(Set<SucursalEntity> sucursals) {
		this.sucursals = sucursals;
	}
	
}