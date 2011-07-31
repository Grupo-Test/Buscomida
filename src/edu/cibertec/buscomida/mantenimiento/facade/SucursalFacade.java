package edu.cibertec.buscomida.mantenimiento.facade;

import java.util.List;

import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

public interface SucursalFacade {
	public abstract boolean grabar(SucursalEntity SucursalEntity) throws Exception;
	public abstract boolean modificar(SucursalEntity SucursalEntity) throws Exception;
	public abstract boolean anular(SucursalEntity SucursalEntity) throws Exception;
	public abstract List listarSucursal() throws Exception;
	public abstract SucursalEntity buscarSucursal(int idSucursal) throws Exception;
}
