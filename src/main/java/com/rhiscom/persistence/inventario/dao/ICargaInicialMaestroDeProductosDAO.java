package com.rhiscom.persistence.inventario.dao;

import java.util.List;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.entity.xxosi.ProductoXXOSI;

public interface ICargaInicialMaestroDeProductosDAO {

	void generarExtraccionDesdeVistaXXOSI() throws PersistenceExceptionInventario;	

	List<ProductoXXOSI> leerProductosXXOSI() throws PersistenceExceptionInventario;
	
	void crearProductoFarmasanitas() throws PersistenceExceptionInventario;

	void actualizarProductosXXOSI() throws PersistenceExceptionInventario;	
}
