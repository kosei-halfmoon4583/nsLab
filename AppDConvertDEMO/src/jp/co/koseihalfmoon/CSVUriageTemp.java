package jp.co.koseihalfmoon;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import jp.co.appd.beans.PaymentDetailsBeans;
import jp.co.appd.beans.UriageTempBeans;

/* opencsv(version 3.8) */
import com.opencsv.*;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.ColumnPositionMappingStrategy;

/*------------------------------------------------------------------------*
 * Copyright (c) 2016 xxxx, System Planning Office. 
 *   All rights reserved. This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	CSVUriageTemp
 * Contributors:	Naoshi WATANUKI - Initial API and implementation. -
 * Data Written :	2016.9.2 (Fri.)
 * Update Written: 	____.__.__
 *-------------------------------------------------------------------------*/

public class CSVUriageTemp {
	private String fileName;
	private List<PaymentDetailsBeans> pdBeans;
	
	public CSVUriageTemp(String fName) {
		this.fileName = fName;
	}

	public List<PaymentDetailsBeans> readers(){
		EditDescription ed = new EditDescription();
		GetDate gd = new GetDate();
		try {
			ColumnPositionMappingStrategy<PaymentDetailsBeans> strat = new ColumnPositionMappingStrategy<PaymentDetailsBeans>();
			strat.setType(PaymentDetailsBeans.class);
 			String[] columns = createCulumns();
	        strat.setColumnMapping(columns);
			CsvToBean<PaymentDetailsBeans> csv = new CsvToBean<PaymentDetailsBeans>();
			CSVReader csvr = new CSVReader(new FileReader(fileName),',','"',1); /* 先頭行（0行目）はヘッダーなので、次の行から読み込む */
			List<PaymentDetailsBeans> pdBeans = csv.parse(strat, csvr);
			
			UriageTempBeans utb = new UriageTempBeans();
			CSVWriter writer = new CSVWriter(new FileWriter("/Users/watanukitadashi/CSVUriageTemp.csv"), ',', CSVWriter.DEFAULT_QUOTE_CHARACTER, "\r\n");
			//CSVWriter writer = new CSVWriter(new FileWriter("/Users/watanukitadashi/output.csv")); /* フィールド区切り("")無しの場合のwriter定義 */

			String[] title = new String[]{
					"作成日", "作成時刻", "作成システム","ファイルID","会社コード","出荷伝票No.","出荷行番号","伝票日付","承認区分","計上区分","伝票区分","新伝票区分",
					"請求可否フラグ","請求明細除外区分","更新区分","元伝票番号","元伝票行番号","部門コード","加盟店","プロジェクトコード","商品コード","フロント商品コード",
					"ブランドコード","メディアコード","商品名","商品名（半角)","単価","出荷数","税グループコード","税入力区分","税抜き金額","税額","金額","通貨",
					"為替レート","外貨金額","摘要","請求書摘要（カナ）","請求書番号","請求書日付","請求区分","請求先","支払方法","支払条件","支払予定日","登録者名",
					"みなし着荷日","請求注文No.","行注文No.","売上仕入紐付No.","受領書回収フラグ","売上分類コード","卸値","卸率","仕入値","粗利益","粗利益率",
					"リベート額","基準仕入値","経理報告フラグ","運用JANコード","ジャンルコード","専伝No.","出荷日","物理倉庫コード","論理倉庫コード","転送ファイルID",
					"シーケンスNo.","ステータス","エラーメッセージ"
			};
			writer.writeNext(title);
			
			int i = 0; /* CSV変換処理カウンター */
			for (PaymentDetailsBeans bean : pdBeans) {
				utb.ug_createDate = gd.getCurrentDateString();
				utb.ug_createTime = gd.getCurrentTimeString();
				utb.ug_createSystem = "Cloudix";
				utb.ug_fileID = "IF0103004";
				utb.ug_companyCD = "SBCS";
				utb.ug_arrivalVoucher = bean.OrderItemID;
				utb.ug_arrivalVoucherLine = "ArrivalVouchaerLine";	/* (?) */
				utb.ug_transDate = bean.Date;						/* (?) Confirm Date Format*/
				utb.ug_approvalStatus = "2";
				utb.ug_recordingDivision = "1";
				utb.ug_slipType1 = "11 or 21";						/* (?) */
				utb.ug_slipType2 = "11 or 21";						/* (?) */
				utb.ug_invoiceEnable = "1";
				utb.ug_invoiceOmitLine = "0";
				utb.ug_actiontype = "PT";							/* (?) 会計上必要であれば"UP"*/
				utb.ug_originVoucher = "";
				utb.ug_originVoucherLine = "";
				utb.ug_deptCode = "";
				utb.ug_salesDestination = "加盟店コード";				/* (?) Payment Details に加盟店コードがセットされている */
				utb.ug_projectCode = "";
				utb.ug_productCD = "";
				utb.ug_frontProductCD = "";
				utb.ug_brandCD = "";
				utb.ug_mediaCD = "";
				utb.ug_dispProdName = bean.Application;
				utb.ug_prodName = "";
				utb.ug_salesPrice = bean.Total;						/* (?) */
				utb.ug_shippingQty = "";
				utb.ug_taxGroup = "A2";
				utb.ug_taxEntityFlg = "2";
				utb.ug_amountExcTax = bean.Total; 					/* (?) */
				utb.ug_amountTax = "0";
				utb.ug_amountPrice = bean.Total;					/* (?) */
				utb.ug_currenceCD = "JPY";
				utb.ug_exchangeRate = "";
				utb.ug_amountCurrency = "";
				utb.ug_description = ed.editDesc(bean.Description);
				utb.ug_invoiceDescription = "";
				utb.ug_invoiceID = bean.invoiceID;
				utb.ug_invoiceDate = "";
				utb.ug_paymentType = "";
				utb.ug_invoiceAccount = "";
				utb.ug_paymentMode = "";
				utb.ug_paymentCond = "";
				utb.ug_paymentDueDate = "";
				utb.ug_originSystem = "Cloudix";
				utb.ug_dmArrivalDate = "";
				utb.ug_customerOrderNo = "";
				utb.ug_customerOrderNoLine = "";
				utb.ug_salesPurchaseRelationNo = "";
				utb.ug_receiptRecoveryFlg = "";
				utb.ug_salesClassCD = "09";
				utb.ug_unitPrice = "";
				utb.ug_unitPriceRate = "";
				utb.ug_purchasePrice = "";
				utb.ug_grossProfit1 = "";
				utb.ug_grossProfit2 = "";
				utb.ug_amountRebate = "";
				utb.ug_standardPurchasePrice = "";
				utb.ug_financialReportFlg = "";
				utb.ug_operationJanCD = "";
				utb.ug_genreCD = "";
				utb.ug_voucharCD = "";
				utb.ug_shippingDate = bean.Date;			/* (?) */
				utb.ug_physicsWarehouse = "";
				utb.ug_logicalWarehouse = "";
				utb.ug_postFileID = "";
				utb.ug_sequeseNo = "";
				utb.ug_postStatus = "";
				utb.ug_errorMessage = "";
			
				String[] uriage 
					= new String[]{utb.ug_createDate, utb.ug_createTime, utb.ug_createSystem, utb.ug_fileID, utb.ug_companyCD, 
						utb.ug_arrivalVoucher, utb.ug_arrivalVoucherLine, utb.ug_transDate, utb.ug_approvalStatus, utb.ug_recordingDivision,
						utb.ug_slipType1, utb.ug_slipType2, utb.ug_invoiceEnable, utb.ug_invoiceOmitLine, utb.ug_actiontype,
						utb.ug_originVoucher, utb.ug_originVoucherLine, utb.ug_deptCode, utb.ug_salesDestination, utb.ug_projectCode,
						utb.ug_productCD, utb.ug_frontProductCD, utb.ug_brandCD, utb.ug_mediaCD, utb.ug_dispProdName, utb.ug_prodName,
						utb.ug_salesPrice, utb.ug_shippingQty, utb.ug_taxGroup, utb.ug_taxEntityFlg, utb.ug_amountExcTax, utb.ug_amountTax,
						utb.ug_amountPrice, utb.ug_currenceCD, utb.ug_exchangeRate, utb.ug_amountCurrency, utb.ug_description, utb.ug_invoiceDescription,
						utb.ug_invoiceID, utb.ug_invoiceDate, utb.ug_paymentType, utb.ug_invoiceAccount, utb.ug_paymentMode, utb.ug_paymentCond,
						utb.ug_paymentDueDate, utb.ug_originSystem, utb.ug_dmArrivalDate, utb.ug_customerOrderNo, utb.ug_customerOrderNoLine, 
						utb.ug_salesPurchaseRelationNo, utb.ug_receiptRecoveryFlg, utb.ug_salesClassCD, utb.ug_unitPrice, utb.ug_unitPriceRate,
						utb.ug_purchasePrice, utb.ug_grossProfit1, utb.ug_grossProfit2, utb.ug_amountRebate, utb.ug_standardPurchasePrice, utb.ug_financialReportFlg,
						utb.ug_operationJanCD, utb.ug_genreCD, utb.ug_voucharCD, utb.ug_shippingDate, utb.ug_physicsWarehouse, utb.ug_logicalWarehouse, utb.ug_postFileID,
						utb.ug_sequeseNo, utb.ug_postStatus, utb.ug_errorMessage};
				writer.writeNext(uriage);
				i++;
			}

			/* For Debug! */
			System.out.println("");
			System.out.println("For Debug CSVUriageTemp Java");
			System.out.println("For Debug 処理件数（売上一時データ）：" + i);
			System.out.println("");
			
			csvr.close();
			writer.close();
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return pdBeans;
	}

	public String[] createCulumns() {
        String[] columns = new String[] { 
        		"invoiceID","paymentID","transactionID","Date","FirstName","LastName","Email","Company","CompanyID",
        		"OrderItemID","Channel","Vendor","VendorID","PaymentMethod","Application","ApplicationID","Edition",
        		"EditionID","Description","LineType ","ApplicationOrigin","Currency","Total","AppDirectShare","AppDirectShareP",
        		"ChannelShare","ChannelShareP","VendorShare","VendorShareP","ResellerShare","ResellerShareP","PayoutStatus",
        		"PayoutID","Result","AuthCD","ResellerEmail","PayPeriodStart","PayPeriodEnd"		
        };
		return columns;
	}
}
