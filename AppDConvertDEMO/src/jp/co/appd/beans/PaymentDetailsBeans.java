package jp.co.appd.beans;

/*------------------------------------------------------------------------*
 * Copyright (c) 2016 xxxx , System Planning Office. 
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	PaymentDetailsBeans [ Payment Detaols テーブル（CSV）]
 * Contributors:	Naoshi WATANUKI - Initial API and implementation. -
 * Data Written :	2016.9.1 (Tue.)
 * Update Written: 	____.__.__
 * [AppDirect Payment Detail CSV]
 *-------------------------------------------------------------------------*/

public class PaymentDetailsBeans {
	/** Invoice ID */
	public String invoiceID;
	/** Payment ID */
	public String paymentID;
	/** Transaction ID */
	public String transactionID;
	/** Date */
	public String Date;
	/** First Name */
	public String FirstName;
	/** Last Name */
	public String LastName;
	/** Email */
	public String Email;
	/** Company */
	public String Company;
	/** Company ID */
	public String CompanyID;
	/** Order Item ID */
	public String OrderItemID;
	/** Channel */
	public String Channel;
	/** Vendor */
	public String Vendor;
	/** Vendor ID */
	public String VendorID;
	/** Payment Method */
	public String PaymentMethod;
	/** Application */
	public String Application;
	/** Application ID */
	public String ApplicationID;
	/** Edition */
	public String Edition;
	/** Edition ID */
	public String EditionID;
	/** Description */
	public String Description;
	/** Line Type */
	public String LineType;
	/** Application Origin */
	public String ApplicationOrigin;
	/** Currency */
	public String Currency;
	/** Total */
	public String Total;
	/** AppDirect Share */
	public String AppDirectShare;
	/** AppDirect % Share */
	public String AppDirectShareP;
	/** Channel Share */
	public String ChannelShare;
	/** Channel % Share */
	public String ChannelShareP;
	/** Vendor Share */
	public String VendorShare;
	/** Vendor % Share */
	public String VendorShareP;
	/** Reseller Share */
	public String ResellerShare;
	/** Reseller % Share */
	public String ResellerShareP;
	/** Payout Status */
	public String PayoutStatus;
	/** Payout ID */
	public String PayoutID;
	/** Result */
	public String Result;
	/** Auth Code */
	public String AuthCD;
	/** Reseller Email */
	public String ResellerEmail;
	/** Pay Period Start */
	public String PayPeriodStart;
	/** Pay Period End */
	public String PayPeriodEnd;
	
	public PaymentDetailsBeans() {
		this.invoiceID = "";
		this.paymentID = "";
		this.transactionID = "";
		this.Date = "";
		this.FirstName = "";
		this.LastName = "";
		this.Email = "";
		this.Company = "";
		this.CompanyID = "";
		this.OrderItemID = "";
		this.Channel = "";
		this.Vendor = "";
		this.VendorID = "";
		this.PaymentMethod = "";
		this.Application = "";
		this.ApplicationID = "";
		this.Edition = "";
		this.EditionID = "";
		this.Description = "";
		this.LineType = "";
		this.ApplicationOrigin = "";
		this.Currency = "";
		this.Total = "";
		this.AppDirectShare = "";
		this.AppDirectShareP = "";
		this.ChannelShare = "";
		this.ChannelShareP = "";
		this.VendorShare = "";
		this.VendorShareP = "";
		this.ResellerShare = "";
		this.ResellerShareP = "";
		this.PayoutStatus = "";
		this.PayoutID = "";
		this.Result = "";
		this.AuthCD = "";
		this.ResellerEmail = "";
		this.PayPeriodStart = "";
		this.PayPeriodEnd = "";		
	}

	public String getInvoiceID() {
		return invoiceID;
	}

	public String getPaymentID() {
		return paymentID;
	}

	public String getTransactionID() {
		return transactionID;
	}

	public String getDate() {
		return Date;
	}

	public String getFirstName() {
		return FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public String getEmail() {
		return Email;
	}

	public String getCompany() {
		return Company;
	}

	public String getCompanyID() {
		return CompanyID;
	}

	public String getOrderItemID() {
		return OrderItemID;
	}

	public String getChannel() {
		return Channel;
	}

	public String getVendor() {
		return Vendor;
	}

	public String getVendorID() {
		return VendorID;
	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public String getApplication() {
		return Application;
	}

	public String getApplicationID() {
		return ApplicationID;
	}

	public String getEdition() {
		return Edition;
	}

	public String getEditionID() {
		return EditionID;
	}

	public String getDescription() {
		return Description;
	}

	public String getLineType() {
		return LineType;
	}

	public String getApplicationOrigin() {
		return ApplicationOrigin;
	}

	public String getCurrency() {
		return Currency;
	}

	public String getTotal() {
		return Total;
	}

	public String getAppDirectShare() {
		return AppDirectShare;
	}

	public String getAppDirectShareP() {
		return AppDirectShareP;
	}

	public String getChannelShare() {
		return ChannelShare;
	}

	public String getChannelShareP() {
		return ChannelShareP;
	}

	public String getVendorShare() {
		return VendorShare;
	}

	public String getVendorShareP() {
		return VendorShareP;
	}

	public String getResellerShare() {
		return ResellerShare;
	}

	public String getResellerShareP() {
		return ResellerShareP;
	}

	public String getPayoutStatus() {
		return PayoutStatus;
	}

	public String getPayoutID() {
		return PayoutID;
	}

	public String getResult() {
		return Result;
	}

	public String getAuthCD() {
		return AuthCD;
	}

	public String getResellerEmail() {
		return ResellerEmail;
	}

	public String getPayPeriodStart() {
		return PayPeriodStart;
	}

	public String getPayPeriodEnd() {
		return PayPeriodEnd;
	}

	public void setInvoiceID(String invoiceID) {
		this.invoiceID = invoiceID;
	}

	public void setPaymentID(String paymentID) {
		this.paymentID = paymentID;
	}

	public void setTransactionID(String transactionID) {
		this.transactionID = transactionID;
	}

	public void setDate(String date) {
		Date = date;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setCompany(String company) {
		Company = company;
	}

	public void setCompanyID(String companyID) {
		CompanyID = companyID;
	}

	public void setOrderItemID(String orderItemID) {
		OrderItemID = orderItemID;
	}

	public void setChannel(String channel) {
		Channel = channel;
	}

	public void setVendor(String vendor) {
		Vendor = vendor;
	}

	public void setVendorID(String vendorID) {
		VendorID = vendorID;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public void setApplication(String application) {
		Application = application;
	}

	public void setApplicationID(String applicationID) {
		ApplicationID = applicationID;
	}

	public void setEdition(String edition) {
		Edition = edition;
	}

	public void setEditionID(String editionID) {
		EditionID = editionID;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public void setLineType(String lineType) {
		LineType = lineType;
	}

	public void setApplicationOrigin(String applicationOrigin) {
		ApplicationOrigin = applicationOrigin;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public void setTotal(String total) {
		Total = total;
	}

	public void setAppDirectShare(String appDirectShare) {
		AppDirectShare = appDirectShare;
	}

	public void setAppDirectShareP(String appDirectShareP) {
		AppDirectShareP = appDirectShareP;
	}

	public void setChannelShare(String channelShare) {
		ChannelShare = channelShare;
	}

	public void setChannelShareP(String channelShareP) {
		ChannelShareP = channelShareP;
	}

	public void setVendorShare(String vendorShare) {
		VendorShare = vendorShare;
	}

	public void setVendorShareP(String vendorShareP) {
		VendorShareP = vendorShareP;
	}

	public void setResellerShare(String resellerShare) {
		ResellerShare = resellerShare;
	}

	public void setResellerShareP(String resellerShareP) {
		ResellerShareP = resellerShareP;
	}

	public void setPayoutStatus(String payoutStatus) {
		PayoutStatus = payoutStatus;
	}

	public void setPayoutID(String payoutID) {
		PayoutID = payoutID;
	}

	public void setResult(String result) {
		Result = result;
	}

	public void setAuthCD(String authCD) {
		AuthCD = authCD;
	}

	public void setResellerEmail(String resellerEmail) {
		ResellerEmail = resellerEmail;
	}

	public void setPayPeriodStart(String payPeriodStart) {
		PayPeriodStart = payPeriodStart;
	}

	public void setPayPeriodEnd(String payPeriodEnd) {
		PayPeriodEnd = payPeriodEnd;
	}
}
