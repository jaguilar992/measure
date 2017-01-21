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
public class Time extends Magnitude{
    // BEGIN DEFINITIONS
    
    public static Unit year = new Unit();
    public static Unit mes = new Unit();
    public static Unit dia = new Unit();
    public static Unit hora = new Unit();
    public static CompoundUnit hora_min = new CompoundUnit();
    public static CompoundUnit hora_min_seg = new CompoundUnit();
    public static Unit minuto = new Unit();
    public static Unit segundo = new Unit();
    public static Unit centisegundo = new Unit();
    public static Unit milisegundo = new Unit();
    public static Unit microsegundo = new Unit();
    public static Unit siglo = new Unit();
    public static Unit decenio = new Unit();
    public static Unit milenio = new Unit();
     // END DEFINITIONS
    
    
    public Time(double qt , Unit unit){
        super(qt); // qt METERS
        super.setName("masa");

/* BEGIN CHANGES*/
            year.setName("año");
            year.setSymbol("año");
            year.setDenom(31536000);
            super.add(year);


            mes.setName("mes");
            mes.setSymbol("mes");
            mes.setDenom(2628000);
            super.add(mes);


            dia.setName("dia");
            dia.setSymbol("día");
            dia.setDenom(86400);
            super.add(dia);


            hora.setName("hora");
            hora.setSymbol("h");
            hora.setDenom(3600);
            super.add(hora);
            
            hora_min.setName("hora_min");
            hora_min.setSymbol("h+min");
            hora_min.copy_values(hora);
            hora_min.add_factor(60);
            super.add(hora_min);

            hora_min_seg.setName("hora_min_seg");
            hora_min_seg.setSymbol("h+min+s");
            hora_min_seg.copy_values(hora);
            hora_min_seg.add_factor(60);
            hora_min_seg.add_factor(60);
            super.add(hora_min_seg);
            
            minuto.setName("minuto");
            minuto.setSymbol("min");
            minuto.setDenom(60);
            super.add(minuto);


            segundo.setName("segundo");
            segundo.setSymbol("s");
            super.zero(segundo);


            centisegundo.setName("centisegundo");
            centisegundo.setSymbol("cs");
            centisegundo.setNum(1e2);
            super.add(centisegundo);


            milisegundo.setName("milisegundo");
            milisegundo.setSymbol("ms");
            milisegundo.setNum(1e3);
            super.add(milisegundo);


            microsegundo.setName("microsegundo");
            microsegundo.setSymbol("μs");
            microsegundo.setNum(1e6);
            super.add(microsegundo);


            siglo.setName("siglo");
            siglo.setSymbol("Sig");
            siglo.setDenom(3153600000.0);
            super.add(siglo);


            decenio.setName("decenio");
            decenio.setSymbol("Dec");
            decenio.setDenom(315360000);
            super.add(decenio);


            milenio.setName("milenio");
            milenio.setSymbol("Mil");
            milenio.setDenom(31536000000.0);
            super.add(milenio);
/* END CHANGES*/
        super.set_unit(unit); // SET selected
    }
    
    public Time(double qt){
        this(qt,Time.segundo);
    }
    
    public Time(){
        this(0,Time.segundo);
    }
}
