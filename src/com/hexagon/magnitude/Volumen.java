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
public class Volumen extends Magnitude{
    private String name;
    // public static Unit unit = new Unit();
    public static Unit metro3 = new Unit();
    public static Unit centi3 = new Unit();
    public static Unit kilo3 = new Unit();
    public static Unit pulga3 = new Unit();
    public static Unit pie3 = new Unit();
    public static Unit yarda3 = new Unit();
    public static Unit milla3 = new Unit();
    public static Unit mlitro = new Unit();
    public static Unit litro = new Unit();
    public static Unit galon = new Unit();
    public static Unit galon_uk = new Unit();
    public static Unit pinta = new Unit();
    public static Unit cuarto = new Unit();
    public static Unit oz_liq = new Unit();

    public static Unit diam_metro = new Unit();  // DIAMETER SPHERE
    public static Unit diam_centi = new Unit();  // DIAMETER SPHERE
    public static Unit diam_pulga = new Unit();  // DIAMETER SPHERE
    public static Unit rad_metro = new Unit();  // RADIUS SPHERE
    public static Unit rad_centi = new Unit();  // RADIUS SPHERE
    public static Unit rad_pulga = new Unit();  // RADIUS SPHERE
    
    public Volumen(double qt , Unit unit){
        super(qt);
        super.setName(name);
        
        /** INIT CHANGES */
        metro3.setName("metro3");
        metro3.setSymbol("m³");
        super.zero(metro3);
        
        centi3.setName("centi3");
        centi3.setSymbol("cm³");
        centi3.setNum(1e6);
        super.add(centi3);
        
        kilo3.setName("kilo3");
        kilo3.setSymbol("km³");
        kilo3.setDenom(1e9);
        super.add(kilo3);
        
        pulga3.setName("pulga3");
        pulga3.setSymbol("in³");
        pulga3.setRef(super.search_unit(Volumen.centi3));
        pulga3.setDenom(Math.pow(2.54, 3));
        super.add(pulga3);
        
        pie3.setName("pie3");
        pie3.setSymbol("ft³");
        pie3.setRef(super.search_unit(Volumen.pulga3));
        pie3.setDenom(Math.pow(12, 3));
        super.add(pie3);
        
        yarda3.setName("yarda3");
        yarda3.setSymbol("yd³");
        yarda3.setRef(super.search_unit(Volumen.pie3));
        yarda3.setDenom(9);
        super.add(yarda3);
        
        milla3.setName("milla3");
        milla3.setSymbol("mi³");
        milla3.setRef(super.search_unit(Volumen.pie3));
        milla3.setDenom(Math.pow(5280, 3));
        super.add(milla3);
        
        mlitro.setName("mlitro");
        mlitro.setSymbol("mL");
        mlitro.copy_values(Volumen.centi3);
        super.add(mlitro);
        
        litro.setName("litro");
        litro.setSymbol("L");
        litro.setRef(super.search_unit(Volumen.mlitro));
        litro.setDenom(1000);
        super.add(litro);
        
        galon.setName("galon");
        galon.setSymbol("gal");
        galon.setRef(super.search_unit(Volumen.pulga3));
        galon.setDenom(231);
        super.add(galon);
        
        galon_uk.setName("galon_uk");
        galon_uk.setSymbol("gal(UK)");
        galon_uk.setRef(super.search_unit(Volumen.pulga3));
        galon_uk.setDenom(282   );
        super.add(galon_uk);
        
        pinta.setName("pinta");
        pinta.setSymbol("pt");
        pinta.setRef(super.search_unit(Volumen.galon));
        pinta.setNum(8);
        super.add(pinta);
        
        cuarto.setName("cuarto");
        cuarto.setSymbol("qt");
        cuarto.setRef(super.search_unit(Volumen.galon));
        cuarto.setNum(4);
        super.add(cuarto);
        
        oz_liq.setName("oz_liq");
        oz_liq.setSymbol("oz liq");
        oz_liq.setRef(super.search_unit(Volumen.pinta));
        oz_liq.setNum(16);
        super.add(oz_liq);
        
        
        rad_metro.setName("rad_metro");
        rad_metro.setSymbol("R[m]");
        rad_metro.setRef(super.search_unit(Volumen.metro3));
        rad_metro.setNumI(3);
        rad_metro.setDenomI(4*Math.PI);
        rad_metro.setExpo(1/3.0);
        super.add(rad_metro);

        rad_centi.setName("rad_centi");
        rad_centi.setSymbol("R[cm]");
        rad_centi.setRef(super.search_unit(Volumen.rad_metro));
        rad_centi.setNum(100);
        super.add(rad_centi);

        rad_pulga.setName("rad_pulga");
        rad_pulga.setSymbol("R[in]");
        rad_pulga.setRef(super.search_unit(Volumen.rad_centi));
        rad_pulga.setDenom(2.54);
        super.add(rad_pulga);
        
        diam_metro.setName("diam_metro");
        diam_metro.setSymbol("D[m]");
        diam_metro.setRef(super.search_unit(Volumen.rad_metro));
        diam_metro.setNum(2);
        super.add(diam_metro);
        
        diam_centi.setName("diam_centi");
        diam_centi.setSymbol("D[cm]");
        diam_centi.setRef(super.search_unit(Volumen.rad_centi));
        diam_centi.setNum(2);
        super.add(diam_centi);
        
        
        diam_pulga.setName("diam_pulga");
        diam_pulga.setSymbol("D[in]");
        diam_pulga.setRef(super.search_unit(Volumen.rad_pulga));
        diam_pulga.setDenom(2);
        super.add(diam_pulga);
        

        
        
        
        /** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    
    public Volumen(double qt){
        this(qt,Volumen.metro3);
    }
    
    public Volumen(){
        this(0,Volumen.metro3);
    }
}
