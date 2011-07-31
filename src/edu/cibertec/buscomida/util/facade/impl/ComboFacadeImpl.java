package edu.cibertec.buscomida.util.facade.impl;

import java.util.List;

import edu.cibertec.buscomida.util.dao.ComboDAO;
import edu.cibertec.buscomida.util.dao.impl.ComboImpl;
import edu.cibertec.buscomida.util.facade.ComboFacade;

public class ComboFacadeImpl implements ComboFacade{

	public List listarCategoria() throws Exception  {
		ComboDAO DAOcombo=new ComboImpl();
		
		List lstCategoria = DAOcombo.listarCategoria();
		return lstCategoria;
	}

	public List listarDistrito() throws Exception {
		ComboDAO DAOcombo=new ComboImpl();
		List lstDistrito = DAOcombo.listarDistrito();
		return lstDistrito;
	}

	public List listarRangoPrecio() throws Exception{
		ComboDAO DAOcombo=new ComboImpl();
		List lstRangoPrecio = DAOcombo.listarRangoPrecio();
		return lstRangoPrecio;
	}
	
	
}
