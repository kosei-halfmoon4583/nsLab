package jp.co.koseihalfmoon;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import jp.co.appd.beans.PaymentDetailsBeans;
import jp.co.appd.beans.StockTempBeans;


/* opencsv(version 3.8) */
import com.opencsv.*;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.ColumnPositionMappingStrategy;

/*------------------------------------------------------------------------*
 * Copyright (c) 2016 xxxx, System Planning Office. 
 *   All rights reserved. 
 *   This program and the accompanying materials
 *   are made available under the terms of the Eclipse Public License v1.x
 *   which accompanies this distribution, and is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * Program Name:	CSVSiireTemp
 * Contributors:	Naoshi WATANUKI - Initial API and implementation. -
 * Data Written :	2016.9.7 (Wed.)
 * Update Written: 	____.__.__
 *-------------------------------------------------------------------------*/

public class CSVSiireTemp {
	private String fileName;
	private List<PaymentDetailsBeans> pdBeans;
	
	public CSVSiireTemp(String fName) {
		this.fileName = fName;
	}

	public List<PaymentDetailsBeans> readers(){
		try {
			EditDescription ed = new EditDescription();
			GetDate gd = new GetDate();
			ColumnPositionMappingStrategy<PaymentDetailsBeans> strat = new ColumnPositionMappingStrategy<PaymentDetailsBeans>();
			strat.setType(PaymentDetailsBeans.class);
			String[] columns = createCulumns();
	        strat.setColumnMapping(columns);

			CsvToBean<PaymentDetailsBeans> csv = new CsvToBean<PaymentDetailsBeans>();
			CSVReader csvr = new CSVReader(new FileReader(fileName),',','"',1); /* 先頭行（0行目）はヘッダーなので、次の行から読み込む */
			List<PaymentDetailsBeans> pdBeans = csv.parse(strat, csvr);
			
			StockTempBeans stb = new StockTempBeans();
			CSVWriter writer = new CSVWriter(new FileWriter("/Users/watanukitadashi/CSVSiireTemp.csv"), ',', CSVWriter.DEFAULT_QUOTE_CHARACTER, "\r\n");
			//CSVWriter writer = new CSVWriter(new FileWriter("/Users/watanukitadashi/output.csv")); /* フィールド区切り("")無しの場合のwriter定義 */

			String[] title = new String[]{"作成日", "作成時刻", "作成システム","ファイルID","会社コード","入荷伝票No.","入荷行番号","伝票日付","承認区分","計上区分","伝票区分",
											"新伝票区分","支払可否フラグ","更新区分","元伝票番号","元伝票行番号","部門コード","仕入先ID","プロジェクトコード",
											"商品コード","フロント商品コード","ブランドコード","メディアコード","商品名","商品名（半角)","単価","入荷数","税グループコード",
											"税入力区分","税抜き金額","税額","金額","通貨","為替レート","外貨金額","摘要","請求書摘要（カナ）","請求書番号","請求書日付",
											"支払区分","支払先","支払方法","支払条件","支払予定日","登録者名","仕入値引き約定No.","C&S発注No.","C&S発注No.枝番","売上仕入紐付No.",
											"仕入先グループ","仕入先SEQ","メーカコード","専伝No.","入荷日","運用JANコード","ジャンルコード","経理報告フラグ","入出金区分","約定区分",
											"仕入値","仕入率","物理倉庫コード","論理倉庫コード","転送ファイルID","シーケンスNo.","ステータス","エラーメッセージ"};
			writer.writeNext(title);
			
			int i = 0; /* CSV変換処理カウンター: i */
			for (PaymentDetailsBeans bean : pdBeans) {
				stb.st_createDate = gd.getCurrentDateString();
				stb.st_createTime = gd.getCurrentTimeString();
				stb.st_createSystem = "Cloudix";
				stb.st_fileID = "IF0103004";
				stb.st_companyCD = "SBCS";
				stb.st_arrivalVoucher = bean.OrderItemID;
				stb.st_arrivalVoucherLine = "ArrivalVouchaerLine";	/* (?) */
				stb.st_transDate = bean.Date;						/* (?) */
				stb.st_approvalStatus = "2";
				stb.st_recordingDivision = "1";
				stb.st_slipType1 = "11 or 21";						/* (?) */
				stb.st_slipType2 = "11 or 21";						/* (?) */
				stb.st_paymentEnable = "1";							/* (?) */
				stb.st_actionType = "PT";							/* (?) 会計上必要であれば"UP"*/
				stb.st_originVoucher = "";
				stb.st_originVoucherLine = "";
				stb.st_deptCode = "";
				stb.st_supplier = "仕入れ先コード";					/* (?) */
				stb.st_projectCD = "";
				stb.st_productCD = "";
				stb.st_frontProductCD = "";
				stb.st_brandCD = "";
				stb.st_mediaCD = "";
				stb.st_dispProdName = bean.Application;
				stb.st_prodName = "";
				stb.st_salesPrice = bean.Total;						/* (?) */
				stb.st_arrivalQty = "";
				stb.st_taxGroup = "A2";
				stb.st_taxEntityFlg = "2";
				stb.st_amountExcTax = bean.Total; 					/* (?) */
				stb.st_amountTax = "0";
				stb.st_amountPrice = bean.Total;					/* (?) */
				stb.st_currenceCD = "JPY";
				stb.st_exchangeRate = "";
				stb.st_amountCurrency = "";
				stb.st_Description = ed.editDesc(bean.Description);
				stb.st_invoiceDescription = "";
				stb.st_invoiceID = bean.invoiceID;					
				stb.st_invoiceDate = "";
				stb.st_paymentType = "";
				stb.st_paymentAccount = "";
				stb.st_paymentMode = "";
				stb.st_paymentCond = "";
				stb.st_paymentDueDate = "";
				stb.st_originSystem = "Cloudix";
				stb.st_ContractLNo = "";
				stb.st_CsOrderNo = "";
				stb.st_CsOrderLineNo = "";
				stb.st_salesPurchaseRelationNo = "";
				stb.st_vendorGroup = "";
				stb.st_VendorSEQ = "09";
				stb.st_manufactureCD = "";
				stb.st_voucherCD = "";
				stb.st_arrivalDate = "";
				stb.st_operationJanCD = "";
				stb.st_genreCD = "";
				stb.st_financialReportFlg = "";
				stb.st_DepoWithdraw = "";
				stb.st_contracttype = "";
				stb.st_purchasePrice = "";
				stb.st_PurchaseRate = "";
				stb.st_physicsWarehouse = "";
				stb.st_logicalWarehouse = "";
				stb.st_postFileID = "";
				stb.st_sequeseNo = "";
				stb.st_postStatus = "";
				stb.st_errorMessage = "";
			
				String[] siire 
					= new String[]{stb.st_createDate, stb.st_createTime, stb.st_createSystem, stb.st_fileID, stb.st_companyCD, 
						stb.st_arrivalVoucher, stb.st_arrivalVoucherLine, stb.st_transDate, stb.st_approvalStatus, stb.st_recordingDivision,
						stb.st_slipType1, stb.st_slipType2, stb.st_paymentEnable, stb.st_actionType,
						stb.st_originVoucher, stb.st_originVoucherLine, stb.st_deptCode, stb.st_supplier, stb.st_projectCD,
						stb.st_productCD, stb.st_frontProductCD, stb.st_brandCD, stb.st_mediaCD, stb.st_dispProdName, stb.st_prodName,
						stb.st_salesPrice, stb.st_arrivalQty, stb.st_taxGroup, stb.st_taxEntityFlg, stb.st_amountExcTax, stb.st_amountTax,
						stb.st_amountPrice, stb.st_currenceCD, stb.st_exchangeRate, stb.st_amountCurrency, stb.st_Description, stb.st_invoiceDescription,
						stb.st_invoiceID, stb.st_invoiceDate, stb.st_paymentType, stb.st_paymentAccount, stb.st_paymentMode, stb.st_paymentCond,
						stb.st_paymentDueDate, stb.st_originSystem, stb.st_ContractLNo, stb.st_CsOrderNo, stb.st_CsOrderLineNo, 
						stb.st_salesPurchaseRelationNo, stb.st_vendorGroup, stb.st_VendorSEQ, stb.st_manufactureCD, stb.st_voucherCD,
						stb.st_arrivalDate, stb.st_operationJanCD, stb.st_genreCD, stb.st_financialReportFlg, stb.st_DepoWithdraw, stb.st_contracttype,
						stb.st_purchasePrice, stb.st_PurchaseRate, stb.st_physicsWarehouse, stb.st_logicalWarehouse, stb.st_postFileID,
						stb.st_sequeseNo, stb.st_postStatus, stb.st_errorMessage};
				writer.writeNext(siire);
				i++;
			}

			/* For Debug! */
			System.out.println("");
			System.out.println("For Debug CSVSiireTemp Java");
			System.out.println("For Debug 処理件数（仕入れ一時データ)：" + i);
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
