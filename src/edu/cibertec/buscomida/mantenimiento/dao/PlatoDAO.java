package edu.cibertec.buscomida.mantenimiento.dao;

import java.util.List;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;

public interface PlatoDAO {
	public abstract boolean grabar(PlatoEntity plato) throws Exception;
	public abstract boolean modificar(PlatoEntity plato) throws Exception;
	public abstract boolean anular(PlatoEntity plato) throws Exception;
	public abstract List listarPlatos(String condicionPlato, String condicionDistrito,String condicionPrecio) throws Exception;
	public abstract PlatoEntity buscarPLato(int idPlato) throws Exception;
}
