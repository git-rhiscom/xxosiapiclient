package com.rhiscom.persistence.inventario.services;

import com.rhiscom.persistence.inventario.dao.CargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;

public class ServicesXXOSIFactory {

	private static ServicesXXOSIFactory instance = null;

	public static ServicesXXOSIFactory getInstace() {
		if (instance == null) {
			instance = new ServicesXXOSIFactory();
		}
		return instance;
	}

	private ServicesXXOSIFactory() {

	}

	public ICargaInicialConversionDeUnidadesDeMedidaService getCargaInicialConversionUnidadesDeMedidaService() {
	
		return new CargaInicialDeConversionUnidadesDeMedidaService();
	}

	public ICargaInicialMaestroDeProductosService getCargaIinicialMaestroDeProductos() {
	
		return new CargaInicialMaestroDeProductosService();
	}

}
