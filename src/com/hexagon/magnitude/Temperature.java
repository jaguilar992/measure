/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this  file, choose Tools | Templates
 * and open in the editor.
 */
package com.hexagon.magnitude;

/**
 *
 * @author jaguilar992
 */
public class Temperature extends Magnitude{
	private String name = "temperature";
	// public static Unit unit = new Unit()
	public static Unit celsius= new Unit();	
	public static Unit fahrenheit= new Unit();
	public static Unit kelvin = new Unit();
	public static Unit rankine = new Unit();
	public static Unit gas_mark = new Unit();
    
    public Temperature(double qt , Unit unit){
        super(qt); // qt METERS
        super.setName(name);
        
/** INIT CHANGES */
// super.zero
// super.add
	celsius.setName("celsius");
	celsius.setSymbol("°C");
	super.zero(celsius);

	fahrenheit.setName("fahrenheit");
	fahrenheit.setSymbol("°F");
	fahrenheit.setNum(9);
	fahrenheit.setDenom(5);
	fahrenheit.setExtern(32);
	super.add(fahrenheit);

	kelvin.setName("kelvin");
	kelvin.setSymbol("K");
	kelvin.setExtern(273.15);
	super.add(kelvin);

	rankine.setName("Rankine");
	rankine.setSymbol("R");
	rankine.setRef(super.search_unit(Temperature.kelvin));
	rankine.setNum(9);
	rankine.setDenom(5);
	super.add(rankine);

	gas_mark.setName("gas_mark");
	gas_mark.setSymbol("gas mark");
	gas_mark.setRef(super.search_unit(Temperature.fahrenheit));
	gas_mark.setDenom(25);
	gas_mark.setIntern(-250);
	// super.add(gas_mark); // NO funciona debajo de 1 gas mark, Nuevo algoritmo??
	// 1/2 --> 250 F 
	// 1/4 --> 225 F
       
/** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    
    public Temperature(double qt){
        this(qt,Temperature.kelvin);
    }
    
    public Temperature(){
        this(0,Temperature.kelvin);
    }
}
