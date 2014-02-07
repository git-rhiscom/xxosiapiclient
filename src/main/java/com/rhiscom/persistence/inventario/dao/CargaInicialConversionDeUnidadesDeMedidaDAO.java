package com.rhiscom.persistence.inventario.dao;

import org.hibernate.Session;

import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.entity.ConversionUnidadMedida;
import com.rhiscom.persistence.inventario.util.HibernateUtil;

public class CargaInicialConversionDeUnidadesDeMedidaDAO implements
		ICargaInicialConversionDeUnidadesDeMedidaDAO {

@Override	
public void generarExtraccionDesdeVistaXXOSI() throws PersistenceExceptionInventario {
		
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
 
		session.beginTransaction();
		ConversionUnidadMedida unidadMedida = new ConversionUnidadMedida();
 
		unidadMedida.setIdConversion(4);
		unidadMedida.setNombreUnidadMedida("superman");
		unidadMedida.setCantidadUnidades(20);

 
		session.save(unidadMedida);
		session.getTransaction().commit();
		
		HibernateUtil.getSessionFactory().close();
		
	}
	
}
