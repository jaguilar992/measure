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
    public static Unit yd2  = new Unit();
    public static Unit vr2  = new Unit();
    public static Unit mz  = new Unit();
    public static Unit diam_metro = new Unit();  // CIRCUNFERENCE
    public static Unit diam_centi = new Unit();  // CIRCUNFERENCE
    public static Unit diam_pulga = new Unit();  // CIRCUNFERENCE
    public static Unit rad_metro = new Unit();  // CIRCUNFERENCE
    public static Unit rad_centi = new Unit();  // CIRCUNFERENCE
    public static Unit rad_pulga = new Unit();  // CIRCUNFERENCE


    
    public Area(double qt , Unit unit){
        super(qt); // qt METERS
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

        yd2.setName("yd2");
        yd2.setSymbol("yd²");
        yd2.setRef(super.search_unit(Area.pulga2));
        yd2.setDenom(Math.pow(36,2));
        super.add(yd2);

        vr2.setName("vr2");
        vr2.setSymbol("vr²");
        vr2.setRef(super.search_unit(Area.pulga2));
        vr2.setDenom(Math.pow(33,2));
        super.add(vr2);

        mz.setName("manzana");
        mz.setSymbol("mz");
        mz.setRef(super.search_unit(Area.vr2));
        mz.setDenom(10000);
        super.add(mz);


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
