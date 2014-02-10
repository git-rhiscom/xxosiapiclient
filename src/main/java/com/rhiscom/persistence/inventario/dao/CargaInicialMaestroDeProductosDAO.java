package com.rhiscom.persistence.inventario.dao;


import com.rhiscom.persistence.inventario.common.OracleConnectionException;
import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.entity.xxosi.ProductoXXOSI;
import com.rhiscom.persistence.inventario.util.HibernateUtil;
import com.rhiscom.persistence.inventario.util.OracleConnection;
import com.rhiscom.persistence.inventario.util.OracleConnectionInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

//import org.apache.log4j.Logger;


public class CargaInicialMaestroDeProductosDAO implements ICargaInicialMaestroDeProductosDAO {

	@Override
	public void generarExtraccionDesdeVistaXXOSI() throws PersistenceExceptionInventario {
		// TODO Codigo feo de Freddy


		// Default data source connection parameters.
		String URL = "jdbc:oracle:thin:@128.1.175.138:1521:XE";
		String USER = "FARMASANITASFR";
		String PASS = "FARMASANITASFR";

		/**
		 * @param args
		 */

		//logger.info("Initializing Oracle JDBC Test application ...");
		OracleConnectionInfo oConnInfo = new OracleConnectionInfo(URL, USER, PASS);
		OracleConnection oConn = OracleConnection.getInstance();

		// Gets connection to data model.
		Connection conn = null;
		try {
			conn = oConn.getConnection(oConnInfo);
		} catch (OracleConnectionException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		String ENTITY_NAME = "IN_MA_PR";

		try {
			Statement statement = conn.createStatement();
			statement.executeQuery("INSERT INTO " + ENTITY_NAME
					+ " (IT_ID,IT_NA) VALUES ('111111113','FLAPA Treh')");

			// Close the connection resources.
			statement.close();

		} catch (SQLException e) {
			//logger.error("Problems executing SQL Query: " + e.getMessage());
		}

	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<ProductoXXOSI> leerProductosXXOSI() throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		List<ProductoXXOSI> list = new ArrayList<ProductoXXOSI>();
		Session session = HibernateUtil.getSessionFactoryXXOSI().openSession();
		
		//FAIL 1: Usando Criteria
			/*
			Criteria criteria = session.createCriteria(ProductoXXOSI.class);
			List<ProductoXXOSI> listaProductosNuevos = criteria.list();
			*/
		
		//FAIL 2: Usando HQL
			/*
			Query query = session.createQuery("from ProductoXXOSI");
			list = query.list();
			*/
		
		//FAIL 3: Usando SQL simp
		
		list = (List<ProductoXXOSI>)session.createQuery("select v from ProductoXXOSI v").list();
		
		
		
		return list;

	}
	
	@Override
	public void crearProductoFarmasanitas() throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		

	}
	
	@Override
	public void actualizarProductosXXOSI() throws PersistenceExceptionInventario {

		// Default data source connection parameters.
		

	}
	
}

