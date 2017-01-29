/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagon.magnitude;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/**
 *
 * @author jaguilar992
 */
public class Magnitude{
    private String name;
    private double qt;
    private int sel_ud = 0;
    private final int def_ud =0;
    private final Unit[] units = new Unit[1000];
    private final double values [] = new double[1000];
    private int c=1;
    ArrayList<Integer> ref_tree;
    
    private final HashMap<String,Quantity> dict = new HashMap<>();

    public Magnitude(double qt) {
        this.qt = qt;
        this.values[this.sel_ud]=this.qt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Unit[] uds(){
        return this.units;
    }

    public double[] vals() {
        return this.values;
    }

    public String[] symbs() {
        String [] symbs = new String[this.c];
        for (int i = 0; i <this.c ; i++) {
            symbs[i]=this.uds()[i].getSymbol();
        }
        return symbs;
    }

    public int search_symbol(String symbol){
        for (int i = 0; i < this.c; i++) {
            if (this.units[i].getSymbol().equals(symbol)) {
                return i;
            }
        }
        return -1;
    }

    public int search_name(String name){
        for (int i = 0; i < this.c; i++) {
            if (this.units[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }
    
    public int search_unit(Unit unit) {
        String n = unit.getName();
        for (int i = 0; i < this.c; i++) {
            if (this.units[i].getName().equals(n)) {
                return i;
            }
        }
        return -1;
    }

    public void add(Unit unit){
        this.units[this.c]=unit;
        this.c++;
    }

    public void zero(Unit unit) {
        this.units[this.def_ud]=unit;
    }

    public void setQt(double qt){
            this.qt=qt;
            this.values[this.sel_ud]=qt;
            this.setDefault();
            this.calculate();
    }

    public Unit set_unit(int index){
        if(index>=0 && index<this.c){
            this.sel_ud=index;
            this.values[this.sel_ud]=this.qt;
            this.setDefault();
            this.calculate();
            return (Unit) units[index];
        }
        return null;
    }

    public Unit set_unit(Unit unit){
        if (this.search_unit(unit)!=-1) {
            return this.set_unit(this.search_unit(unit));
        }
        return null;
    }

    public Unit set_unit(String symbol){
        int index = this.search_symbol(symbol);
        if (index!=-1) {
            return this.set_unit(index);
        }
        return null;
    }

    private double convert(Unit unit){
        double factor = unit.getNum() / unit.getDenom();
	double factorI = unit.getNumI() / unit.getDenomI();
        double value = this.values[unit.getRef()];
        double exit_value;

	exit_value = factor * Math.pow(factorI*value + unit.getIntern(),unit.getExpo())+ unit.getExtern();  
        this.values[this.search_unit(unit)]=exit_value;
        return exit_value;
    }

    private double setDefault(){
        ref_tree = new ArrayList<>();
        ref_tree.add(this.sel_ud);//head
        int node = this.units[this.sel_ud].getRef();
        ref_tree.add(node);
        while (node!=0){
            node = this.units[node].getRef();
            ref_tree.add(node);
        }
        for (Integer i : ref_tree) {
            Unit u = this.units[i];
            double v = this.values[i];
            int ref = u.getRef();
            double factor = u.getDenom() / u.getNum();
	    double factorI = u.getDenomI() / u.getNumI();
            this.values[ref]=factorI*Math.pow(( factor* (this.values[i] - u.getExtern()) ), 1/u.getExpo())- u.getIntern();
        }
        return this.values[this.def_ud];
    }

    private void calculate(){
        for (int i = 0; i < this.c; i++) {
            if (!ref_tree.contains(i)) {
                    this.convert((Unit) this.units[i]);
            }
        }
        for (int i = 0; i <this.c ; i++) {
            Unit [] us = this.uds();
            double [] vs = this.vals();
            dict.put(us[i].getName(), new Quantity(vs[i],us[i]));
        }
    }

    public List<Quantity> qts(int order){ //0: abc , 1: zyx, 2: 123, 3: 987
        TreeMap<String,Quantity> sorted;
        switch(order){
            case 0:
                sorted= new TreeMap<>(this.dict);
                return new ArrayList<>(sorted.values());
            case 1:
                sorted = new TreeMap<>(Collections.reverseOrder());
                sorted.putAll(this.dict);
                return new ArrayList<>(sorted.values());
            case 2:
                List<Quantity> foo = new ArrayList<>(this.dict.values());
                Collections.sort(foo, new Comparator<Quantity>() {
                    @Override
                    public int compare(Quantity q1, Quantity q2) {
                        return (int)(q1.getVal() - q2.getVal());
                    }
                });

                return foo;
            case 3:
                List<Quantity> foo2 = new ArrayList<>(this.dict.values());
                Collections.sort(foo2, new Comparator<Quantity>() {
                    @Override
                    public int compare(Quantity q1, Quantity q2) {
                        return (int)(q2.getVal() - q1.getVal());
                    }
                });
                return foo2;
            default:
                sorted= new TreeMap<>(this.dict);
                return new ArrayList<>(sorted.values());
        }        
    }

    public List<Quantity> qts(){
        return qts(0);
    }

    @Override
    public String toString(){
        String result="";
        for (int i = 0; i < this.c; i++) {
                double value = this.values[i];
                result+=i+" "+this.units[i].show(value)+"<br>\n";
        }
        return result;
    }
    
    public int get_selected(){
        return this.sel_ud;
    }
}

