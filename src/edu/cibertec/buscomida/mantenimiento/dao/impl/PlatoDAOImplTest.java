package edu.cibertec.buscomida.mantenimiento.dao.impl;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.Test;

public class PlatoDAOImplTest {
	
	@Test
	public void testGrabar() {
	}

	@Test
	public void testModificar() {
	}

	@Test
	public void testAnular() {
	}
	
	/**
	 * JUnit : Listando Metodo ListarPlatos
	 * */
	@Test
	public void testListarPlatos() {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buscomida");
	String condicionPlato = "a";
	String condicionPrecio = "000";
	
	
	EntityManager em = emf.createEntityManager();
	Query q;
	List listPlatos;
	System.out.println("ValorEnListaBBBr:" + condicionPlato);
	
	System.out.println("RP" + condicionPrecio);
	if (condicionPrecio==null||condicionPrecio.equals("000")) {
		System.out.println("En no vacio");
		q = em.createQuery("SELECT a FROM PlatoEntity a where a.nombremostrar LIKE :condicionPlato ORDER by a.votopromedio desc");
		q.setParameter("condicionPlato", "%" + condicionPlato + "%");
		listPlatos = q.getResultList();
	} else {
		System.out.println("En no vacio");
		q = em.createQuery("SELECT a FROM PlatoEntity a join a.rangoprecio r where a.nombremostrar LIKE :condicionPlato AND r.idRango = :condicionPrecio ORDER by a.votopromedio desc");
		q.setParameter("condicionPlato", "%" + condicionPlato + "%");
		q.setParameter("condicionPrecio", Integer.parseInt(condicionPrecio));
		listPlatos = q.getResultList();
	
	}
		
	System.out.println("listPlatos.size : " + listPlatos.size());
	}

	@Test
	public void testBuscarPLato() {
	}

}
