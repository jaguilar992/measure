/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagon.magnitude;
import com.hexagon.measure.Magnitude;
import com.hexagon.measure.Unit;

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
    
    
    public Distance(double qt){
        super(qt); // qt METERS
        super.setName("longitud");
        
        //UNITS DEFINITIONS
        angstrom.setName("angstrom");
        angstrom.setSymbol("Å");
        angstrom.setNum(1e10);

        centimetro.setName("centimetro");
        centimetro.setSymbol("cm");
        centimetro.setNum(1e2);

        decimetro.setName("decimetro");
        decimetro.setSymbol("dm");
        decimetro.setNum(10);

        fentometro.setName("fentometro");
        fentometro.setSymbol("fm");
        fentometro.setNum(1e15);

        kilometro.setName("kilometro");
        kilometro.setSymbol("km");
        kilometro.setDenom(1e3);

        legua.setName("legua");
        legua.setSymbol("lg");
        legua.setNum(125);
        legua.setDenom(603504);

        metro.setName("metro");
        metro.setSymbol("m");

        micrometro.setName("micrometro");
        micrometro.setSymbol("μm");
        micrometro.setNum(1e6);

        milla.setName("milla");
        milla.setSymbol("mi");
        milla.setNum(125);
        milla.setDenom(201168);

        milimetro.setName("milimetro");
        milimetro.setSymbol("mm");
        milimetro.setNum(1e3);

        nanometro.setName("nanometro");
        nanometro.setSymbol("nm");
        nanometro.setNum(1e9);

        picometro.setName("picometro");
        picometro.setSymbol("pm");
        picometro.setNum(1e12);

        pie.setName("pies");
        pie.setSymbol("ft");
        pie.setNum(1250);
        pie.setDenom(381);

        pulgada.setName("pulgada");
        pulgada.setSymbol("in");
        pulgada.setNum(5000);
        pulgada.setDenom(127);

        yarda.setName("yarda");
        yarda.setSymbol("yd");
        yarda.setNum(1250);
        yarda.setDenom(1143);
        
        vara.setName("vara");
        vara.setSymbol("vr");
        vara.setNum(5000);
        vara.setDenom(4191);
        
        
        //ADD
        super.zero(metro); // DEFAULT UNIT
        super.add(angstrom);
        super.add(centimetro);
        super.add(decimetro);
        super.add(fentometro);
        super.add(kilometro);
        super.add(legua);
        super.add(micrometro);
        super.add(milla);
        super.add(milimetro);
        super.add(nanometro);
        super.add(picometro);
        super.add(pie);
        super.add(pulgada);
        super.add(yarda);
        super.add(vara);
    }
}
