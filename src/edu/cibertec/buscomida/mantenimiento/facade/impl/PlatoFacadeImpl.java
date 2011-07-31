package edu.cibertec.buscomida.mantenimiento.facade.impl;

import java.util.List;

import edu.cibertec.buscomida.mantenimiento.dao.PlatoDAO;
import edu.cibertec.buscomida.mantenimiento.dao.impl.PlatoDAOImpl;
import edu.cibertec.buscomida.mantenimiento.facade.PlatoFacade;
import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

public class PlatoFacadeImpl implements PlatoFacade {

	public boolean grabar(PlatoEntity PlatoEntity) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificar(PlatoEntity PlatoEntity) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean anular(PlatoEntity PlatoEntity) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List listarPlatos(String condicionPlato, String condicionDistrito, String condicionPrecio) throws Exception {
		PlatoDAO platoDAO =new PlatoDAOImpl();
		return platoDAO.listarPlatos(condicionPlato,condicionDistrito,condicionPrecio);
	}

	public PlatoEntity buscarPLato(int idPlato) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
