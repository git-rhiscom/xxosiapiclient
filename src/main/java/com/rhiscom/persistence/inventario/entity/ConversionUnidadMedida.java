package com.rhiscom.persistence.inventario.entity;

public class ConversionUnidadMedida implements java.io.Serializable  {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idConversion;
	private String nombreUnidadMedida;
	private int cantidadUnidades;	
	
	public ConversionUnidadMedida(){		
	}
	
	public ConversionUnidadMedida(int idConversion, String nombreUnidadMedida, int cantidadUnidades){	
		this.idConversion = idConversion;
		this.nombreUnidadMedida = nombreUnidadMedida;
		this.cantidadUnidades = cantidadUnidades;
	}
	

	public int getIdConversion() {
		return idConversion;
	}

	public void setIdConversion(int idConversion) {
		this.idConversion = idConversion;
	}

	public String getNombreUnidadMedida() {
		return nombreUnidadMedida;
	}

	public void setNombreUnidadMedida(String nombreUnidadMedida) {
		this.nombreUnidadMedida = nombreUnidadMedida;
	}

	public int getCantidadUnidades() {
		return cantidadUnidades;
	}

	public void setCantidadUnidades(int cantidadUnidades) {
		this.cantidadUnidades = cantidadUnidades;
	}
	
}
