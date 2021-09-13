package com.check_currency.app;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class setDate {
    private Calendar date = new GregorianCalendar();

    public String getToday(){
        int res = date.get(Calendar.DAY_OF_MONTH);
        return( Integer.toString(res));
    }
    public String yesterday(){
        int t = date.get(Calendar.DAY_OF_MONTH);
        String res = "";
        if( t - 4 < 10 ) res = "0" + (t - 4);
        else res = Integer.toString(t-4);
        return( res );
    }
    public String getMonth () {
        int month = date.get(Calendar.MONTH) + 1;
        String res = "";
        if(month < 10) res = "0" + month;
        else res = Integer.toString(month);
        return( res);
    }
    public String getYear () {
        int year = date.get(Calendar.YEAR);
        return( Integer.toString(year));
    }
}
