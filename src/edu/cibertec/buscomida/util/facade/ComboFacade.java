package edu.cibertec.buscomida.util.facade;

import java.util.List;



public interface ComboFacade  {
	
	public abstract List  listarCategoria() throws Exception;
	public abstract List listarDistrito() throws Exception;
	public abstract List listarRangoPrecio() throws Exception;
	
}
