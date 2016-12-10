package com.hexagon.measure;

import java.io.Serializable;

public class List implements Serializable{
	//Estructura de guardado
	public static final int N=1000;
        private int len=0;
	private Object [] contenedor = new Object[N];
	public List(){};
	//Metodos
	public int add(Object objeto){
		for (int i=1;i<this.contenedor.length ; i++) {
			if (this.contenedor[i]==null) {
				this.contenedor[i]=objeto;
                                this.len++;
				return i;
			}
		}
		return -1;
	}
        
        public int zero(Object object){
                this.contenedor[0]=object;
                return 0;
        }
        
        public boolean set(int index, Object objeto){
            if (index>=0 && index<N){
                if (this.contenedor[index]!=null){
                    this.contenedor[index]=objeto;
                    return true;
                }
            }
            return false;
        }
                
	public boolean del(int index){
	    if (index>=0 && index<N) {
		this.contenedor[index]=null;
                this.len--;
		return true;
	    }
	    return false;
	}
	public int search(Object objeto){
		for (int i=0; i<this.contenedor.length; i++) {
			if (this.contenedor[i]!=null && this.contenedor[i].equals(objeto)) {
				return i;
			}
		}
		return -1;
	}
	public Object read(int index){
		if (index>=0 && index < this.contenedor.length ){
			return this.contenedor[index];
		}else{
			return null;
		}
	}

	public void listAll(){
            for (Object contenedor1 : this.contenedor) {
                if (contenedor1 != null) {
                    System.out.println(contenedor1);
                }
            }
	}
        
        public void listAll(boolean showIndexNumber){
            if (showIndexNumber==true) {
                for (int k = 0; k < this.contenedor.length; k++) {
                    if (this.contenedor[k] != null) {
                        System.out.println(k + " :: " + this.contenedor[k]);
                    }
                }
            }
	}

	public int getLength(){
		return this.len;
	}
        
        public boolean isEmpty(){
            for (Object object : this.contenedor) {
                if (object != null) {
                    return false;
                }
            }
            return true;
        }
        
        public boolean Empty(int index){
            if (index>0 && index<List.N ){
                return this.contenedor[index]==null;
            }else{
                return false;
            }
        }
}