package jp.co.koseihalfmoon;

import java.util.Calendar;

public class GetDate {
	public String getCurrentDateString() {
	    //==== 現在日時を取得 ====//
	    Calendar cal = Calendar.getInstance();
	    int year = cal.get(Calendar.YEAR);
	    int month = cal.get(Calendar.MONTH);
	    int day = cal.get(Calendar.DAY_OF_MONTH);
	    int hour = cal.get(Calendar.HOUR_OF_DAY);
	    int minute = cal.get(Calendar.MINUTE);
	    int second = cal.get(Calendar.SECOND);
	         
	    //==== 整形 ====//
	    String strDate = year + "/" + (month+1) + "/" + day + " " + hour + ":" + minute + ":" + second;
	    return strDate;
	}       
	public String getCurrentTimeString() {
	    //==== 現在時刻を取得 ====//
	    Calendar cal = Calendar.getInstance();
	    int hour = cal.get(Calendar.HOUR_OF_DAY);
	    int minute = cal.get(Calendar.MINUTE);
	    int second = cal.get(Calendar.SECOND);
	         
	    //==== 整形 ====//
	    String strTime = hour + ":" + minute + ":" + second;
	    return strTime;
	}       
}
