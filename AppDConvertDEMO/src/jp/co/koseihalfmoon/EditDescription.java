package jp.co.koseihalfmoon;

public class EditDescription {
	/**
	 *--------------------------------------------------------------------- 
	 * @param description
	 *   Description から 文字列："from xx/xx/xx to xx/xx/xx"を取り出して編集する
	 *   (ex.. "from 8/25/16 to 08/26/16" -> "2016/8/25-2016/8/26")
	 * @return "2016/8/25-2016/8/26"
	 * --------------------------------------------------------------------
	 */
	public String editDesc(String description) {
		String desc = description;
		int start = 0;
		start = desc.indexOf("from");
		if(start != -1) {
			start = (desc.indexOf("from") + 6);	//Descriptionフィールドの"from"が開始位置(index)を取得
			desc = desc.substring(start);		//Descriptionフィールドから"from"以下の文字列を取り出す
			desc = desc.replace("to", "-");		//日付の間の"to"を"-"に変換
			desc = squeeze(desc);				//ワークフィールドの空白文字列を詰める
		}
		return desc;
	}
	public String squeeze(String s){
		StringBuffer buf = new StringBuffer(s.length());
		for (int i=0; i<s.length(); i++){
			if(s.charAt(i) == ' ' || s.charAt(i) == '\n' || s.charAt(i) == '\t') {
				continue;
			} else {
				buf.append(s.charAt(i));
			}
		}
		String description = buf.toString();
		description = formatDate(description);

		return description;
	}
	public String formatDate(String description) {
		String formatDate = description;
		String[] ft = formatDate.split("-");
		String[] fromDate = ft[0].split("/");
		String[] toDate = ft[1].split("/");
		
		String formatData1 = "20" + fromDate[2] + "/" + fromDate[0].replaceFirst("^0+", "") + "/" + fromDate[1];
		String formatData2 = "20" + toDate[2] + "/" + toDate[0].replaceFirst("^0+", "") + "/" + toDate[1];
		formatDate = formatData1 + "-" + formatData2;
		
		System.out.println("For Debug formatDate: " + formatDate);
		
		return formatDate;
	}
}
