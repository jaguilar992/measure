
import com.hexagon.magnitude.Area;

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
        Area m = new Area();
	
	//Distance m = new Distance();
	//Temperature m = new Temperature();
	m.setQt(1);
	//m.set_unit(Temperature.fahrenheit);
	//m.set_unit(Area.diam_metro);
        //m.setQt(1);
        //m.set_unit(Area.mz);
        System.out.println(m);
	
	System.out.println(m.uds()[11]);
	System.out.println(m.vals()[11]);
	
    }
    
    public static void line(){
        System.out.println();
    }
}

