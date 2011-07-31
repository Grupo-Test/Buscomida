package edu.cibertec.buscomida.util.managed;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;

import edu.cibertec.buscomida.util.facade.ComboFacade;
import edu.cibertec.buscomida.util.facade.impl.ComboFacadeImpl;
import edu.cibertec.buscomida.util.persistence.CategoriaEntity;
import edu.cibertec.buscomida.util.persistence.DistritoEntity;
import edu.cibertec.buscomida.util.persistence.RangoprecioEntity;

@ManagedBean(name="combo")
public class MBCombo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	public List<SelectItem> getListaCategoria(){		
		ComboFacade comboFacade=new ComboFacadeImpl();
		List<CategoriaEntity> lstCategoria=null;
		List<SelectItem> listaItem=null; 
		try {
			lstCategoria = (List)comboFacade.listarCategoria();		
			listaItem = new ArrayList<SelectItem>();
			
			for (CategoriaEntity beanCombo : lstCategoria) {
				listaItem.add(new SelectItem(beanCombo.getIdCategoria(), beanCombo.getDescripcion()));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listaItem;
	}
	
	public List<SelectItem> getListaDistrito(){		
		ComboFacade comboFacade=new ComboFacadeImpl();
		List<DistritoEntity> lstDistrito=null;
		List<SelectItem> listaItem=null; 
		try {
			lstDistrito = (List)comboFacade.listarDistrito();		
			listaItem = new ArrayList<SelectItem>();
			
			for (DistritoEntity beanCombo : lstDistrito) {
				listaItem.add(new SelectItem(beanCombo.getIdDistrito(), beanCombo.getDescripcion()));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listaItem;
	}
	
	public List<SelectItem> getListaRangoPrecio(){		
		ComboFacade comboFacade=new ComboFacadeImpl();
		List<RangoprecioEntity> lstRangoPrecio=null;
		List<SelectItem> listaItem=null; 
		try {
			lstRangoPrecio = (List)comboFacade.listarRangoPrecio();		
			listaItem = new ArrayList<SelectItem>();
			
			for (RangoprecioEntity beanCombo : lstRangoPrecio) {
				listaItem.add(new SelectItem(beanCombo.getIdRango(), beanCombo.getDescripcion()));
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return listaItem;
	}
}
