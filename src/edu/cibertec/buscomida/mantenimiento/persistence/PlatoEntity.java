package edu.cibertec.buscomida.mantenimiento.persistence;

import java.io.InputStream;
import java.io.Serializable;
import javax.persistence.*;

import org.primefaces.model.StreamedContent;

import edu.cibertec.buscomida.util.persistence.CategoriaEntity;
import edu.cibertec.buscomida.util.persistence.RangoprecioEntity;
import edu.cibertec.buscomida.util.persistence.VotoEntity;



import java.util.Set;


@Entity
@Table(name="plato")

public class PlatoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_plato")
	private int idPlato;

	private double votopromedio;
	
	public double getVotopromedio() {
		return votopromedio;
	}

	public void setVotopromedio(double votopromedio) {
		this.votopromedio = votopromedio;
	}

	private String descripcion;

	private String keywords;

	private String nombremostrar;
	
	private String url;

	public String getUrl() {
		if(url==null)
			return "/images/plato/camara.jpg";
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	//bi-directional many-to-one association to Categoria
    @ManyToOne
	@JoinColumn(name="id_categoria")
	private CategoriaEntity categoria;

	//bi-directional many-to-one association to Rangoprecio
    @ManyToOne
	@JoinColumn(name="id_rango")
	private RangoprecioEntity rangoprecio;

	//bi-directional many-to-one association to Restaurante
    @ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id_rest")
	private RestauranteEntity restaurante;

	//bi-directional many-to-one association to Voto
	@OneToMany(mappedBy="plato")
	private Set<VotoEntity> votos;

	@Transient
	private byte[] fotoPlato; 
	
    

	public PlatoEntity() {
    	setCategoria(new CategoriaEntity());
    	setRangoprecio(new RangoprecioEntity());
    }

	public byte[] getFotoPlato() {
		return fotoPlato;
	}

	public void setFotoPlato(byte[] fotoPlato) {
		this.fotoPlato = fotoPlato;
	}

	public int getIdPlato() {
		return this.idPlato;
	}

	public void setIdPlato(int idPlato) {
		this.idPlato = idPlato;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getKeywords() {
		return this.keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getNombremostrar() {
		return this.nombremostrar;
	}

	public void setNombremostrar(String nombremostrar) {
		this.nombremostrar = nombremostrar;
	}

	public CategoriaEntity getCategoria() {
		return this.categoria;
	}

	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}
	
	public RangoprecioEntity getRangoprecio() {
		return this.rangoprecio;
	}

	public void setRangoprecio(RangoprecioEntity rangoprecio) {
		this.rangoprecio = rangoprecio;
	}
	
	public RestauranteEntity getRestaurante() {
		return this.restaurante;
	}

	public void setRestaurante(RestauranteEntity restaurante) {
		this.restaurante = restaurante;
	}
	
	public Set<VotoEntity> getVotos() {
		return this.votos;
	}

	public void setVotos(Set<VotoEntity> votos) {
		this.votos = votos;
	}
	
}