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
public class Aceleration extends Magnitude{
    public static Unit metro_s2 = new Unit();
    public static Unit kilo_s2 = new Unit();
    public static Unit kilo_h2 = new Unit();
    public static Unit milla_h2 = new Unit();
    public static Unit milla_s2 = new Unit();
    public static Unit centi_s2 = new Unit();
    public static Unit pulga_s2 = new Unit();
    public static Unit pies_s2 = new Unit();
    public static Unit yarda_s2 = new Unit();
    public static Unit grav = new Unit();
    public static Unit gal = new Unit();
    public static Unit cgal = new Unit();
    public static Unit mgal = new Unit();
    public static Unit mm_s2 = new Unit();
    
    public Aceleration(double qt , Unit unit){
        super(qt); // qt m/s2
        super.setName("aceleracion");
        // DEFINICIONES
        
        metro_s2.setName("metro_s2");
        metro_s2.setSymbol("m/s²");
        super.zero(metro_s2);

        kilo_s2.setName("kilo_s2");
        kilo_s2.setSymbol("km/s²");
        kilo_s2.setDenom(1000);
        super.add(kilo_s2);

        kilo_h2.setName("kilo_h2");
        kilo_h2.setSymbol("km/h²");
        kilo_h2.setNum(12960000);
        kilo_h2.setDenom(1000);
        super.add(kilo_h2);

        milla_h2.setName("milla_h2");
        milla_h2.setSymbol("mi/h²");
        milla_h2.setNum(1.296e+9);
        milla_h2.setDenom(160934.4);
        super.add(milla_h2);

        milla_s2.setName("milla_s2");
        milla_s2.setSymbol("mi/s²");
        milla_s2.setNum(100);
        milla_s2.setDenom(160934.4);
        super.add(milla_s2);

        centi_s2.setName("centi_s2");
        centi_s2.setSymbol("cm/s²");
        centi_s2.setNum(100);
        super.add(centi_s2);

        pulga_s2.setName("pulga_s2");
        pulga_s2.setSymbol("in/s²");
        pulga_s2.setNum(1e2);
        pulga_s2.setDenom(2.54);
        super.add(pulga_s2);

        pies_s2.setName("pies_s2");
        pies_s2.setSymbol("ft/s²");
        pies_s2.setNum(1e2);
        pies_s2.setDenom(30.48);
        super.add(pies_s2);

        yarda_s2.setName("yarda_s2");
        yarda_s2.setSymbol("yd/s²");
        yarda_s2.setNum(1e2);
        yarda_s2.setDenom(91.44);
        super.add(yarda_s2);
        
        grav.setName("grav");
        grav.setSymbol("g");
        grav.setDenom(9.80669999999999);
        super.add(grav);
        
        gal.setName("gal");
        gal.setSymbol("Gal");
        gal.setNum(100);
        super.add(gal);
        
        cgal.setName("cgal");
        cgal.setSymbol("cGal");
        cgal.setRef(super.search_unit(Aceleration.gal));
        cgal.setNum(100);
        super.add(cgal);
        
        mgal.setName("mgal");
        mgal.setSymbol("mGal");
        mgal.setRef(super.search_unit(Aceleration.gal));
        mgal.setNum(1000);
        super.add(mgal);
        
        super.set_unit(unit);
    }
    public Aceleration(double qt){
        this(qt,Distance.metro);
    }
    
    public Aceleration(){
        this(0,Distance.metro);
    }
}
