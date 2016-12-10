/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hexagon.measure;

/**
 *
 * @author jaguilar992
 */
public class Magnitude{
        private String name;
	private double qt;
        private int sel_ud = 0;
	private int  def_ud =0;
        private List units = new List();
        private double values [] = new double[List.N];

        public Magnitude(double qt) {
            this.qt = qt;
            this.values[this.sel_ud]=this.qt;
        }
        
        public List uds(){
            return this.units;
        }
        
        public double[] vals(){
            return this.values;
        }
        
        public void add(Unit unit){
            this.units.add(unit);
        }
        
        public void zero(Unit unit) {
        this.units.zero(unit);
    }
        
        
        public void setDefault(int index){
            this.def_ud=index;
        }
               
	public double getQt(){
		return this.qt;
	}

	public void setQt(double qt){
		this.qt=qt;
                this.values[this.sel_ud]=qt;
                this.setDefault();
                this.calculate();
	}
        
        public Unit set_unit(int index){
            if(!this.units.Empty(index)){
                this.sel_ud=index;
                this.values[this.sel_ud]=this.qt;
                this.setDefault();
                this.calculate();
                return (Unit) units.read(index);
            }
            return null;
        }
        
        public Unit set_unit(Unit unit){
            if (this.units.search(unit)!=-1) {
                return this.set_unit(this.units.search(unit));
            }
            return null;
        }
        
        public double convert(Unit unit){
            //Unit set_unit = (Unit) units.read(this.def_ud);
            this.setDefault();
            double factor = unit.getNum() / unit.getDenom();
            double value = this.values[unit.getRef()];
            double exit_value;
            
            if (unit.getExpo()!=1){
                 exit_value = factor * Math.pow(value + unit.getIntern(),unit.getExpo())+ unit.getExtern();
            }
            else{
                exit_value = factor * (value + unit.getIntern())+ unit.getExtern();
            }   
            this.values[this.units.search(unit)]=exit_value;
            return exit_value;
        }
        
        public double setDefault(){
            Unit unit = (Unit) units.read(this.sel_ud);
            double factor = unit.getDenom() / unit.getNum();
            this.values[this.def_ud]=factor*Math.pow((this.qt - unit.getExtern() ), 1/unit.getExpo())- unit.getIntern();
            return this.values[this.def_ud];
        }
        
        public void calculate(){
            for (int i = 0; i < List.N; i++) {
                if (!this.units.Empty(i) && i!=this.sel_ud && i!=this.def_ud) {
                    this.convert((Unit)this.units.read(i));
                }
            }
        }
        
        
        @Override
        public String toString(){
            String result="";
            for (int i = 0; i < List.N; i++) {
                if (!this.units.Empty(i)){
                    Unit current = (Unit) this.units.read(i);
                    result+=i+".- "+current.getName()+"\t "+this.values[i]+" "+current.getSymbol()+"\n";
                }
            }
            return result;
        }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
}
