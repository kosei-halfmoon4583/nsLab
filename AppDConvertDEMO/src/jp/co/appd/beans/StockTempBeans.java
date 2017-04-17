package jp.co.appd.beans;

/*------------------------------------------------------------------------*
 * Copyright (c) 2016 xxxx, System Planning Office. 
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	StockTempBeans [仕入れ一時テーブル（CSV）]
 * Contributors:	Naoshi WATANUKI - initial API and implementation
 * Data Written :	2016.9.1 (Tue.)
 * Update Written: 	____.__.__
 *-------------------------------------------------------------------------*/

public class StockTempBeans {
	/** Create Date */
	public String st_createDate;
	/** Create Time */
	public String st_createTime;
	/** Create System */
	public String st_createSystem;
	/** File ID */
	public String st_fileID;
	/** Company Code */
	public String st_companyCD;
	/** Arrival Voucher */
	public String st_arrivalVoucher;
	/** Arrival Voucher Line */
	public String st_arrivalVoucherLine;
	/** Trans Date */
	public String st_transDate;
	/** Approval Status */
	public String st_approvalStatus;
	/** Recording Division */
	public String st_recordingDivision;
	/** Slip Type 1 */
	public String st_slipType1;
	/** Slip Type 2 */
	public String st_slipType2;
	/** Invoice Enable */
	public String st_paymentEnable;
	/** Action Type */
	public String st_actionType;
	/** Original Voucher */
	public String st_originVoucher;
	/** Original Voucher Line*/
	public String st_originVoucherLine;
	/** Department Code */
	public String st_deptCode;
	/** Supplier */
	public String st_supplier;
	/** Project Code */
	public String st_projectCD;
	/** Product Code */
	public String st_productCD;
	/** Front Product Code */
	public String st_frontProductCD;
	/** Brand Code */
	public String st_brandCD;
	/** Media Code */
	public String st_mediaCD;
	/** Product Name (Multi Bytes) */
	public String st_dispProdName;
	/** Product Name (Single Byte) */
	public String st_prodName;
	/** Sales Price */
	public String st_salesPrice;
	/** Arrival Quntity */
	public String st_arrivalQty;
	/** Tax Group */
	public String st_taxGroup;
	/** Tax Entity Flag */
	public String st_taxEntityFlg;
	/** Amount Exc Tax */
	public String st_amountExcTax;
	/** Amount Tax */
	public String st_amountTax;
	/** Amount Price */
	public String st_amountPrice;
	/** Currency Code */
	public String st_currenceCD;
	/** Exchange Rate */
	public String st_exchangeRate;
	/** Amount Currency */
	public String st_amountCurrency;
	/** Description */
	public String st_Description;
	/** Invoice Description */
	public String st_invoiceDescription;
	/** Invoice ID */
	public String st_invoiceID;
	/** Invoice Date */
	public String st_invoiceDate;
	/** Payment Type */
	public String st_paymentType;
	/** Payment Account */
	public String st_paymentAccount;
	/** Payment Mode */
	public String st_paymentMode;
	/** Payment Condition */
	public String st_paymentCond;
	/** Payment Due Date */
	public String st_paymentDueDate;
	/** SBCS Original System */
	public String st_originSystem;
	/** 仕入値引き約定No. */
	public String st_ContractLNo;
	/** SBC&S Order No. */
	public String st_CsOrderNo;
	/** SBC&S Order Line No. */
	public String st_CsOrderLineNo;
	/** Sales Purchase Relation No. */
	public String st_salesPurchaseRelationNo;
	/** Vendor Group */
	public String st_vendorGroup;
	/** Vendor SEQ */
	public String st_VendorSEQ;
	/** Manufacture Code */
	public String st_manufactureCD;
	/** Voucher Code */
	public String st_voucherCD;
	/** Arrival Date */
	public String st_arrivalDate;
	/** Operation JAN Code */
	public String st_operationJanCD;
	/** Genre Code */
	public String st_genreCD;
	/** Financial Report Flag */
	public String st_financialReportFlg;		
	/** Deposit Withdraws*/
	public String st_DepoWithdraw;
	/** Contract Type */
	public String st_contracttype;
	/** Purchase Price */
	public String st_purchasePrice;
	/** Purchase Rate */
	public String st_PurchaseRate;
	/** Physics Warehouse */
	public String st_physicsWarehouse;
	/** Logical Warehouse */
	public String st_logicalWarehouse;
	/** Post file ID */
	public String st_postFileID;
	/** Post Sequecial No. */
	public String st_sequeseNo;
	/** Post Status */
	public String st_postStatus;
	/** Error Message */
	public String st_errorMessage;
	
	public StockTempBeans() {
		this.st_createDate = "";
		this.st_createTime = "";
		this.st_createSystem = "";
		this.st_fileID = "";
		this.st_companyCD = "";
		this.st_arrivalVoucher = "";
		this.st_arrivalVoucherLine = "";
		this.st_transDate = "";
		this.st_approvalStatus = "";
		this.st_recordingDivision = "";
		this.st_slipType1 = "";
		this.st_slipType2 = "";
		this.st_paymentEnable = "";
		this.st_actionType = "";
		this.st_originVoucher = "";
		this.st_originVoucherLine = "";
		this.st_deptCode = "";
		this.st_supplier = "";
		this.st_projectCD = "";
		this.st_productCD = "";
		this.st_frontProductCD = "";
		this.st_brandCD = "";
		this.st_mediaCD = "";
		this.st_dispProdName = "";
		this.st_prodName = "";
		this.st_salesPrice = "";
		this.st_arrivalQty = "";
		this.st_taxGroup = "";
		this.st_taxEntityFlg = "";
		this.st_amountExcTax = "";
		this.st_amountTax = "";
		this.st_amountPrice = "";
		this.st_currenceCD = "";
		this.st_exchangeRate = "";
		this.st_amountCurrency = "";
		this.st_Description = "";
		this.st_invoiceDescription = "";
		this.st_invoiceID = "";
		this.st_invoiceDate = "";
		this.st_paymentType = "";
		this.st_paymentAccount = "";
		this.st_paymentMode = "";
		this.st_paymentCond = "";
		this.st_paymentDueDate = "";
		this.st_originSystem = "";
		this.st_ContractLNo = "";
		this.st_CsOrderNo = "";
		this.st_CsOrderLineNo = "";
		this.st_salesPurchaseRelationNo = "";
		this.st_vendorGroup = "";
		this.st_VendorSEQ = "";
		this.st_manufactureCD = "";
		this.st_voucherCD = "";
		this.st_arrivalDate = "";
		this.st_operationJanCD = "";
		this.st_genreCD = "";
		this.st_financialReportFlg = "";		
		this.st_DepoWithdraw = "";
		this.st_contracttype = "";
		this.st_purchasePrice = "";
		this.st_PurchaseRate = "";
		this.st_physicsWarehouse = "";
		this.st_logicalWarehouse = "";
		this.st_postFileID = "";
		this.st_sequeseNo = "";
		this.st_postStatus = "";
		this.st_errorMessage = "";		
	}

	public String getSt_createDate() {
		return st_createDate;
	}

	public String getSt_createTime() {
		return st_createTime;
	}

	public String getSt_createSystem() {
		return st_createSystem;
	}

	public String getSt_fileID() {
		return st_fileID;
	}

	public String getSt_companyCD() {
		return st_companyCD;
	}

	public String getSt_arrivalVoucher() {
		return st_arrivalVoucher;
	}

	public String getSt_arrivalVoucherLine() {
		return st_arrivalVoucherLine;
	}

	public String getSt_transDate() {
		return st_transDate;
	}

	public String getSt_approvalStatus() {
		return st_approvalStatus;
	}

	public String getSt_recordingDivision() {
		return st_recordingDivision;
	}

	public String getSt_slipType1() {
		return st_slipType1;
	}

	public String getSt_slipType2() {
		return st_slipType2;
	}

	public String getSt_paymentEnable() {
		return st_paymentEnable;
	}

	public String getSt_actionType() {
		return st_actionType;
	}

	public String getSt_originVoucher() {
		return st_originVoucher;
	}

	public String getSt_originVoucherLine() {
		return st_originVoucherLine;
	}

	public String getSt_deptCode() {
		return st_deptCode;
	}

	public String getSt_supplier() {
		return st_supplier;
	}

	public String getSt_projectCD() {
		return st_projectCD;
	}

	public String getSt_productCD() {
		return st_productCD;
	}

	public String getSt_frontProductCD() {
		return st_frontProductCD;
	}

	public String getSt_brandCD() {
		return st_brandCD;
	}

	public String getSt_mediaCD() {
		return st_mediaCD;
	}

	public String getSt_dispProdName() {
		return st_dispProdName;
	}

	public String getSt_prodName() {
		return st_prodName;
	}

	public String getSt_salesPrice() {
		return st_salesPrice;
	}

	public String getSt_arrivalQty() {
		return st_arrivalQty;
	}

	public String getSt_taxGroup() {
		return st_taxGroup;
	}

	public String getSt_taxEntityFlg() {
		return st_taxEntityFlg;
	}

	public String getSt_amountExcTax() {
		return st_amountExcTax;
	}

	public String getSt_amountTax() {
		return st_amountTax;
	}

	public String getSt_amountPrice() {
		return st_amountPrice;
	}

	public String getSt_currenceCD() {
		return st_currenceCD;
	}

	public String getSt_exchangeRate() {
		return st_exchangeRate;
	}

	public String getSt_amountCurrency() {
		return st_amountCurrency;
	}

	public String getSt_Description() {
		return st_Description;
	}

	public String getSt_invoiceDescription() {
		return st_invoiceDescription;
	}

	public String getSt_invoiceID() {
		return st_invoiceID;
	}

	public String getSt_invoiceDate() {
		return st_invoiceDate;
	}

	public String getSt_paymentType() {
		return st_paymentType;
	}

	public String getSt_paymentAccount() {
		return st_paymentAccount;
	}

	public String getSt_paymentMode() {
		return st_paymentMode;
	}

	public String getSt_paymentCond() {
		return st_paymentCond;
	}

	public String getSt_paymentDueDate() {
		return st_paymentDueDate;
	}

	public String getSt_originSystem() {
		return st_originSystem;
	}

	public String getSt_ContractLNo() {
		return st_ContractLNo;
	}

	public String getSt_CsOrderNo() {
		return st_CsOrderNo;
	}

	public String getSt_CsOrderLineNo() {
		return st_CsOrderLineNo;
	}

	public String getSt_salesPurchaseRelationNo() {
		return st_salesPurchaseRelationNo;
	}

	public String getSt_vendorGroup() {
		return st_vendorGroup;
	}

	public String getSt_VendorSEQ() {
		return st_VendorSEQ;
	}

	public String getSt_manufactureCD() {
		return st_manufactureCD;
	}

	public String getSt_voucherCD() {
		return st_voucherCD;
	}

	public String getSt_arrivalCD() {
		return st_arrivalDate;
	}

	public String getSt_operationJanCD() {
		return st_operationJanCD;
	}

	public String getSt_genreCD() {
		return st_genreCD;
	}

	public String getSt_financialReportFlg() {
		return st_financialReportFlg;
	}

	public String getSt_DepoWithdraw() {
		return st_DepoWithdraw;
	}

	public String getSt_contracttype() {
		return st_contracttype;
	}

	public String getSt_purchasePrice() {
		return st_purchasePrice;
	}

	public String getSt_PurchaseRate() {
		return st_PurchaseRate;
	}

	public String getSt_physicsWarehouse() {
		return st_physicsWarehouse;
	}

	public String getSt_logicalWarehouse() {
		return st_logicalWarehouse;
	}

	public String getSt_postFileID() {
		return st_postFileID;
	}

	public String getSt_sequeseNo() {
		return st_sequeseNo;
	}

	public String getSt_postStatus() {
		return st_postStatus;
	}

	public String getSt_errorMessage() {
		return st_errorMessage;
	}

	public void setSt_createDate(String st_createDate) {
		this.st_createDate = st_createDate;
	}

	public void setSt_createTime(String st_createTime) {
		this.st_createTime = st_createTime;
	}

	public void setSt_createSystem(String st_createSystem) {
		this.st_createSystem = st_createSystem;
	}

	public void setSt_fileID(String st_fileID) {
		this.st_fileID = st_fileID;
	}

	public void setSt_companyCD(String st_companyCD) {
		this.st_companyCD = st_companyCD;
	}

	public void setSt_arrivalVoucher(String st_arrivalVoucher) {
		this.st_arrivalVoucher = st_arrivalVoucher;
	}

	public void setSt_arrivalVoucherLine(String st_arrivalVoucherLine) {
		this.st_arrivalVoucherLine = st_arrivalVoucherLine;
	}

	public void setSt_transDate(String st_transDate) {
		this.st_transDate = st_transDate;
	}

	public void setSt_approvalStatus(String st_approvalStatus) {
		this.st_approvalStatus = st_approvalStatus;
	}

	public void setSt_recordingDivision(String st_recordingDivision) {
		this.st_recordingDivision = st_recordingDivision;
	}

	public void setSt_slipType1(String st_slipType1) {
		this.st_slipType1 = st_slipType1;
	}

	public void setSt_slipType2(String st_slipType2) {
		this.st_slipType2 = st_slipType2;
	}

	public void setSt_paymentEnable(String st_paymentEnable) {
		this.st_paymentEnable = st_paymentEnable;
	}

	public void setSt_actionType(String st_actionType) {
		this.st_actionType = st_actionType;
	}

	public void setSt_originVoucher(String st_originVoucher) {
		this.st_originVoucher = st_originVoucher;
	}

	public void setSt_originVoucherLine(String st_originVoucherLine) {
		this.st_originVoucherLine = st_originVoucherLine;
	}

	public void setSt_deptCode(String st_deptCode) {
		this.st_deptCode = st_deptCode;
	}

	public void setSt_supplier(String st_supplier) {
		this.st_supplier = st_supplier;
	}

	public void setSt_projectCD(String st_projectCD) {
		this.st_projectCD = st_projectCD;
	}

	public void setSt_productCD(String st_productCD) {
		this.st_productCD = st_productCD;
	}

	public void setSt_frontProductCD(String st_frontProductCD) {
		this.st_frontProductCD = st_frontProductCD;
	}

	public void setSt_brandCD(String st_brandCD) {
		this.st_brandCD = st_brandCD;
	}

	public void setSt_mediaCD(String st_mediaCD) {
		this.st_mediaCD = st_mediaCD;
	}

	public void setSt_dispProdName(String st_dispProdName) {
		this.st_dispProdName = st_dispProdName;
	}

	public void setSt_prodName(String st_prodName) {
		this.st_prodName = st_prodName;
	}

	public void setSt_salesPrice(String st_salesPrice) {
		this.st_salesPrice = st_salesPrice;
	}

	public void setSt_arrivalQty(String st_arrivalQty) {
		this.st_arrivalQty = st_arrivalQty;
	}

	public void setSt_taxGroup(String st_taxGroup) {
		this.st_taxGroup = st_taxGroup;
	}

	public void setSt_taxEntityFlg(String st_taxEntityFlg) {
		this.st_taxEntityFlg = st_taxEntityFlg;
	}

	public void setSt_amountExcTax(String st_amountExcTax) {
		this.st_amountExcTax = st_amountExcTax;
	}

	public void setSt_amountTax(String st_amountTax) {
		this.st_amountTax = st_amountTax;
	}

	public void setSt_amountPrice(String st_amountPrice) {
		this.st_amountPrice = st_amountPrice;
	}

	public void setSt_currenceCD(String st_currenceCD) {
		this.st_currenceCD = st_currenceCD;
	}

	public void setSt_exchangeRate(String st_exchangeRate) {
		this.st_exchangeRate = st_exchangeRate;
	}

	public void setSt_amountCurrency(String st_amountCurrency) {
		this.st_amountCurrency = st_amountCurrency;
	}

	public void setSt_Description(String st_Description) {
		this.st_Description = st_Description;
	}

	public void setSt_invoiceDescription(String st_invoiceDescription) {
		this.st_invoiceDescription = st_invoiceDescription;
	}

	public void setSt_invoiceID(String st_invoiceID) {
		this.st_invoiceID = st_invoiceID;
	}

	public void setSt_invoiceDate(String st_invoiceDate) {
		this.st_invoiceDate = st_invoiceDate;
	}

	public void setSt_paymentType(String st_paymentType) {
		this.st_paymentType = st_paymentType;
	}

	public void setSt_paymentAccount(String st_paymentAccount) {
		this.st_paymentAccount = st_paymentAccount;
	}

	public void setSt_paymentMode(String st_paymentMode) {
		this.st_paymentMode = st_paymentMode;
	}

	public void setSt_paymentCond(String st_paymentCond) {
		this.st_paymentCond = st_paymentCond;
	}

	public void setSt_paymentDueDate(String st_paymentDueDate) {
		this.st_paymentDueDate = st_paymentDueDate;
	}

	public void setSt_originSystem(String st_originSystem) {
		this.st_originSystem = st_originSystem;
	}

	public void setSt_ContractLNo(String st_ContractLNo) {
		this.st_ContractLNo = st_ContractLNo;
	}

	public void setSt_CsOrderNo(String st_CsOrderNo) {
		this.st_CsOrderNo = st_CsOrderNo;
	}

	public void setSt_CsOrderLineNo(String st_CsOrderLineNo) {
		this.st_CsOrderLineNo = st_CsOrderLineNo;
	}

	public void setSt_salesPurchaseRelationNo(String st_salesPurchaseRelationNo) {
		this.st_salesPurchaseRelationNo = st_salesPurchaseRelationNo;
	}

	public void setSt_vendorGroup(String st_vendorGroup) {
		this.st_vendorGroup = st_vendorGroup;
	}

	public void setSt_VendorSEQ(String st_VendorSEQ) {
		this.st_VendorSEQ = st_VendorSEQ;
	}

	public void setSt_manufactureCD(String st_manufactureCD) {
		this.st_manufactureCD = st_manufactureCD;
	}

	public void setSt_voucherCD(String st_voucherCD) {
		this.st_voucherCD = st_voucherCD;
	}

	public void setSt_arrivalCD(String st_arrivalCD) {
		this.st_arrivalDate = st_arrivalCD;
	}

	public void setSt_operationJanCD(String st_operationJanCD) {
		this.st_operationJanCD = st_operationJanCD;
	}

	public void setSt_genreCD(String st_genreCD) {
		this.st_genreCD = st_genreCD;
	}

	public void setSt_financialReportFlg(String st_financialReportFlg) {
		this.st_financialReportFlg = st_financialReportFlg;
	}

	public void setSt_DepoWithdraw(String st_DepoWithdraw) {
		this.st_DepoWithdraw = st_DepoWithdraw;
	}

	public void setSt_contracttype(String st_contracttype) {
		this.st_contracttype = st_contracttype;
	}

	public void setSt_purchasePrice(String st_purchasePrice) {
		this.st_purchasePrice = st_purchasePrice;
	}

	public void setSt_PurchaseRate(String st_PurchaseRate) {
		this.st_PurchaseRate = st_PurchaseRate;
	}

	public void setSt_physicsWarehouse(String st_physicsWarehouse) {
		this.st_physicsWarehouse = st_physicsWarehouse;
	}

	public void setSt_logicalWarehouse(String st_logicalWarehouse) {
		this.st_logicalWarehouse = st_logicalWarehouse;
	}

	public void setSt_postFileID(String st_postFileID) {
		this.st_postFileID = st_postFileID;
	}

	public void setSt_sequeseNo(String st_sequeseNo) {
		this.st_sequeseNo = st_sequeseNo;
	}

	public void setSt_postStatus(String st_postStatus) {
		this.st_postStatus = st_postStatus;
	}

	public void setSt_errorMessage(String st_errorMessage) {
		this.st_errorMessage = st_errorMessage;
	}
}
