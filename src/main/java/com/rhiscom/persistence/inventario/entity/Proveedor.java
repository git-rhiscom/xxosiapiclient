package com.rhiscom.persistence.inventario.entity;

public class Proveedor implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private String doBusinessAs;
	private String identificationTypeCode;
	private String identificationTypeDescription;
	private Integer identifier;
	private String adressLine1;
	private String adressLine2;
	private String adressLine3;
	private String adressLine4;
	private String isoCountryCode;
	private String countryName;
	private String city;
	private String postalCode;
	private String ituCountryCode;
	private String ituCountryCodeName;
	private String areaCode;
	private String telephoneNumber;
	private String extensionNumber;
	private String completeNumber;
	private String emailAddress;

	public Proveedor() {

	}

	public Proveedor(String name, String doBusinessAs,
			String identificationTypeCode,
			String identificationTypeDescription, Integer identifier,
			String adressLine1, String adressLine2, String adressLine3,
			String adressLine4, String isoCountryCode, String countryName,
			String city, String postalCode, String ituCountryCode,
			String ituCountryCodeName, String areaCode, String telephoneNumber,
			String extensionNumber, String completeNumber, String emailAddress) {

		this.name = name;
		this.doBusinessAs = doBusinessAs;
		this.identificationTypeCode = identificationTypeCode;
		this.identificationTypeDescription = identificationTypeDescription;
		this.identifier = identifier;
		this.adressLine1 = adressLine1;
		this.adressLine2 = adressLine2;
		this.adressLine3 = adressLine3;
		this.adressLine4 = adressLine4;
		this.isoCountryCode = isoCountryCode;
		this.countryName = countryName;
		this.city = city;
		this.postalCode = postalCode;
		this.ituCountryCode = ituCountryCode;
		this.ituCountryCodeName = ituCountryCodeName;
		this.areaCode = areaCode;
		this.telephoneNumber = telephoneNumber;
		this.extensionNumber = extensionNumber;
		this.completeNumber = completeNumber;
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDoBusinessAs() {
		return doBusinessAs;
	}

	public void setDoBusinessAs(String doBusinessAs) {
		this.doBusinessAs = doBusinessAs;
	}

	public String getIdentificationTypeCode() {
		return identificationTypeCode;
	}

	public void setIdentificationTypeCode(String identificationTypeCode) {
		this.identificationTypeCode = identificationTypeCode;
	}

	public String getIdentificationTypeDescription() {
		return identificationTypeDescription;
	}

	public void setIdentificationTypeDescription(
			String identificationTypeDescription) {
		this.identificationTypeDescription = identificationTypeDescription;
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}

	public String getAdressLine1() {
		return adressLine1;
	}

	public void setAdressLine1(String adressLine1) {
		this.adressLine1 = adressLine1;
	}

	public String getAdressLine2() {
		return adressLine2;
	}

	public void setAdressLine2(String adressLine2) {
		this.adressLine2 = adressLine2;
	}

	public String getAdressLine3() {
		return adressLine3;
	}

	public void setAdressLine3(String adressLine3) {
		this.adressLine3 = adressLine3;
	}

	public String getAdressLine4() {
		return adressLine4;
	}

	public void setAdressLine4(String adressLine4) {
		this.adressLine4 = adressLine4;
	}

	public String getIsoCountryCode() {
		return isoCountryCode;
	}

	public void setIsoCountryCode(String isoCountryCode) {
		this.isoCountryCode = isoCountryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getItuCountryCode() {
		return ituCountryCode;
	}

	public void setItuCountryCode(String ituCountryCode) {
		this.ituCountryCode = ituCountryCode;
	}

	public String getItuCountryCodeName() {
		return ituCountryCodeName;
	}

	public void setItuCountryCodeName(String ituCountryCodeName) {
		this.ituCountryCodeName = ituCountryCodeName;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getTelephoneNumber() {
		return telephoneNumber;
	}

	public void setTelephoneNumber(String telephoneNumber) {
		this.telephoneNumber = telephoneNumber;
	}

	public String getExtensionNumber() {
		return extensionNumber;
	}

	public void setExtensionNumber(String extensionNumber) {
		this.extensionNumber = extensionNumber;
	}

	public String getCompleteNumber() {
		return completeNumber;
	}

	public void setCompleteNumber(String completeNumber) {
		this.completeNumber = completeNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
