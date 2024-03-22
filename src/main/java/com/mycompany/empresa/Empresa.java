package com.mycompany.empresa;

/*Pareja de POO
Perla Nayelli Romero Ramirez
Luis Alberto Pacheco Cortes
*/

public class Empresa {

    public static  void main(String[] args) {
    Empleado E1 = new Empleado ("Alex"); 
    Directivo D1 = new Directivo ("Alfonso"); 
    Operario OP1 = new Operario ("Perla"); 
    Oficial OF1 = new Oficial ("Victor"); 
    Tecnico T1 = new Tecnico ("Alberto"); 
    System.out.println(E1);
    System.out.println(D1);
    System.out.println(OP1);
    System.out.println(OF1);
    System.out.println(T1);
    }
}

