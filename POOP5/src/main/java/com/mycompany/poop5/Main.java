/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop5;

/**
 *
 * @author Matias Melissa
 */
public class Main {
    public static void main(String[] args){
        //Getters Seters
        Circulo cir = new Circulo();
        cir.setRadio(5);
        System.out.println(cir);
        System.out.println("Radio de cir = "+cir.getRadio());
        cir.setRadio((float)7.2);
        cir.setRadio(8.9f);
        
        float var=5;
        cir.setRadio(-7);
        System.out.println(cir);
        System.out.println("#####Composicion#####");
        
        Persona persona1 = new Persona();
        persona1.setNombre("Axel");
        persona1.setApellido("Breton");
        Fecha fNac = new Fecha(17,7,2001);
        persona1.setfNacimiento(fNac);
        System.out.println(persona1);
        
        System.out.println("#####Composición2#####");
        Fecha fNac2 = new Fecha(4,7,2002);
        Persona persona2 = new Persona("Melissa","Matias",fNac2);
        System.out.println(persona2);
        
        System.out.println("#####Composicio3#####");
        Persona persona3 = new Persona("Liliana","Fuentes",22,4,1998);
        System.out.println(persona3);
        
        System.out.println("#####Coche#####");
        Persona chofer = new Persona("Alejanda","Zavala",12,5,1968);
        Persona copiloto = new Persona("Melissa","Matias",4,7,2002);
        Persona pasajero1 = new Persona("Axel","Nicolás",17,7,2001);
        Persona pasajero2 = new Persona("Nadia","Sanchez",12,11,2002);
        Coche coche1 = new Coche("toyota","6844MG","negro",20019,1675,true,chofer,copiloto,pasajero1,pasajero2);
        System.out.println(coche1);
        coche1.servicio();
        coche1.gasolina(100);
        coche1.irAUnLugar("Facultad de Ingeniería");
        coche1.venderCarro("Marco Diaz");
        coche1.recorridoEnTiempo((float)3.2);
        coche1.recorridoEnTiempo(3.6f);
    }
}