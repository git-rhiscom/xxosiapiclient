package com.rhiscom.persistence.inventario.services;

import java.util.ArrayList;
import java.util.List;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.dao.XXOSIFactoryDAO;
import com.rhiscom.persistence.inventario.entity.xxosi.ProductoXXOSI;



public class CargaInicialMaestroDeProductosService implements
		ICargaInicialMaestroDeProductosService {

	@Override
	public List<ProductoXXOSI>  generarExtraccionMaestroDeProductos(String url, String schema, String username, String password) throws PersistenceExceptionInventario {
		ICargaInicialMaestroDeProductosDAO cargaInicialMaestroDeProductosDAO = XXOSIFactoryDAO.getInstance().getCargaInicialMaestroDeProductosDAO();
		List<ProductoXXOSI> listadoProductosNuevos = new ArrayList<ProductoXXOSI>();
				
		listadoProductosNuevos = cargaInicialMaestroDeProductosDAO.leerProductosXXOSI(url, schema, username, password);
		
		//cargaInicialMaestroDeProductosDAO.crearProductos(listadoProductosNuevos);
				
		//cargaInicialMaestroDeProductosDAO.actualizarEstadoProductosXXOSI(listadoProductosNuevos);
		
		//cargaInicialMaestroDeProductosDAO.actualizarProductos(listadoProductosNuevos);
		
		//listadoProductosNuevos = cargaInicialMaestroDeProductosDAO.validadorDeExistentes(listadoProductosNuevos);

		return listadoProductosNuevos;
	}

}
