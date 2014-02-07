package com.rhiscom.persistence.inventario.services;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.ICargaInicialConversionDeUnidadesDeMedidaDAO;
import com.rhiscom.persistence.inventario.dao.XXOSIFactoryDAO;
import com.rhiscom.persistence.inventario.entity.ConversionUnidadMedida;
import com.rhiscom.persistence.inventario.util.HibernateUtil;

import org.hibernate.Session;





public class CargaInicialDeConversionUnidadesDeMedidaService implements ICargaInicialConversionDeUnidadesDeMedidaService {
@Override
	public void generarExtraccionDesdeVistaXXOSI() throws PersistenceExceptionInventario {
		
		ICargaInicialConversionDeUnidadesDeMedidaDAO cargaInicialDeUnidadesDeMedidaDAO= XXOSIFactoryDAO.getInstance().getCargaInicialDeUnidadesDeMedidaDAO();
		cargaInicialDeUnidadesDeMedidaDAO.generarExtraccionDesdeVistaXXOSI();
		
	}

}
