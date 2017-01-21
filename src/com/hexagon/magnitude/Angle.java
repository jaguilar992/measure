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
public class Angle extends Magnitude{
    public static Unit grado = new Unit();
    public static Unit radian = new Unit();
    public static Unit gradian = new Unit();
    public static CompoundUnit grad_min_sec = new CompoundUnit();
    public static Radian radian_2 = new Radian();
    
    public Angle(double qt, Unit unit){
        super(qt); // qt grados
        super.setName("angulo");
        
/** END CHANGES */
           grado.setName("grado");
           grado.setSymbol("°");
           super.zero(grado);
           
           radian.setName("radian");
           radian.setSymbol("rad");
           radian.setNum(Math.PI);
           radian.setDenom(180);
           super.add(radian);
           
           radian_2.setName("radian_2");
           radian_2.setSymbol("rad");
           radian_2.copy_values(radian);
           super.add(radian_2);
           
           gradian.setName("gradian");
           gradian.setSymbol("grad");
           gradian.setNum(400);
           gradian.setDenom(360);
           super.add(gradian);
           
           grad_min_sec.setName("grad_min_sec");
           grad_min_sec.setSymbol("°+'+\"");
           grad_min_sec.add_factor(60);
           grad_min_sec.add_factor(60);
           super.add(grad_min_sec);
/** END CHANGES */
        super.set_unit(unit); // SET selected
    }
    public Angle(double qt){
        this(qt,Angle.grado);
    }
    
    public Angle(){
        this(0,Angle.grado);
    }
            
}
