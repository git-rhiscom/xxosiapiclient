package com.rhiscom.persistence.inventario.entity.xxosi;

import com.rhiscom.persistence.inventario.entity.Proveedor;

public class ProveedorXXOSI extends Proveedor {

	private char estado;
	private String estadoDescripcion;

	public ProveedorXXOSI() {

	}

	public ProveedorXXOSI(String name, String doBusinessAs,
			String identificationTypeCode,
			String identificationTypeDescription, Integer identifier,
			String adressLine1, String adressLine2, String adressLine3,
			String adressLine4, String isoCountryCode, String countryName,
			String city, String postalCode, String ituCountryCode,
			String ituCountryCodeName, String areaCode, String telephoneNumber,
			String extensionNumber, String completeNumber, String emailAddress,
			char estado, String estadoDescripcion) {
		super(name, doBusinessAs, identificationTypeCode,
				identificationTypeDescription, identifier, adressLine1,
				adressLine2, adressLine3, adressLine4, isoCountryCode,
				countryName, city, postalCode, ituCountryCode,
				ituCountryCodeName, areaCode, telephoneNumber, extensionNumber,
				completeNumber, emailAddress);
		this.estado = estado;
		this.estadoDescripcion = estadoDescripcion;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public String getEstadoDescripcion() {
		return estadoDescripcion;
	}

	public void setEstadoDescripcion(String estadoDescripcion) {
		this.estadoDescripcion = estadoDescripcion;
	}

}
