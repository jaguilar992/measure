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
public class Unit{
	private String name;
	private String symbol;
	private double num=1;
	private double denom=1;
	private double numi=1;
	private double denomi=1;
	private double intern=0;
	private double expo=1;
	private double extern=0;
        private int reference = 0;
	// public Unit(){};
	public Unit(String name, String symbol, double num, double denom, double numi, double denomi,double intern,double expo, double extern){
		// Todas son con respecto a la referencia SI
		this.name=name;
		this.symbol=symbol;
		this.num=num;
		this.denom=denom;
		this.numi=numi;
		this.denomi=denomi;
		this.intern=intern;
		this.expo=expo;
		this.extern=extern;
	}
        
        public Unit(String name, String symbol){
            this.name=name;
            this.symbol=symbol;
        }
        
        public Unit(){
            this.name=null;
            this.symbol=null;
        }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the symbol
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * @param symbol the symbol to set
     */
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * @return the num
     */
    public double getNum() {
        return num;
    }

    /**
     * @param num the num to set
     */
    public void setNum(double num) {
        this.num = num;
    }
    
     /**
     * @return the num
     */
    public double getNumI() {
        return numi;
    }

    /**
     * @param num the num to set
     */
    public void setNumI(double num) {
        this.numi = num;
    }

    /**
     * @return the denom
     */
    public double getDenom() {
        return denom;
    }

    /**
     * @param denom the denom to set
     */
    public void setDenom(double denom) {
        if (denom!=0) {
            this.denom = denom;
        }
    }
    
     /**
     * @return the denom
     */
    public double getDenomI() {
        return denomi;
    }

    /**
     * @param denom the denom to set
     */
    public void setDenomI(double denom) {
        if (denom!=0) {
            this.denomi = denom;
        }
    }

    /**
     * @return the intern
     */
    public double getIntern() {
        return intern;
    }

    /**
     * @param intern the intern to set
     */
    public void setIntern(double intern) {
        this.intern = intern;
    }

    /**
     * @return the expo
     */
    public double getExpo() {
        return expo;
    }

    /**
     * @param expo the expo to set
     */
    public void setExpo(double expo) {
        if (expo!=0) {
            this.expo = expo;
        }
    }

    /**
     * @return the extern
     */
    public double getExtern() {
        return extern;
    }

    /**
     * @param extern the extern to set
     */
    public void setExtern(double extern) {
        this.extern = extern;
    }

    @Override
    public String toString() {
        return "Unit{" + "name=" + name + '}';
    }

    /**
     * @return the reference
     */
    public int getRef() {
        return reference;
    }

    /**
     * @param reference the reference to set
     */
    public void setRef(int reference) {
        this.reference = reference;
    }
    
    public String show(double x){
        return VALUE.format(x)+" "+SYMB.format(this.getSymbol());
    }
    
    public void copy_values(Unit unit) {
        this.setNum(unit.getNum());
        this.setDenom(unit.getDenom());
	this.setNumI(unit.getNumI());
        this.setDenomI(unit.getDenomI());
        this.setExpo(unit.getExpo());
        this.setExtern(unit.getExtern());
        this.setIntern(unit.getIntern());
        this.setRef(unit.getRef());
    }
}
