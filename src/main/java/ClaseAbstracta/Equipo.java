/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbstracta;

/**
 *Cree una clase abstracta llamada Equipo, que contenga los siguientes métodos abstractos: getEquipo, getCapitan
 *Declare 3 clases con diferentes paises extendiendo de la clase Equipo, por ejemplo: RealMadrid, Barcelona, Liverpool, etc.
 *En la clase que contiene el método principal (main), imprimir el nombre de los equipos y su presidente
 * @author Marlon Galo
 */
public abstract class Equipo {
    
    //Declaracion de un metodo abstracto
   public abstract String getEquipo();
   public abstract String getCapitan();
}
