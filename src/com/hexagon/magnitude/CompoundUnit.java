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
public class CompoundUnit extends Unit{
    private double [] factors = new double[10];
    private double [] parts = new double[10];
    private String[] symbols;
    private int count=1;
    
    
    public CompoundUnit(String name, String symbol, double num, double denom, double numi, double denomi,double intern,double expo, double extern){
        super(name,symbol,num,denom,numi, denomi,intern,expo,extern);
        this.factors[0]=1;
    }
    
    public CompoundUnit(String name, String symbol){
        super(name,symbol);
        this.factors[0]=1;
    }
    
    public CompoundUnit(){
        super();
        this.factors[0]=1;
    }
    
   
    public void add_factor(double x){
        this.symbol_array();
        
        if (this.getSymbol()!=null) {
            if (this.count <= this.symbols.length) {
                this.factors[this.count] = x;
                this.count++;
            }
        }
        else{
            System.err.println("Simbolo?");
        }
    }
    
    public void symbol_array(){
        String symbol = this.getSymbol();
        String [] temp;
        if (this.getSymbol()!=null){
            temp = symbol.split("[\\+]");
            this.symbols=temp;
        }
    }
    
    @Override
    public String show(double value){
        double int_part=(Math.abs(value));
        double rest=Math.abs(value);
        String result ="";
        if (this.getSymbol()!=null) {
            int stop=this.symbols.length;
            for (int i = 0; i < stop - 1; i++) {
                int_part = Math.floor(rest * this.factors[i]);
                this.parts[i] = int_part;
                rest = rest * this.factors[i] - int_part;
            }
            this.parts[stop - 1] = rest * factors[stop - 1];
               
            /// APPEND RESULTS 
            result += VALUE.format(this.parts[0]) + " " + SYMB.format(this.symbols[0]);
            for (int i = 1; i < stop; i++) {
                if (i==stop-1) {
                    result += (" " + VALUE.getFixed(this.parts[i],2) + " " + SYMB.format(this.symbols[i]));
                }else{
                    result += (" " + VALUE.getInt(this.parts[i]) + " " + SYMB.format(this.symbols[i]));
                }
            }
            
            return VALUE.sgn(value)+result;
        }
        return value+" symbol?";
    }
    
    @Override
    public void setSymbol(String symbol){
        super.setSymbol(symbol);
        this.symbol_array();
    }


    /**
     * @return the symbols
     */
    public String[] getSymbols() {
        return this.symbols;
    }
    
    public double [] getFactors(){
        return this.factors;
    }
}
