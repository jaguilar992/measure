/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this file, choose Tools | Templates
 * and open the in the editor.
 */
package com.hexagon.magnitude;

/**
 *
 * @author jaguilar992
 */
public class Area extends Magnitude{
    private String name = "area";
    // public static Unit unit = new Unit()
    public static Unit metro2 = new Unit();
    public static Unit centi2  = new Unit();
    public static Unit kilo2  = new Unit();
    public static Unit mili2  = new Unit();
    public static Unit acre  = new Unit();
    public static Unit pie2  = new Unit();
    public static Unit pulga2  = new Unit();
    public static Unit milla2  = new Unit();
    public static Unit yarda2  = new Unit();
    public static Unit vara2  = new Unit();
    public static Unit mz  = new Unit();
    public static Unit ha  = new Unit();
    
    public static Unit diam_metro = new Unit();  // DIAMETER CIRCUNFERENCE
    public static Unit diam_centi = new Unit();  // DIAMETER CIRCUNFERENCE
    public static Unit diam_pulga = new Unit();  // DIAMETER CIRCUNFERENCE
    public static Unit rad_metro = new Unit();  // RADIUS CIRCUNFERENCE
    public static Unit rad_centi = new Unit();  // RADIUS CIRCUNFERENCE
    public static Unit rad_pulga = new Unit();  // RADIUS CIRCUNFERENCE


    
    public Area(double qt , Unit unit){
        super(qt);
        super.setName(name);
        
        /** INIT CHANGES */
        // super.zero super.add
        
        metro2.setName("metro2");
        metro2.setSymbol("m²");
        super.zero(metro2);

        centi2.setName("centi2");
        centi2.setSymbol("cm²");
        centi2.setNum(1e4);
        super.add(centi2);

        kilo2.setName("kilo2");
        kilo2.setSymbol("km²");
        kilo2.setDenom(1e6);
        super.add(kilo2);

        mili2.setName("mili2");
        mili2.setSymbol("mm²");
        mili2.setNum(1e6);
        super.add(mili2);

        pulga2.setName("pulga2");
        pulga2.setSymbol("in²");
        pulga2.setRef(super.search_unit(Area.centi2));
        pulga2.setDenom(Math.pow(2.54,2));
        super.add(pulga2);

        pie2.setName("pie2");
        pie2.setSymbol("ft²");
        pie2.setRef(super.search_unit(Area.pulga2));
        pie2.setDenom(Math.pow(12,2));
        super.add(pie2);

        acre.setName("acre");
        acre.setSymbol("acre");
        acre.setRef(super.search_unit(Area.pie2));
        acre.setDenom(43560);
        super.add(acre);

        milla2.setName("milla2");
        milla2.setSymbol("mi²");
        milla2.setRef(super.search_unit(Area.pie2));
        milla2.setDenom(Math.pow(5280,2));
        super.add(milla2);

        yarda2.setName("yarda2");
        yarda2.setSymbol("yd²");
        yarda2.setRef(super.search_unit(Area.pulga2));
        yarda2.setDenom(Math.pow(36,2));
        super.add(yarda2);

        vara2.setName("vara2");
        vara2.setSymbol("vr²");
        vara2.setRef(super.search_unit(Area.pulga2));
        vara2.setDenom(Math.pow(33,2));
        super.add(vara2);

        mz.setName("manzana");
        mz.setSymbol("mz");
        mz.setRef(super.search_unit(Area.vara2));
        mz.setDenom(10000);
        super.add(mz);

        diam_metro.setName("diam_metro");
        diam_metro.setSymbol("D[m]");
        diam_metro.setRef(super.search_unit(Area.metro2));
        diam_metro.setNum(2);
        diam_metro.setDenomI(Math.PI);
        diam_metro.setExpo(0.5);
        super.add(diam_metro);

        diam_centi.setName("diam_centi");
        diam_centi.setSymbol("D[cm]");
        diam_centi.setRef(super.search_unit(Area.diam_metro));
        diam_centi.setNum(100);
        super.add(diam_centi);

        diam_pulga.setName("diam_pulga");
        diam_pulga.setSymbol("D[in]");
        diam_pulga.setRef(super.search_unit(Area.diam_centi));
        diam_pulga.setDenom(2.54);
        super.add(diam_pulga);

        rad_metro.setName("rad_metro");
        rad_metro.setSymbol("R[m]");
        rad_metro.setRef(super.search_unit(Area.diam_metro));
        rad_metro.setDenom(2);
        super.add(rad_metro);
        
        rad_centi.setName("rad_centi");
        rad_centi.setSymbol("R[cm]");
        rad_centi.setRef(super.search_unit(Area.diam_centi));
        rad_centi.setDenom(2);
        super.add(rad_centi);
        
        rad_pulga.setName("rad_pulga");
        rad_pulga.setSymbol("R[in]");
        rad_pulga.setRef(super.search_unit(Area.diam_pulga));
        rad_pulga.setDenom(2);
        super.add(rad_pulga);

        ha.setName("hecta");
        ha.setSymbol("ha");
        ha.setDenom(10000);
        super.add(ha);



        /** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    
    public Area(double qt){
        this(qt,Area.metro2);
    }
    
    public Area(){
        this(0,Area.metro2);
    }
}
