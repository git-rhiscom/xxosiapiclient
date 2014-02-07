package com.rhiscom.persistence.inventario.util;

/**
 * Encapsulates all oracle data source connection parameters.
 * 
 * @author Freddy Castro <freddy.castro@rhiscom.cl>
 * @since 06-02-2014
 * @version 1.0
 */
public class OracleConnectionInfo {
	
	// Data source connection parameters
	private String url  = null;
	private String user = null;
	private String pass = null;
	
	// Default Constructor.
	public OracleConnectionInfo() {	}
	
	// Constructor with basic connection info parameters.
	public OracleConnectionInfo(String url, String user, String pass) {
		this.url  = url;
		this.user = user;
		this.pass = pass;
	}
	
	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the user
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}

}
