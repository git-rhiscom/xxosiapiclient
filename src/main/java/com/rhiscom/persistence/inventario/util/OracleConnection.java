package com.rhiscom.persistence.inventario.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.rhiscom.persistence.inventario.common.OracleConnectionException;

//import com.rhiscom.ojdbc.exception.OracleConnectionException;

/**
 * This Class initialize a connection with a data base oracle complaint.
 * 
 * @author Freddy Castro <freddy.castro@rhiscom.cl>
 * @since 06-02-2014
 * @version 1.0
 */
public class OracleConnection {

	private static Logger logger = Logger.getLogger(OracleConnection.class);
	private static OracleConnection instance = null;
	
	private Connection connection = null;

	/**
	 * Private default constructor.
	 */
	private OracleConnection() { }
	
	/**
	 * Method to access to singleton instance of an OracleConnection Object.
	 * 
	 * @return
	 */
	public static OracleConnection getInstance() {
		if (instance == null) {
			return new OracleConnection();
		
		} else {
			return instance;
		}
	}
	
	/**
	 * Try to get a connection with the data base.
	 * 
	 * @param oConnInfo the data source connection parameters.
	 * @return
	 */
	public Connection getConnection(OracleConnectionInfo oConnInfo) throws OracleConnectionException {
		if (this.connection == null) { 
			return connect(oConnInfo);
		
		} else { return this.connection; }
	}
	
	/**
	 * Try to get a connection with the oracle data base using the ojdbc6.jar JDBC Driver.
	 * 
	 * @param oConnInfo
	 * @return
	 */
	private Connection connect(OracleConnectionInfo oConnInfo) throws OracleConnectionException {
		try {
			logger.info("Triying to load the Oracle JDBC Driver from classpath ...");
			Class.forName("oracle.jdbc.driver.OracleDriver");

		} catch (ClassNotFoundException ex) {
			throw new OracleConnectionException("Oracle JDBC Driver not found.", ex);
		}

		logger.info("Oracle JDBC Driver Registered !.");
		
		try {
			logger.info("Connecting with the oracle data base ...");
			this.connection = DriverManager.getConnection(oConnInfo.getUrl(), oConnInfo.getUser(), oConnInfo.getPass());
			if (this.connection != null) {
				logger.info("Connection Successfully !. Done.");
			}

		} catch (SQLException e) {
			throw new OracleConnectionException("Connection Failed!. Please review you data source input parameters. ", e);
		}

		return this.connection;
	}

}
