package com.rhiscom.persistence.inventario.entity.xxosi;

public class ProductoXXOSI implements java.io.Serializable {
	
	/**
	 * 
	 */
	private String itemId;
	private String itemName;
	private String itemDescription;
	private String alternativeItemId1;	
	private String alternativeItemId2;
	private String alternativeItemId3;
	private String alternativeItemId4;
	private Boolean priceEntryRequiredFlag;
	private Boolean discountableFlag;
	private Boolean promotionableFlag;
	private Boolean authorizedForSaleFlag;
	private Boolean consignationFlag;
	private String taxExemptCode;
	private String weightOrUnitCountCode;
	private String unitOfMeasureCode;
	private char estado;
	
	public ProductoXXOSI(){
		
	}
	
	public ProductoXXOSI(String itemId, String itemName, String itemDescription, String alternativeItemId1, String alternativeItemId2, String alternativeItemId3, String alternativeItemId4, Boolean priceEntryRequiredFlag, Boolean discountableFlag, Boolean promotionableFlag, Boolean authorizedForSaleFlag, Boolean consignationFlag, String taxExemptCode, String weightOrUnitCountCode, String unitOfMeasureCode, char estado){
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemDescription=itemDescription;
		this.alternativeItemId1=alternativeItemId1;
		this.alternativeItemId2=alternativeItemId2;
		this.alternativeItemId3=alternativeItemId3;
		this.alternativeItemId4=alternativeItemId4;
		this.priceEntryRequiredFlag=priceEntryRequiredFlag;
		this.discountableFlag=discountableFlag;
		this.promotionableFlag=promotionableFlag;
		this.authorizedForSaleFlag=authorizedForSaleFlag;
		this.consignationFlag=consignationFlag;
		this.taxExemptCode=taxExemptCode;
		this.weightOrUnitCountCode=weightOrUnitCountCode;
		this.unitOfMeasureCode=unitOfMeasureCode;
		this.estado=estado;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	public String getAlternativeItemId1() {
		return alternativeItemId1;
	}

	public void setAlternativeItemId1(String alternativeItemId1) {
		this.alternativeItemId1 = alternativeItemId1;
	}

	public String getAlternativeItemId2() {
		return alternativeItemId2;
	}

	public void setAlternativeItemId2(String alternativeItemId2) {
		this.alternativeItemId2 = alternativeItemId2;
	}

	public String getAlternativeItemId3() {
		return alternativeItemId3;
	}

	public void setAlternativeItemId3(String alternativeItemId3) {
		this.alternativeItemId3 = alternativeItemId3;
	}

	public String getAlternativeItemId4() {
		return alternativeItemId4;
	}

	public void setAlternativeItemId4(String alternativeItemId4) {
		this.alternativeItemId4 = alternativeItemId4;
	}

	public Boolean getPriceEntryRequiredFlag() {
		return priceEntryRequiredFlag;
	}

	public void setPriceEntryRequiredFlag(Boolean priceEntryRequiredFlag) {
		this.priceEntryRequiredFlag = priceEntryRequiredFlag;
	}

	public Boolean getDiscountableFlag() {
		return discountableFlag;
	}

	public void setDiscountableFlag(Boolean discountableFlag) {
		this.discountableFlag = discountableFlag;
	}

	public Boolean getPromotionableFlag() {
		return promotionableFlag;
	}

	public void setPromotionableFlag(Boolean promotionableFlag) {
		this.promotionableFlag = promotionableFlag;
	}

	public Boolean getAuthorizedForSaleFlag() {
		return authorizedForSaleFlag;
	}

	public void setAuthorizedForSaleFlag(Boolean authorizedForSaleFlag) {
		this.authorizedForSaleFlag = authorizedForSaleFlag;
	}

	public Boolean getConsignationFlag() {
		return consignationFlag;
	}

	public void setConsignationFlag(Boolean consignationFlag) {
		this.consignationFlag = consignationFlag;
	}

	public String getTaxExemptCode() {
		return taxExemptCode;
	}

	public void setTaxExemptCode(String taxExemptCode) {
		this.taxExemptCode = taxExemptCode;
	}

	public String getWeightOrUnitCountCode() {
		return weightOrUnitCountCode;
	}

	public void setWeightOrUnitCountCode(String weightOrUnitCountCode) {
		this.weightOrUnitCountCode = weightOrUnitCountCode;
	}

	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

}
