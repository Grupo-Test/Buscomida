package edu.cibertec.buscomida.mantenimiento.facade;

import java.util.List;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

public interface PlatoFacade {
	public abstract boolean grabar(PlatoEntity PlatoEntity) throws Exception;
	public abstract boolean modificar(PlatoEntity PlatoEntity) throws Exception;
	public abstract boolean anular(PlatoEntity PlatoEntity) throws Exception;
	public abstract List listarPlatos(String condicionPlato, String condicionDistrito, String condicionPrecio) throws Exception;
	public abstract PlatoEntity buscarPLato(int idPlato) throws Exception;
}
