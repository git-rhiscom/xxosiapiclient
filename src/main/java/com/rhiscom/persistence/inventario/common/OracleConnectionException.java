package com.rhiscom.persistence.inventario.common;

/**
 * Oracle Exception for manage data base connection problems.
 * 
 * @author Freddy Castro <freddy.castro@rhiscom.cl>
 * @since 06-02-2014
 * @version 1.0
 */
public class OracleConnectionException extends Exception {

	private static final long serialVersionUID = 1L;
	
	public OracleConnectionException(String msg) {
		super(msg);
	}
	
	public OracleConnectionException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
