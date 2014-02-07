package com.rhiscom.persistence.inventario.dao;


public class XXOSIFactoryDAO {

	private static XXOSIFactoryDAO instance = null;

	public static XXOSIFactoryDAO getInstance() {

		if (instance == null) {
			instance = new XXOSIFactoryDAO();
		}
		return instance;
	}

	private XXOSIFactoryDAO() {

	}

	public ICargaInicialConversionDeUnidadesDeMedidaDAO getCargaInicialDeUnidadesDeMedidaDAO() {
		return new CargaInicialConversionDeUnidadesDeMedidaDAO();
	}

	public ICargaInicialMaestroDeProductosDAO getCargaInicialMaestroDeProductosDAO() {
		
		return new CargaInicialMaestroDeProductosDAO();
	}

}
