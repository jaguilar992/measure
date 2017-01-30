
import com.hexagon.magnitude.CompoundUnit;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jaguilar992
 */
public class Test3 {
    public static void main(String[] args) {
        CompoundUnit c = new CompoundUnit();
        c.setSymbol("mi+ft+in");
        c.add_factor(5280);
        c.add_factor(12);
        
        System.out.println(c.show(78.0018));
        System.out.println(1/3.0);
    }
}
