package edu.cibertec.buscomida.test.junit;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Test;

import edu.cibertec.buscomida.util.persistence.CategoriaEntity;
import edu.cibertec.buscomida.util.persistence.DistritoEntity;
import edu.cibertec.buscomida.util.persistence.RangoprecioEntity;



public class ComboImplTest {

	@Test
	public void testListarCategoria() {
		EntityManagerFactory emf = Persistence
		.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();

		List lstCategoria = em.createQuery("SELECT o FROM CategoriaEntity o").getResultList();

		for (int i = 0; i < lstCategoria.size(); i++) {
			CategoriaEntity catPrueba=	(CategoriaEntity)lstCategoria.get(i);
			System.out.println("Categoria : " + catPrueba.getIdCategoria());
			System.out.println("Descripcion : " + catPrueba.getDescripcion());
			;
		}
		

	}

	@Test
	public void testListarDistrito() {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();

		List lstDistrito = em.createQuery("SELECT o FROM DistritoEntity o")
				.getResultList();

		for (int i = 0; i < lstDistrito.size(); i++) {
			DistritoEntity disPrueba=	(DistritoEntity)lstDistrito.get(i);
			System.out.println("Distrito : " + disPrueba.getIdDistrito());
			System.out.println("Descripcion : " + disPrueba.getDescripcion());
			
		}
		
	}

	@Test
	public void testListarRangoPrecio() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Buscomida");
		EntityManager em = emf.createEntityManager();
	
		List<RangoprecioEntity> lstRangoPrecio = em.createQuery(
		"SELECT o FROM RangoprecioEntity o order by o.minPrecio")
		.getResultList();
		

		for (int i = 0; i < lstRangoPrecio.size(); i++) {
			RangoprecioEntity rangoPrueba=	(RangoprecioEntity)lstRangoPrecio.get(i);
			System.out.println("Distrito : " + rangoPrueba.getIdRango());
			System.out.println("MinPrecio : " + rangoPrueba.getMinPrecio());
			System.out.println("MaxPrecio : " + rangoPrueba.getMaxPrecio());
			
		}
		
	}

}
