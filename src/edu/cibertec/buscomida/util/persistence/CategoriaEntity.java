package edu.cibertec.buscomida.util.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

import java.util.Set;


/**
 * The persistent class for the categoria database table.
 * 
 */
@Entity
@Table(name="categoria")
public class CategoriaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_categoria")
	private int idCategoria;

	private String descripcion;

	//bi-directional many-to-one association to Plato
	@OneToMany(mappedBy="categoria")
	private Set<PlatoEntity> platos;

    public CategoriaEntity() {
    }

	public int getIdCategoria() {
		return this.idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Set<PlatoEntity> getPlatos() {
		return this.platos;
	}

	public void setPlatos(Set<PlatoEntity> platos) {
		this.platos = platos;
	}
	
}