package edu.cibertec.buscomida.mantenimiento.facade;

import java.util.List;
import java.util.Map;

import edu.cibertec.buscomida.mantenimiento.persistence.PlatoEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.RestauranteEntity;
import edu.cibertec.buscomida.mantenimiento.persistence.SucursalEntity;

public interface MantenimientoFacade {
	public abstract boolean grabar(RestauranteEntity RestauranteEntity) throws Exception;
	public abstract boolean modificar(RestauranteEntity RestauranteEntity) throws Exception;
	public abstract boolean anular(RestauranteEntity RestauranteEntity) throws Exception;
	public abstract List listarResturantes() throws Exception;
	public abstract RestauranteEntity buscarResturante(int idRestaurante) throws Exception;
	
	public abstract void registrarMantenimiento(RestauranteEntity restaurante,List<SucursalEntity> sucursal, List<PlatoEntity> plato) throws Exception;
}
