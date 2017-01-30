
import com.hexagon.magnitude.Area;
import com.hexagon.magnitude.Volumen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaguilar992
 */
public class Test2 {
    public static void main(String[] args) {
        //Area m = new Area();
	
        Volumen m = new Volumen();
        
	//Distance m = new Distance();
	//Temperature m = new Temperature();
	m.setQt(231);
        m.set_unit(Volumen.pulga3);
        //m.set_unit(Volumen.litro);
	//m.set_unit(Temperature.fahrenheit);
	//m.set_unit(Area.diam_metro);
        //m.setQt(1);
        //m.set_unit(Area.mz);
        System.out.println(m);
	
	System.out.println(1/3);
	System.out.println(1/3.0);
	
    }
    
    public static void line(){
        System.out.println();
    }
}

