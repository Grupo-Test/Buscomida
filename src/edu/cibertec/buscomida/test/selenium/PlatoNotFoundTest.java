package edu.cibertec.buscomida.test.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlatoNotFoundTest extends SeleneseTestBase {
	
	private static final String SELENIUM_SERVER_PORT = "4444";
	
	@Before
	public void setUp() throws Exception {
		setUp("http://localhost:8080/", "*firefox", Integer.valueOf(SELENIUM_SERVER_PORT));		
	}

	@Test
	public void testPlatoNotFound() throws Exception {
		selenium.open("/buscomida/paginas/busqueda/buscarPlato.jsf");
		selenium.click("link=Buscar Platos");
		selenium.waitForPageToLoad("30000");
		selenium.type("id=acSimple_input", "Plato incognita");
		selenium.select("name=j_idt34", "label=CERCADO");
		selenium.click("css=option[value=1]");
		selenium.click("id=j_idt37");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("(0 of 0)"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
