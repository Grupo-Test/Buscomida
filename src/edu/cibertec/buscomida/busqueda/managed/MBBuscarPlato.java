

package edu.cibertec.buscomida.busqueda.managed;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
import edu.cibertec.buscomida.mantenimiento.facade.PlatoFacade;
import edu.cibertec.buscomida.mantenimiento.facade.impl.PlatoFacadeImpl;
import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

@ManagedBean(name = "buscarPlato")
@SessionScoped
public class MBBuscarPlato {

	private PlatoEntity plato;
	private List<PlatoEntity> lstPlato = new ArrayList<PlatoEntity>();
	private SucursalEntity sucursal = new SucursalEntity();
	private LatLng center;
	private String condicionPlato;
	private String condicionDistrito;
	private String condicionRangoPrecio;

	public LatLng getCenter() {
		return center;
	}

	public void setCenter(LatLng center) {
		this.center = center;
	}

	private MapModel simpleModel;

	private MapModel rutaModel;

	public MBBuscarPlato() {
		simpleModel = new DefaultMapModel();
		rutaModel = new DefaultMapModel();
		cargarPlatos();
	}

	public MapModel getSimpleModel() {
		return simpleModel;
	}

	public SucursalEntity getSucursal() {
		return sucursal;
	}

	public void setSucursal(SucursalEntity sucursal) {
		this.sucursal = sucursal;
	}

	public String getCondicionRangoPrecio() {
		return condicionRangoPrecio;
	}

	public void setCondicionRangoPrecio(String condicionRangoPrecio) {
		this.condicionRangoPrecio = condicionRangoPrecio;
	}

	public PlatoEntity getPlato() {
		return plato;
	}

	public void setPlato(PlatoEntity plato) {
		this.plato = plato;
		simpleModel.getMarkers().clear();
		rutaModel.getMarkers().clear();
		if (plato != null) {
			RestauranteEntity r = plato.getRestaurante();
			if (r != null) {
				List<SucursalEntity> lstSucursal = r.getSucursals();
				if (lstSucursal != null) {
					for (SucursalEntity ss : lstSucursal) {
						LatLng coord1 = new LatLng(Double.parseDouble(ss
								.getLatitud() + ""), Double.parseDouble(ss
								.getAltitud() + ""));
						center = new LatLng(coord1.getLat() + 0.04,
								coord1.getLng());
						System.out.println("Latitud:" + coord1.getLat() + " "
								+ "Longitud:" + coord1.getLng());
						simpleModel.addOverlay(new Marker(coord1, r
								.getNombreMostrar()));
						rutaModel.addOverlay(new Marker(coord1, r
								.getNombreMostrar()));
						lat = Double.parseDouble(ss.getLatitud()+"");
						lng = Double.parseDouble(ss.getAltitud()+"");
					}
				}
			}
			
		}
	}

	public List<PlatoEntity> getlstPlato() {
		return lstPlato;
	}

	public void setlstPlato(List<PlatoEntity> lstPlato) {
		this.lstPlato = lstPlato;
	}

	public String getCondicionPlato() {
		return condicionPlato;
	}

	public void setCondicionPlato(String condicionPlato) {
		this.condicionPlato = condicionPlato;
	}

	public String getCondicionDistrito() {
		return condicionDistrito;
	}

	public void setCondicionDistrito(String condicionDistrito) {
		this.condicionDistrito = condicionDistrito;
	}

	// **************************************************************
	// EVENTOS
	// **************************************************************
	public void listarPlatos() {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();
	}

	public List<String> complete(String query) {
		List<String> results = new ArrayList<String>();
		cargarPlatos();
		// ==============================================0
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();
		Query q = em
				.createQuery("SELECT c FROM PlatoEntity c where c.nombremostrar LIKE :nombre");
		q.setParameter("nombre", "%" + query + "%");
		List<PlatoEntity> lst = q.getResultList();
		if (lst != null) {
			for (PlatoEntity p : lst) {
				results.add(p.getNombremostrar());
			}
		}
		return results;
	}

	// public void handleSelect(SelectEvent event) {
	// System.out.println(event.getObject().toString());
	// condicionPlato = event.getObject().toString();
	// System.out.println("hs" + condicionPlato);
	// }

	// public void valueChange(javax.faces.event.ValueChangeEvent v) {
	// System.out.println(v.getNewValue().toString());
	// }

	// **************************************************************
	// METODOS
	// **************************************************************
	public String cargarPlatos() {
		System.out.println("Cargar PLatos");
		System.out.println(condicionPlato);

		PlatoFacade platoFacade = new PlatoFacadeImpl();
		if (condicionPlato == null) {
			condicionPlato = "";
		}
		try {
			lstPlato = (List) platoFacade.listarPlatos(condicionPlato,
					condicionDistrito, condicionRangoPrecio);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ENTROOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");

		return null;
	}

	public void setRutaModel(MapModel rutaModel) {
		this.rutaModel = rutaModel;
	}

	public MapModel getRutaModel() {
		return rutaModel;
	}

	private double lat;

	private double lng;

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLng() {
		return lng;
	}

	public void setLng(double lng) {
		this.lng = lng;
	}
}
