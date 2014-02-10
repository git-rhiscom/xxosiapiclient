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
	public void generarExtraccionMaestroDeProductos() throws PersistenceExceptionInventario {
		ICargaInicialMaestroDeProductosDAO cargaInicialMaestroDeProductosDAO = XXOSIFactoryDAO.getInstance().getCargaInicialMaestroDeProductosDAO();
		cargaInicialMaestroDeProductosDAO.generarExtraccionDesdeVistaXXOSI();
	}
	
	@Override
	public List<ProductoXXOSI>  generarExtraccionMaestroDeProductosHibernate() throws PersistenceExceptionInventario {
		ICargaInicialMaestroDeProductosDAO cargaInicialMaestroDeProductosDAO = XXOSIFactoryDAO.getInstance().getCargaInicialMaestroDeProductosDAO();
		List<ProductoXXOSI> listadoProductosNuevos = new ArrayList<ProductoXXOSI>();
		
		
		listadoProductosNuevos = cargaInicialMaestroDeProductosDAO.leerProductosXXOSI();
		return listadoProductosNuevos;
	}

}
