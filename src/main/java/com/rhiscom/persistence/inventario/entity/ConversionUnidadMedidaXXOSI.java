package com.rhiscom.persistence.inventario.entity;

public class ConversionUnidadMedidaXXOSI implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idConversion;
	private String nombreUnidadMedida;
	private int cantidadUnidades;
	private char estado;
	
	public ConversionUnidadMedidaXXOSI(){		
	}
	
	public ConversionUnidadMedidaXXOSI(int idConversion, String nombreUnidadMedida, int cantidadUnidades, char estado){	
		this.setIdConversion(idConversion);
		this.setNombreUnidadMedida(nombreUnidadMedida);
		this.setCantidadUnidades(cantidadUnidades);
		this.setEstado(estado);		
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

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

}
