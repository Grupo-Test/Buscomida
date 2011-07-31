package edu.cibertec.buscomida.util.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.cibertec.buscomida.util.dao.ComboDAO;
import edu.cibertec.buscomida.util.persistence.RangoprecioEntity;

public class ComboImpl implements ComboDAO {

	public List listarCategoria() throws Exception {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();

		List lstCategoria = em.createQuery("SELECT o FROM CategoriaEntity o")
				.getResultList();

		return lstCategoria;
	}

	public List listarDistrito() throws Exception {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();

		List lstDistrito = em.createQuery("SELECT o FROM DistritoEntity o")
				.getResultList();

		return lstDistrito;
	}

	public List<RangoprecioEntity> listarRangoPrecio() throws Exception {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();

		List<RangoprecioEntity> lstRangoPrecio = em.createQuery(
				"SELECT o FROM RangoprecioEntity o order by o.minPrecio")
				.getResultList();

		return lstRangoPrecio;
	}

}
