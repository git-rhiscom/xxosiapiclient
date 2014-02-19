package com.rhiscom.persistence.inventario.entity.xxosi;

import com.rhiscom.persistence.inventario.entity.Producto;

public class ProductoXXOSI extends Producto implements java.io.Serializable {

	/**
	 * 
	 */

	private char estado;

	public ProductoXXOSI() {

	}

	public ProductoXXOSI(String itemId, String itemName,
			String itemDescription, String alternativeItemId1,
			String alternativeItemId2, String alternativeItemId3,
			String alternativeItemId4, String priceEntryRequiredFlag,
			String discountableFlag, String promotionableFlag,
			String authorizedForSaleFlag, String consignationFlag,
			String taxExemptCode, String weightOrUnitCountCode,
			String unitOfMeasureCode, char estado) {

		super(itemId, itemName, itemDescription, alternativeItemId1,
				alternativeItemId2, alternativeItemId3, alternativeItemId4,
				priceEntryRequiredFlag, discountableFlag, promotionableFlag,
				authorizedForSaleFlag, consignationFlag, taxExemptCode,
				weightOrUnitCountCode, unitOfMeasureCode);

		this.estado = estado;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

}
