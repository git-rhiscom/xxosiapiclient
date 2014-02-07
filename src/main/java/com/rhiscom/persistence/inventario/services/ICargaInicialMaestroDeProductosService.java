package com.rhiscom.persistence.inventario.services;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;

public interface ICargaInicialMaestroDeProductosService {

	void generarExtraccionMaestroDeProductos()
			throws PersistenceExceptionInventario;

}
