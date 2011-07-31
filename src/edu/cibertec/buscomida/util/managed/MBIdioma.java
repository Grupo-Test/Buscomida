package edu.cibertec.buscomida.util.managed;

import java.io.IOException;
import java.io.PrintWriter;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;

//@ManagedBean(name="idioma")
public class MBIdioma {
	
	private String locale="es";

	  public void setLocale(String locale) {
	    this.locale = locale;
	  }

	  public String getLocale() {
	    return locale;
	  }

	  public void cambiarEN() {
		System.out.println("Idioma: "+ locale);  
	    locale="en";
	  }
	  public void cambiarES() {
		System.out.println("Idioma: " +locale);  
		locale="es";
	  }
	  
	  public void cambiarJA() {
			System.out.println("Idioma: " +locale);
			FacesContext facesContext = FacesContext
			.getCurrentInstance();
//			ServletContext scontext = (ServletContext) facesContext
//			.getExternalContext().getContext();
			HttpServletResponse res=(HttpServletResponse) facesContext
			.getExternalContext().getResponse();
			res.setContentType("text/plain; charset=Shift_JIS");
		    try {
				PrintWriter out = res.getWriter();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    res.setHeader("Content-Language", "ja");
		    locale ="ja";
	  }


}
