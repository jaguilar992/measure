/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagon.magnitude;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author jaguilar992
 */
public class VALUE {
    private static final int MAX_ROUND = 10;
    private static final String PATTERN = "###.#########";
    public static int DEFAULT_ROUND = 3;
    private static final DecimalFormat FORM = (DecimalFormat)NumberFormat.getNumberInstance(Locale.US);
    
    public static String format(double x){
        if (Math.abs(x)>0 && Math.abs(x)<1e-6) {
            return sci(x);
        }else if(Math.abs(x)>=1e-6 && Math.abs(x)<1){
            FORM.applyPattern("#.######");
            return FORM.format(x);
	}else if(Math.abs(x)>=1 && Math.abs(x)<1e7){
            int intpart = String.valueOf(Math.abs(x)).split("\\.")[0].length();
            if (intpart>4 && VALUE.DEFAULT_ROUND==6) {
                VALUE.DEFAULT_ROUND=10-intpart;
            }
            String patern = "###,###.";
            for (int i = 0; i < DEFAULT_ROUND; i++) {
                patern += "#";
            }
            FORM.setRoundingMode(RoundingMode.HALF_UP);
            FORM.applyPattern(patern);
            return FORM.format(x);
	}else if(Math.abs(x)>=1e7){ // x>=1e7
            return sci(x);
        }else{
            return "0";
        }
        //return null;
    }
    
    public static String getInt (double x){
        if (isInt(x)) {
            return String.valueOf((int)Math.floor(x));
        }
        return x+"";
    }
   
    public static String getFixed(double x, int n){
        String patern="###,###.";
        if (n<MAX_ROUND) {
            for (int i = 0; i < n; i++) {
                patern+="#";
            }
        }else{
            patern=PATTERN;
        }
        FORM.setRoundingMode(RoundingMode.HALF_UP);
        FORM.applyPattern(patern);
        return FORM.format(x);
    }
    
     public static String getFixed(double x){
        return VALUE.getFixed(x,VALUE.DEFAULT_ROUND);
    }
    
    public static boolean isInt(double x){
        String f = String.valueOf((int)Math.floor(x));
        FORM.applyPattern("#.##########");
        return FORM.format(x).equals(f);
    }
    
    
    public static String sgn(double x){
        int sgn = Integer.signum((int)x);
        if (sgn==1 || sgn==0) {
            return "";
        }
        return "-";
    }
    
    public static String sci(double x,boolean labeled){
        switch (VALUE.DEFAULT_ROUND){
            case 1:
                FORM.applyPattern("#.#E0");
            break; case 2:
                FORM.applyPattern("#.##E0");
            break; case 3:
                FORM.applyPattern("#.###E0");
            break; case 4:
                FORM.applyPattern("#.####E0");
            break; case 5:
                FORM.applyPattern("#.#####E0");
            break; default:
        }

        if (labeled) {
            String sci1=FORM.format(x);
            String [] array = sci1.split("E");
            String mts=array[0];
            String exp = array[1];
            return mts+"x10"+"<sup><small>"+exp+"</small></sup>";
        } else {
            FORM.applyPattern("#.#########E0"); // 9 cifras decimales
            String sci1=FORM.format(x);
            String [] array = sci1.split("E");
            String mts=array[0];
            String exp = array[1];
            return mts+"<small>E</small>"+exp;
        }
    }

    public static  String sci(double x){
        return sci(x,true);
    }


    public static String format_calc(double x){
        if (Math.abs(x)>0 && Math.abs(x)<1e-9) {
            return sci(x,false);
        }else if(Math.abs(x)>=1e-9 && Math.abs(x)<1e10){
            int intpart = String.valueOf(Math.abs(x)).split("\\.")[0].length();
            String patern = "###,###.";
            for (int i = 0; i < 11-intpart; i++) {
                patern += "#";
            }
            FORM.setRoundingMode(RoundingMode.HALF_UP);
            FORM.applyPattern(patern);
            return FORM.format(x);
        }else if(Math.abs(x)>=1e10){ // x>=1e7
            return sci(x,false);
        }else{
            return "0";
        }
    }

}
