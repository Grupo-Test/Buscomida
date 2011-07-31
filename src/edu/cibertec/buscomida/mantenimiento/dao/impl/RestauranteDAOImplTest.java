package edu.cibertec.buscomida.mantenimiento.dao.impl;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;
import edu.cibertec.buscomida.util.persistence.CategoriaEntity;
import edu.cibertec.buscomida.util.persistence.RangoprecioEntity;
import edu.cibertec.buscomida.util.resources.ConstantesConfig;

public class RestauranteDAOImplTest {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buscomida");
	EntityManager em  = emf.createEntityManager();
	
	@Test
	public void testGrabar() {
		
	}

	@Test
	public void testModificar() {
	}

	@Test
	public void testAnular() {
	}

	@Test
	public void testListarResturantes() {
	}

	@Test
	public void testBuscarResturante() {
	}
	
	@Test
	public void testInsertarRestaurante() {
		//Inicializando
		RestauranteEntity restaurante;
		List<PlatoEntity> plato;
		List<SucursalEntity> sucursal;
		
		//Data de prueba Construyendo objetos
		restaurante = new RestauranteEntity();
		plato = new ArrayList<PlatoEntity>();
		sucursal = new ArrayList<SucursalEntity>();
		
		//restaurante.setIdRest(105500);
		restaurante.setNombreMostrar("Cau Cau Marino");
		restaurante.setContrasena("123456");
		restaurante.setDescripcion("Restaurante de platos Marinos");
		restaurante.setEmail("marino@marino.com");
		restaurante.setEstado("1");
		restaurante.setFoto("MiPrueba.jpg");
		restaurante.setRazon("El tronco");
		restaurante.setRuc("123456789");
		//restaurante.setPlatos(plato);
		//restaurante.setSucursals(sucursal);
		
		PlatoEntity platoTemp = new PlatoEntity();
		
		platoTemp.getCategoria().setIdCategoria(1000);

		platoTemp.getRangoprecio().setIdRango(500);
		plato.add(platoTemp);
		
		SucursalEntity sucursalTemp = new SucursalEntity();
		sucursalTemp.setTelefono("72543855");
		sucursalTemp.setDireccion("Av Cirvcunvalacion 6720");		
		sucursalTemp.setEstado("1");
		sucursalTemp.getDistrito().setIdDistrito(1);
		sucursal.add(sucursalTemp);
		
		
		
		//Seteando Variables
		em.getTransaction().begin();
		try {

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
