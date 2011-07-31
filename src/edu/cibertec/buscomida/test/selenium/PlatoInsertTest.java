package edu.cibertec.buscomida.test.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PlatoInsertTest extends SeleneseTestBase {
	
	private static final String SELENIUM_SERVER_PORT = "4444";
	
	@Before
	public void setUp() throws Exception {
		setUp("http://localhost:8080/", "*firefox", Integer.valueOf(SELENIUM_SERVER_PORT));		
	}
   
	@Test
	public void testPlatoInsert() throws Exception {
		selenium.open("/buscomida/paginas/busqueda/buscarPlato.jsf");
		selenium.click("link=Registrar Restaurante");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=j_idt65");
		selenium.type("id=nombremostrar", "Plato Prueba");
		selenium.select("name=j_idt114", "label=MODERADO2");
		selenium.select("name=j_idt110", "label=COMIDA CRIOLLA");
		selenium.type("name=j_idt118", "Plato de Prueba");
		selenium.click("id=j_idt128");
		verifyTrue(selenium.isTextPresent("Plato Prueba"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
