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
public class Mass extends Magnitude{
    public static Unit arroba = new Unit();
    public static Unit centigramo = new Unit();
    public static Unit gramo = new Unit();
    public static Unit kilogramo = new Unit();
    public static Unit libra = new Unit();
    public static Unit microgramo = new Unit();
    public static Unit nanogramo = new Unit();
    public static Unit miligramo = new Unit();
    public static Unit onza = new Unit();
    public static Unit quintal = new Unit();
    public static Unit slug = new Unit();
    public static Unit ton_cort = new Unit();
    public static Unit ton_mt = new Unit();
    public static Unit mass_atom = new Unit();
    public static CompoundUnit libra_oz = new CompoundUnit();
    
    public Mass(double qt , Unit unit){
        super(qt); // qt METERS
        super.setName("masa");
/* BEGIN CHANGES*/

        centigramo.setName("centigramo");
        centigramo.setSymbol("cg");
        centigramo.setNum(1e4);
        super.add(centigramo);

        gramo.setName("gramo");
        gramo.setSymbol("g");
        gramo.setNum(1000);
        super.add(gramo);

        kilogramo.setName("kilogramo");
        kilogramo.setSymbol("kg");
        super.zero(kilogramo);

        libra.setName("libra");
        libra.setSymbol("lb");
        libra.setDenom(0.45359237);
        super.add(libra);
        
        arroba.setName("arroba");
        arroba.setSymbol("@");
        arroba.setDenom(25);
        arroba.setRef(super.search_unit(Mass.libra));
        super.add(arroba);
        
        libra_oz.setName("libra_oz");
        libra_oz.setSymbol("lb+oz");
        libra_oz.copy_values(libra);
        libra_oz.add_factor(16);
        super.add(libra_oz);

        microgramo.setName("microgramo");
        microgramo.setSymbol("μg");
        microgramo.setNum(1e9);
        super.add(microgramo);
        
        nanogramo.setName("nanogramo");
        nanogramo.setSymbol("ng");
        nanogramo.setNum(1e12);
        super.add(nanogramo);

        miligramo.setName("miligramo");
        miligramo.setSymbol("mg");
        miligramo.setNum(1e6);
        super.add(miligramo);

        onza.setName("onza");
        onza.setSymbol("oz");
        onza.setNum(16);
        onza.setRef(super.search_unit(Mass.libra));
        //onza.setDenom(0.45359237);
        super.add(onza);

        quintal.setName("quintal");
        quintal.setSymbol("qq");
        quintal.setDenom(100);
        quintal.setRef(super.search_unit(Mass.libra));
        super.add(quintal);

        slug.setName("slug");
        slug.setSymbol("slug");
        slug.setDenom(14.593902937206368);
        super.add(slug);

        ton_cort.setName("ton_cort");
        ton_cort.setSymbol("ton");
        ton_cort.setDenom(907.18474);
        super.add(ton_cort);

        ton_mt.setName("ton_mt");
        ton_mt.setSymbol("ton mt");
        ton_mt.setDenom(1000);
        super.add(ton_mt);

        mass_atom.setName("mass_atom");
        mass_atom.setSymbol("uma");
        mass_atom.setDenom(1.660538921e-27);
        super.add(mass_atom);
                
  /** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    
    public Mass(double qt){
        this(qt,Mass.kilogramo);
    }
    
    public Mass(){
        this(0,Mass.kilogramo);
    }
}
