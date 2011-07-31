package edu.cibertec.buscomida.test.selenium;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlatoFoundTest extends SeleneseTestBase {
	private static final String SELENIUM_SERVER_PORT = "4444";
	
	@Before
	public void setUp() throws Exception {
		setUp("http://localhost:8080/", "*firefox", Integer.valueOf(SELENIUM_SERVER_PORT));		
	}

	@Test
	public void testPlatoFound() throws Exception {
		selenium.open("/buscomida/paginas/busqueda/buscarPlato.jsf");
		selenium.type("id=acSimple_input", "Ceviche");
		selenium.click("id=j_idt37");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("CEVICHE"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
