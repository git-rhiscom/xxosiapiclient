package com.rhiscom.persistence.inventario.services;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.dao.XXOSIFactoryDAO;



public class CargaInicialMaestroDeProductosService implements
		ICargaInicialMaestroDeProductosService {

	@Override
	public void generarExtraccionMaestroDeProductos() throws PersistenceExceptionInventario {
		ICargaInicialMaestroDeProductosDAO cargaInicialMaestroDeProductosDAO = XXOSIFactoryDAO.getInstance().getCargaInicialMaestroDeProductosDAO();
		cargaInicialMaestroDeProductosDAO.generarExtraccionDesdeVistaXXOSI();
	}

}
