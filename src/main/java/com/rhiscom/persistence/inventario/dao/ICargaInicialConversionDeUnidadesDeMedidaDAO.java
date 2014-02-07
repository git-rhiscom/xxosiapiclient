package com.rhiscom.persistence.inventario.dao;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;

public interface ICargaInicialConversionDeUnidadesDeMedidaDAO {

	void generarExtraccionDesdeVistaXXOSI()
			throws PersistenceExceptionInventario;

}
