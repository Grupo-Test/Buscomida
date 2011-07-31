package edu.cibertec.buscomida.mantenimiento.persistence;

import java.io.Serializable;
import javax.persistence.*;

import edu.cibertec.buscomida.util.persistence.DistritoEntity;

import java.math.BigDecimal;


/**
 * The persistent class for the sucursal database table.
 * 
 */
@Entity
@Table(name="sucursal")
public class SucursalEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_suc")
	private int idSuc;

	private BigDecimal altitud;

	private String direccion;

	private String estado;

	private BigDecimal latitud;

	private String telefono;

	//bi-directional many-to-one association to Restaurante
    @ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_rest")
	private RestauranteEntity restaurante;

	//bi-directional many-to-one association to Distrito
    @ManyToOne
	@JoinColumn(name="id_distrito")
	private DistritoEntity distrito;

    public SucursalEntity() {
    	distrito=new DistritoEntity();
    }

	public int getIdSuc() {
		return this.idSuc;
	}

	public void setIdSuc(int idSuc) {
		this.idSuc = idSuc;
	}

	public BigDecimal getAltitud() {
		return this.altitud;
	}

	public void setAltitud(BigDecimal altitud) {
		this.altitud = altitud;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public BigDecimal getLatitud() {
		return this.latitud;
	}

	public void setLatitud(BigDecimal latitud) {
		this.latitud = latitud;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public RestauranteEntity getRestaurante() {
		return this.restaurante;
	}

	public void setRestaurante(RestauranteEntity restaurante) {
		this.restaurante = restaurante;
	}
	
	public DistritoEntity getDistrito() {
		return this.distrito;
	}

	public void setDistrito(DistritoEntity distrito) {
		this.distrito = distrito;
	}
	
}