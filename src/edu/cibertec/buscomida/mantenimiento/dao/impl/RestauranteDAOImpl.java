package edu.cibertec.buscomida.mantenimiento.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.mysql.jdbc.jdbc2.optional.SuspendableXAConnection;

import edu.cibertec.buscomida.mantenimiento.dao.RestauranteDAO;
import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;
import edu.cibertec.buscomida.util.resources.ConstantesConfig;

public class RestauranteDAOImpl implements RestauranteDAO {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buscomida");
	EntityManager em  = emf.createEntityManager();
	
	
	public boolean grabar(RestauranteEntity RestauranteEntity) throws Exception {
		// TODO Auto-generated method stub''
		return false;
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

	public RestauranteEntity buscarResturante(int idRestauranteEntity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	public void insertarRestaurante(RestauranteEntity restaurante,List<SucursalEntity> sucursal, List<PlatoEntity> plato)
			throws Exception {
		em.getTransaction().begin();
		try {
		restaurante.setIdRest(null);	
		em.persist(restaurante);
		em.flush();			
		
		for (PlatoEntity p : plato) {
			p.setRestaurante(restaurante);
			em.persist(p);
			em.flush();			
		}
		for (SucursalEntity s : sucursal) {
			s.setRestaurante(restaurante);
			em.persist(s);
			em.flush();
		}
		
		//Seteamos la variables de la transaccion en cuando es Exito
		ConstantesConfig.setTRANSACCION_INSERT(1);
			
		em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}finally{
			em.close();
		}
	}

}
