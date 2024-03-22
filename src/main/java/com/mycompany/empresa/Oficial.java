package com.mycompany.empresa;

public class Oficial extends Empleado{
    public Oficial (String nombre){
        super(nombre);
    }
    
    @Override
    public String toString(){
        return super.toString() + " -> Oficial";
    }
}