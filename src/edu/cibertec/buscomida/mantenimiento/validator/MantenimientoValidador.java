package edu.cibertec.buscomida.mantenimiento.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


public class MantenimientoValidador implements Validator{
	
	public void validate(FacesContext context, UIComponent component, Object value)
			throws ValidatorException {
		//throw new ValidatorException(new FacesMessage("Favor no Ingresar este campo en blanco"));
		
		String email = (String)value;
        //Set the email pattern string
        Pattern p = Pattern.compile(".+@.+\\\\.[a-z]+");
        
        //Match the given string with the pattern
        Matcher m = p.matcher(email);
        
        //Check whether match is found
        boolean matchFound = m.matches();
        
        if (!matchFound) {
            FacesMessage message = new FacesMessage();
            message.setDetail("Email not valid");
            message.setSummary("Email not valid");
            message.setSeverity(FacesMessage.SEVERITY_ERROR);
            throw new ValidatorException(message);
        }	
		//if(texto.trim().equals(""))
			//throw new ValidatorException(new FacesMessage("Favor no Ingresar campos en blanco"));	
	}
	
}
