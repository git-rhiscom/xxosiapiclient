package com.rhiscom.persistence.inventario.entity;


public class Producto implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	private String priceEntryRequiredFlag;
	private String discountableFlag;
	private String promotionableFlag;
	private String authorizedForSaleFlag;
	private String consignationFlag;
	private String taxExemptCode;
	private String weightOrUnitCountCode;
	private String unitOfMeasureCode;
	
	public Producto(){
		
	}
	
	public Producto(String itemId, String itemName, String itemDescription, String alternativeItemId1, String alternativeItemId2, String alternativeItemId3, String alternativeItemId4, String priceEntryRequiredFlag, String discountableFlag, String promotionableFlag, String authorizedForSaleFlag, String consignationFlag, String taxExemptCode, String weightOrUnitCountCode, String unitOfMeasureCode){
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

	public String getPriceEntryRequiredFlag() {
		return priceEntryRequiredFlag;
	}

	public void setPriceEntryRequiredFlag(String priceEntryRequiredFlag) {
		this.priceEntryRequiredFlag = priceEntryRequiredFlag;
	}

	public String getDiscountableFlag() {
		return discountableFlag;
	}

	public void setDiscountableFlag(String discountableFlag) {
		this.discountableFlag = discountableFlag;
	}

	public String getPromotionableFlag() {
		return promotionableFlag;
	}

	public void setPromotionableFlag(String promotionableFlag) {
		this.promotionableFlag = promotionableFlag;
	}

	public String getAuthorizedForSaleFlag() {
		return authorizedForSaleFlag;
	}

	public void setAuthorizedForSaleFlag(String authorizedForSaleFlag) {
		this.authorizedForSaleFlag = authorizedForSaleFlag;
	}

	public String getConsignationFlag() {
		return consignationFlag;
	}

	public void setConsignationFlag(String consignationFlag) {
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

}