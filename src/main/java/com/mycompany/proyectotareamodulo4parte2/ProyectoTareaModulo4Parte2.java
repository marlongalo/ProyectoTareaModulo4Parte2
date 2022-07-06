/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyectotareamodulo4parte2;

import ClaseAbstracta.Espana;
import ClaseAbstracta.Francia;
import ClaseAbstracta.Italia;

/**
 *Cree una clase abstracta llamada Equipo, que contenga los siguientes métodos abstractos: getEquipo, getCapitan
 *Declare 3 clases con diferentes paises extendiendo de la clase Equipo, por ejemplo: RealMadrid, Barcelona, Liverpool, etc.
 *En la clase que contiene el método principal (main), imprimir el nombre de los equipos y su capitan 
 * @author Marlon Galo
 */
public class ProyectoTareaModulo4Parte2 {

public static void main(String[] args){
    Italia i= new Italia();
    Espana e = new Espana();
    Francia f = new Francia();
    
    System.out.println("El club: " +i.getEquipo() +" tiene como capitan a: " +i.getCapitan());
    System.out.println("El club: " +e.getEquipo() +" tiene como capitan a: " +e.getCapitan());
    System.out.println("El club: " +f.getEquipo() +" tiene como capitan a: " +f.getCapitan());
    
    
}


    
}
