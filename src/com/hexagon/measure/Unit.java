/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagon.measure;

/**
 *
 * @author jaguilar992
 */
public class Unit{
	private String name;
	private String symbol;
	private double num=1;
	private double denom=1;
	private double intern=0;
	private double expo=1;
	private double extern=0;
        private int reference = 0;
	// public Unit(){};
	public Unit(String name, String symbol, double num, double denom,double intern,double expo, double extern){
		// Todas son con respecto a la referencia SI
		this.name=name;
		this.symbol=symbol;
		this.num=num;
		this.denom=denom;
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
     * @return the denom
     */
    public double getDenom() {
        return denom;
    }

    /**
     * @param denom the denom to set
     */
    public void setDenom(double denom) {
        this.denom = denom;
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
        this.expo = expo;
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
        return "Unit{" + "name=" + name + ", symbol=" + symbol + '}';
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
    
    
}
