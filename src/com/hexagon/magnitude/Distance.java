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
public class Distance extends Magnitude{
    public static Unit angstrom = new Unit();
    public static Unit centimetro = new Unit();
    public static Unit decimetro = new Unit();
    public static Unit fentometro = new Unit();
    public static Unit kilometro = new Unit();
    public static Unit legua = new Unit();
    public static Unit metro = new Unit();
    public static Unit micrometro = new Unit();
    public static Unit milla = new Unit();
    public static Unit milimetro = new Unit();
    public static Unit nanometro = new Unit();
    public static Unit picometro = new Unit();
    public static Unit pie = new Unit();
    public static Unit pulgada = new Unit();
    public static Unit yarda = new Unit();
    public static Unit vara = new Unit();
    public static Unit legua_nautica = new Unit();
    public static CompoundUnit pie_pulgada = new CompoundUnit();
    public static CompoundUnit milla_pie_pulgada = new CompoundUnit();
    public static CompoundUnit milla_pie = new CompoundUnit();
    public static CompoundUnit yarda_pulg = new CompoundUnit();
    
    public Distance(double qt , Unit unit){
        super(qt); // qt METERS
        super.setName("longitud");
        
/** END CHANGES */
        angstrom.setName("angstrom");
        angstrom.setSymbol("Å");
        angstrom.setNum(1e10);
        super.add(angstrom);

        centimetro.setName("centimetro");
        centimetro.setSymbol("cm");
        centimetro.setNum(1e2);
        super.add(centimetro);

        decimetro.setName("decimetro");
        decimetro.setSymbol("dm");
        decimetro.setNum(10);
        super.add(decimetro);

        fentometro.setName("fentometro");
        fentometro.setSymbol("fm");
        fentometro.setNum(1e15);
        super.add(fentometro);

        kilometro.setName("kilometro");
        kilometro.setSymbol("km");
        kilometro.setDenom(1e3);
        super.add(kilometro);

        legua.setName("legua");
        legua.setSymbol("lg");
        legua.setNum(125);
        legua.setDenom(603504);
        super.add(legua);

        metro.setName("metro");
        metro.setSymbol("m");
        super.zero(metro); // DEFAULT UNIT

        micrometro.setName("micrometro");
        micrometro.setSymbol("μm");
        micrometro.setNum(1e6);
        super.add(micrometro);

        milimetro.setName("milimetro");
        milimetro.setSymbol("mm");
        milimetro.setNum(1e3);
        super.add(milimetro);

        nanometro.setName("nanometro");
        nanometro.setSymbol("nm");
        nanometro.setNum(1e9);
        super.add(nanometro);

        picometro.setName("picometro");
        picometro.setSymbol("pm");
        picometro.setNum(1e12);
        super.add(picometro);
        
        pulgada.setName("pulgada");
        pulgada.setSymbol("in");
        pulgada.setNum(5000);
        pulgada.setDenom(127);
        super.add(pulgada);
        
        pie.setName("pie");
        pie.setSymbol("ft");
        pie.setDenom(12); //1 ft / 12 in
        pie.setRef(super.search_unit(Distance.pulgada));
        super.add(pie);

        milla.setName("milla");
        milla.setSymbol("mi");
        milla.setDenom(5280);
        milla.setRef(super.search_unit(Distance.pie));
        super.add(milla);

        milla_pie_pulgada.setName("milla_pie_pulgada");
        milla_pie_pulgada.setSymbol("mi+ft+in");
        milla_pie_pulgada.copy_values(milla);
        milla_pie_pulgada.add_factor(5280);
        milla_pie_pulgada.add_factor(12);
        super.add(milla_pie_pulgada);

        milla_pie.setName("milla_pie");
        milla_pie.setSymbol("mi+ft");
        milla_pie.copy_values(milla);
        milla_pie.add_factor(5280);
        super.add(milla_pie);
        
        yarda.setName("yarda");
        yarda.setSymbol("yd");
        yarda.setDenom(36);
        yarda.setRef(super.search_unit(Distance.pulgada));
        super.add(yarda);
        
        yarda_pulg.setName("yarda_pulg");
        yarda_pulg.setSymbol("yd+in");
        yarda_pulg.copy_values(yarda);
        yarda_pulg.add_factor(36);
        super.add(yarda_pulg);
        
        vara.setName("vara");
        vara.setSymbol("vr");
        vara.setNum(5000);
        vara.setDenom(4191);
        super.add(vara);
        
        legua_nautica.setName("legua_nautica");
        legua_nautica.setSymbol("nl");
        legua_nautica.setDenom(5556);
        super.add(legua_nautica);
        
        pie_pulgada.setName("pie_pulgada");
        pie_pulgada.setSymbol("ft+in");
        pie_pulgada.copy_values(pie);
        pie_pulgada.add_factor(12);
        super.add(pie_pulgada);        
  /** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    
    public Distance(double qt){
        this(qt,Distance.metro);
    }
    
    public Distance(){
        this(0,Distance.metro);
    }
}
