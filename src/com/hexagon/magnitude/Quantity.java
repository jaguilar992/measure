package com.hexagon.magnitude;

import com.hexagon.magnitude.Unit;

/**
 * Created by jaguilar992 on 15/12/2016.
 */
public class Quantity {
    private Unit unit;
    private String name;
    private String output;
    private double val;


    public Quantity(double val, Unit unit){
        this.unit=unit;
        this.name=unit.getName();
        this.output=unit.show(val);
        this.val=val;
    }


    public Unit getUnit() {
        return unit;
    }

    public String getName() {
        return name;
    }

    public String getOutput() {
        return output;
    }

    @Override
    public String toString() {
        return "Quantity{" + "unit=" + getUnit() + ", output=" + getOutput() + '}';
    }

    /**
     * @param unit the unit to set
     */
    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param output the output to set
     */
    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * @return the val
     */
    public double getVal() {
        return val;
    }

    /**
     * @param val the val to set
     */
    public void setVal(double val) {
        this.val = val;
    }
    
    
}
