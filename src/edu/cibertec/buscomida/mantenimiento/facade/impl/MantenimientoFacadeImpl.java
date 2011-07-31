package edu.cibertec.buscomida.mantenimiento.facade.impl;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.cibertec.buscomida.mantenimiento.dao.RestauranteDAO;
import edu.cibertec.buscomida.mantenimiento.dao.SucursalDAO;
import edu.cibertec.buscomida.mantenimiento.dao.impl.RestauranteDAOImpl;
import edu.cibertec.buscomida.mantenimiento.dao.impl.SucursalDAOImpl;
import edu.cibertec.buscomida.mantenimiento.facade.MantenimientoFacade;
import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

public class MantenimientoFacadeImpl implements MantenimientoFacade {

	public boolean grabar(RestauranteEntity RestauranteEntity) throws Exception {
			return true;
	}

	public boolean modificar(RestauranteEntity RestauranteEntity) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean anular(RestauranteEntity RestauranteEntity) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List listarResturantes() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public RestauranteEntity buscarResturante(int idRestaurante) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

	public void registrarMantenimiento(RestauranteEntity restaurante,List<SucursalEntity> sucursal, List<PlatoEntity> plato) throws Exception {
		
		//Registrar el Restaurante
		RestauranteDAO objRestauranteDAO = new RestauranteDAOImpl();
		objRestauranteDAO.insertarRestaurante(restaurante,sucursal,plato);
		
		
	}

}
