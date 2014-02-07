package com.rhiscom.persistence.inventario;

import org.junit.Assert;
import org.junit.Test;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.CargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.services.CargaInicialDeConversionUnidadesDeMedidaService;
import com.rhiscom.persistence.inventario.services.ICargaInicialConversionDeUnidadesDeMedidaService;
import com.rhiscom.persistence.inventario.services.ICargaInicialMaestroDeProductosService;
import com.rhiscom.persistence.inventario.services.ServicesXXOSIFactory;

public class CargaInicialConversionUnidadesMedidaTests {

	@Test
	public void generarCargaInicialConversionUnidadesDeMedida() {

		ICargaInicialConversionDeUnidadesDeMedidaService service = ServicesXXOSIFactory
				.getInstace()
				.getCargaInicialConversionUnidadesDeMedidaService();
		try {
			service.generarExtraccionDesdeVistaXXOSI();
			Assert.assertTrue(true);
		} catch (PersistenceExceptionInventario e) {
			Assert.fail();
			e.printStackTrace();
		}

	}

	@Test
	public void getConnectionTest() {

	}

	@Test
	public void generarCargaInicialMaestroDeProductos() {
		ICargaInicialMaestroDeProductosService service = ServicesXXOSIFactory
				.getInstace().getCargaIinicialMaestroDeProductos();
		try {
			service.generarExtraccionMaestroDeProductos();
			Assert.assertTrue(true);
		} catch (PersistenceExceptionInventario e) {
			Assert.fail();
			e.printStackTrace();
		}

	}


}
