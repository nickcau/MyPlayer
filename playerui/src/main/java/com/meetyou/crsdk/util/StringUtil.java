package com.meetyou.crsdk.util;

/**
 * Created by gaoyoujian on 2017/5/11.
 */

public class StringUtil {

    public static boolean isWhitespace(int c){
        return c == ' ' || c == '\t' || c == '\n' || c == '\f' || c == '\r';
    }

    public static String getFiveNum(int total_review) {
        String num;
        if(total_review > 9999) {
            num = total_review / 10000 + "万";
        } else {
            num = total_review + "";
        }

        return num;
    }

    public static boolean isNull(String str) {
        try {
            if (str == null) {
                return true;
            } else if (str != null) {
                if (str.equals("") || str.equals("null") || str.equals("[]")) {
                    return true;
                } else if (str.trim().equals("") || str.trim().equals("null")) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;

    }

}
