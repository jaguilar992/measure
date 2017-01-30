/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this file, choose Tools | Templates
 * and open in the editor.
 */
package com.hexagon.magnitude;

/**
 *
 * @author jaguilar992
 */
public class Density extends Magnitude{
    private String name;
    // public static Unit unit = new Unit();
    public static Unit kilo_metro3 = new Unit();
    public static Unit kilo_centi3 = new Unit();
    public static Unit kilo_mili3 = new Unit();
    public static Unit gramo_metro3 = new Unit();
    public static Unit gramo_centi3 = new Unit();
    public static Unit gramo_mili3 = new Unit();
    public static Unit mili_metro3 = new Unit();
    public static Unit mili_centi3 = new Unit();    
    public static Unit mili_mili3 = new Unit();
    public static Unit kilo_litro = new Unit();
    public static Unit gramo_litro = new Unit();
    public static Unit mili_litro = new Unit();
    public static Unit libra_pie3 = new Unit();
    public static Unit libra_pulga3 = new Unit();
    public static Unit libra_gal = new Unit();
    
    public Density(double qt , Unit unit){
        super(qt); // qt METERS
        super.setName(name);
        
        /** INIT CHANGES */
        
        /** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    
    public Density(double qt){
        this(qt,Density.kilo_metro3);
    }
    
    public Density(){
        this(0,Density.kilo_metro3);
    }
}
