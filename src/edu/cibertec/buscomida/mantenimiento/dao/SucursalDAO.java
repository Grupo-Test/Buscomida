package edu.cibertec.buscomida.mantenimiento.dao;

import java.util.List;

import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

public interface SucursalDAO {
	public abstract boolean grabar(SucursalEntity SucursalEntity) throws Exception;
	public abstract boolean modificar(SucursalEntity SucursalEntity) throws Exception;
	public abstract boolean anular(SucursalEntity SucursalEntity) throws Exception;
	public abstract List listarSucursal() throws Exception;
	public abstract SucursalEntity buscarSucursal(int idSucursal) throws Exception;
	public abstract void insertarSucursal(SucursalEntity sucursal)throws Exception;
}
