package com.rhiscom.persistence.inventario.dao;

import com.rhiscom.persistence.inventario.common.OracleConnectionException;
import com.rhiscom.persistence.inventario.common.PersistenceExceptionInventario;
import com.rhiscom.persistence.inventario.dao.ICargaInicialMaestroDeProductosDAO;
import com.rhiscom.persistence.inventario.util.OracleConnection;
import com.rhiscom.persistence.inventario.util.OracleConnectionInfo;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

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

}
