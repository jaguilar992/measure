/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.hexagon.magnitude.Distance;

/**
 *
 * @author jaguilar992
 */
public class Test2 {
    public static void main(String[] args) {
        
        Distance largo = new Distance(32);
        largo.set_unit(Distance.pie);
        System.out.println(largo);
      //  line();
      
        
    }
    
    public static void line(){
        System.out.println();
    }
}
