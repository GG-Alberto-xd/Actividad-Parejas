package com.mycompany.empresa;

public class Tecnico extends Empleado{
    public Tecnico (String nombre){
        super(nombre);
    }
    
    @Override
    public String toString(){
        return super.toString() + " -> Tecnico";
    }
}
