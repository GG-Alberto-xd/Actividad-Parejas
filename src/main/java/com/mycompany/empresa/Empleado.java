package com.mycompany.empresa;

public class Empleado {
    private String Nombre; 

    public Empleado(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    @Override
    public String toString(){
        return "Empleado: " + this.Nombre;
    }
    
}
