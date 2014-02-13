package com.rhiscom.persistence.inventario.dao;

import java.util.List;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.entity.Producto;
import com.rhiscom.persistence.inventario.entity.xxosi.ProductoXXOSI;

public interface ICargaInicialMaestroDeProductosDAO {

	void generarExtraccionDesdeVistaXXOSI() throws PersistenceExceptionInventario;	

	List<ProductoXXOSI> leerProductosXXOSI() throws PersistenceExceptionInventario;
	
	void crearProductos(List<ProductoXXOSI> listadoProductos) throws PersistenceExceptionInventario;
	
	void actualizarProductos(List<ProductoXXOSI> listadoProductos) throws PersistenceExceptionInventario;

	void actualizarEstadoProductosXXOSI(List<ProductoXXOSI> listadoProductos) throws PersistenceExceptionInventario;

	List<ProductoXXOSI> validadorDeExistentes(List<ProductoXXOSI> listadoProductos) throws PersistenceExceptionInventario;

}
