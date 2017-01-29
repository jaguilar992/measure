/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagon.magnitude;

/**
 *
 * @author jaguilar992
 */
public class Radian extends Unit{
    public Rational r;
    public Radian(String name, String symbol, double num, double denom, double numi, double denomi,double intern,double expo, double extern){
        super(name,symbol,num,denom,numi, denomi,intern,expo,extern);
    }
    
    public Radian(String name, String symbol){
        super(name,symbol);
    }
    
    public Radian(){
        super();
    }

    private int getf(double x){
        String f[] = String.valueOf(x).split("\\.");
        return f[1].length();
    }
    
    @Override
    public String show(double x) {
        String sym = SYMB.format(this.getSymbol());
        double pi_fact = Double.parseDouble(VALUE.getFixed(x*180 / Math.PI,2));
        int f = getf(pi_fact);
        long num = (long)(pi_fact*Math.pow(10,f));
        long den = (long)(180 * Math.pow(10, f));
        this.r = new Rational(num, den);
        String p = VALUE.sgn(x);
        if (r.denominator()<10000) {
            if (r.numerator()==1 && r.denominator()==1){
                return p + "π "+sym;
            }else if (r.numerator()==1) {
                return p + "π/"+r.denominator()+" "+sym;
            }else if (r.denominator()==1){
                return p + r.numerator()+"π "+sym;
            }else{
                return p + r.numerator()+"π/"+r.denominator()+" "+sym;
            }
        }else{
            return p + VALUE.getFixed(x/Math.PI,5)+"π "+sym;
        }
    }
    
    
}
