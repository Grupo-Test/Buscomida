package edu.cibertec.buscomida.mantenimiento.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import edu.cibertec.buscomida.mantenimiento.dao.SucursalDAO;
import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

public class SucursalDAOImpl implements SucursalDAO {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buscomida");
	EntityManager em  = emf.createEntityManager();
	
	public boolean grabar(SucursalEntity sucursal) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean modificar(SucursalEntity sucursal) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean anular(SucursalEntity sucursal) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	public List listarSucursalEntity() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public SucursalEntity buscarSucursalEntity(int idSucursalEntity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public List listarSucursal() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public SucursalEntity buscarSucursal(int idSucursal) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertarSucursal(SucursalEntity sucursal) throws Exception {
		em.getTransaction().begin();
		em.persist(sucursal);
		em.flush();
		em.getTransaction().commit();
		em.close();
	}

}
