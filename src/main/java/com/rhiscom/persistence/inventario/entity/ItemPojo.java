package com.rhiscom.persistence.inventario.entity;

/**
 * Pojo for represent the Item entity of the data model.
 * 
 * @author Freddy Castro <freddy.castro@rhiscom.cl>
 * @since 07-02-2014
 * @version 1.0
 */
public class ItemPojo {

	// Attributes
	private String itemId = null;
	private String itemName = null;
	private String itemDescription = null;
	private String alternativeItemId1 = null;
	private String alternativeItemId2 = null;
	private String alternativeItemId3 = null;
	private String alternativeItemId4 = null;
	private Boolean priceEntryRequiredFlag = null;
	private Boolean discountableFlag = null;
	private Boolean promotionableFlag = null;
	private Boolean authorizedForSaleFlag = null;
	private Boolean consignationFlag = null;
	private String taxExemptCode = null;
	private String weightOrUnitCountCode = null;
	private String unitOfMeasureCode = null;
	
	/**
	 * Default constructor.
	 */
	public ItemPojo() {	}
	
	/**
	 * Constructor with not nullable value.
	 * @param itemId
	 */
	public ItemPojo(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemId
	 */
	public String getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	/**
	 * @return the itemDescription
	 */
	public String getItemDescription() {
		return itemDescription;
	}

	/**
	 * @param itemDescription the itemDescription to set
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	/**
	 * @return the alternativeItemId1
	 */
	public String getAlternativeItemId1() {
		return alternativeItemId1;
	}

	/**
	 * @param alternativeItemId1 the alternativeItemId1 to set
	 */
	public void setAlternativeItemId1(String alternativeItemId1) {
		this.alternativeItemId1 = alternativeItemId1;
	}

	/**
	 * @return the alternativeItemId2
	 */
	public String getAlternativeItemId2() {
		return alternativeItemId2;
	}

	/**
	 * @param alternativeItemId2 the alternativeItemId2 to set
	 */
	public void setAlternativeItemId2(String alternativeItemId2) {
		this.alternativeItemId2 = alternativeItemId2;
	}

	/**
	 * @return the alternativeItemId3
	 */
	public String getAlternativeItemId3() {
		return alternativeItemId3;
	}

	/**
	 * @param alternativeItemId3 the alternativeItemId3 to set
	 */
	public void setAlternativeItemId3(String alternativeItemId3) {
		this.alternativeItemId3 = alternativeItemId3;
	}

	/**
	 * @return the alternativeItemId4
	 */
	public String getAlternativeItemId4() {
		return alternativeItemId4;
	}

	/**
	 * @param alternativeItemId4 the alternativeItemId4 to set
	 */
	public void setAlternativeItemId4(String alternativeItemId4) {
		this.alternativeItemId4 = alternativeItemId4;
	}

	/**
	 * @return the priceEntryRequiredFlag
	 */
	public Boolean getPriceEntryRequiredFlag() {
		return priceEntryRequiredFlag;
	}

	/**
	 * @param priceEntryRequiredFlag the priceEntryRequiredFlag to set
	 */
	public void setPriceEntryRequiredFlag(Boolean priceEntryRequiredFlag) {
		this.priceEntryRequiredFlag = priceEntryRequiredFlag;
	}

	/**
	 * @return the discountableFlag
	 */
	public Boolean getDiscountableFlag() {
		return discountableFlag;
	}

	/**
	 * @param discountableFlag the discountableFlag to set
	 */
	public void setDiscountableFlag(Boolean discountableFlag) {
		this.discountableFlag = discountableFlag;
	}

	/**
	 * @return the promotionableFlag
	 */
	public Boolean getPromotionableFlag() {
		return promotionableFlag;
	}

	/**
	 * @param promotionableFlag the promotionableFlag to set
	 */
	public void setPromotionableFlag(Boolean promotionableFlag) {
		this.promotionableFlag = promotionableFlag;
	}

	/**
	 * @return the authorizedForSaleFlag
	 */
	public Boolean getAuthorizedForSaleFlag() {
		return authorizedForSaleFlag;
	}

	/**
	 * @param authorizedForSaleFlag the authorizedForSaleFlag to set
	 */
	public void setAuthorizedForSaleFlag(Boolean authorizedForSaleFlag) {
		this.authorizedForSaleFlag = authorizedForSaleFlag;
	}

	/**
	 * @return the consignationFlag
	 */
	public Boolean getConsignationFlag() {
		return consignationFlag;
	}

	/**
	 * @param consignationFlag the consignationFlag to set
	 */
	public void setConsignationFlag(Boolean consignationFlag) {
		this.consignationFlag = consignationFlag;
	}

	/**
	 * @return the taxExemptCode
	 */
	public String getTaxExemptCode() {
		return taxExemptCode;
	}

	/**
	 * @param taxExemptCode the taxExemptCode to set
	 */
	public void setTaxExemptCode(String taxExemptCode) {
		this.taxExemptCode = taxExemptCode;
	}

	/**
	 * @return the weightOrUnitCountCode
	 */
	public String getWeightOrUnitCountCode() {
		return weightOrUnitCountCode;
	}

	/**
	 * @param weightOrUnitCountCode the weightOrUnitCountCode to set
	 */
	public void setWeightOrUnitCountCode(String weightOrUnitCountCode) {
		this.weightOrUnitCountCode = weightOrUnitCountCode;
	}

	/**
	 * @return the unitOfMeasureCode
	 */
	public String getUnitOfMeasureCode() {
		return unitOfMeasureCode;
	}

	/**
	 * @param unitOfMeasureCode the unitOfMeasureCode to set
	 */
	public void setUnitOfMeasureCode(String unitOfMeasureCode) {
		this.unitOfMeasureCode = unitOfMeasureCode;
	}
	
}
