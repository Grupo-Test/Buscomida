package edu.cibertec.buscomida.test.selenium;

import com.thoughtworks.selenium.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SucursalInsertTest extends SeleneseTestBase {
	private static final String SELENIUM_SERVER_PORT = "4444";
	
	@Before
	public void setUp() throws Exception {
		setUp("http://localhost:8080/", "*firefox", Integer.valueOf(SELENIUM_SERVER_PORT));		
	}

	@Test
	public void testSucursalInsert() throws Exception {
		selenium.open("/buscomida/paginas/busqueda/buscarPlato.jsf");
		selenium.click("link=Registrar Restaurante");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=j_idt51");
		selenium.select("name=j_idt92", "label=LA MOLINA");
		selenium.type("name=j_idt96", "72543855");
		selenium.type("id=sucDireccion", "Av. El Libertador , Juan Pablo II");
		selenium.click("id=btnAceptarSuc");
		selenium.click("id=btnAceptarSuc");
		selenium.click("//div[@id='gmap']/div/div/div/div[4]/div/div/div");
		selenium.click("id=btnAceptarSuc");
		verifyTrue(selenium.isTextPresent("LA MOLINA"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
