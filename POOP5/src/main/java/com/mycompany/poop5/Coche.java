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
public class Coche{
    String marca;
    String modelo;
    String color;
    int anioo;
    int kilometraje;
    boolean estandar;
    
    private Persona chofer;
    private Persona copiloto;
    private Persona pasajero1;
    private Persona pasajero2;

    public Coche() {
    }

    public Coche(String marca, String modelo, String color, int anioo, int kilometraje, boolean estandar, Persona chofer, Persona copiloto, Persona pasajero1, Persona pasajero2) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.anioo = anioo;
        this.kilometraje = kilometraje;
        this.estandar = estandar;
        this.chofer = chofer;
        this.copiloto = copiloto;
        this.pasajero1 = pasajero1;
        this.pasajero2 = pasajero2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnioo() {
        return anioo;
    }

    public void setAnioo(int anioo) {
        this.anioo = anioo;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public boolean isEstandar() {
        return estandar;
    }

    public void setEstandar(boolean estandar) {
        this.estandar = estandar;
    }
    
    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public Persona getCopiloto() {
        return copiloto;
    }

    public void setCopiloto(Persona copiloto) {
        this.copiloto = copiloto;
    }

    public Persona getPasajero1() {
        return pasajero1;
    }

    public void setPasajero1(Persona pasajero1) {
        this.pasajero1 = pasajero1;
    }

    public Persona getPasajero2() {
        return pasajero2;
    }

    public void setPasajero2(Persona pasajero2) {
        this.pasajero2 = pasajero2;
    }
    
    public void irAUnLugar(String lugar){
        System.out.println("Estoy llendo a "+lugar);
    }
    
    public void venderCarro(String comprador){
        System.out.println("Vendi mi coche a "+comprador);
    }
    
    public void gasolina(int porcentaje){
        System.out.println("Tengo "+porcentaje+"% de gasolina");
    }
    
    public void servicio(){
        if(kilometraje >50_000){
            System.out.println("El carro necesita servicio");
        }else{
            System.out.println("Aun falta para ir a servicio, no te preocupes");
        }
    }
    
    public void recorridoEnTiempo(float tiempoHoras){
        System.out.println("El tiempo del trayecto es "+tiempoHoras+" horas");
    }

    @Override
    public String toString() {
        return "Coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", anioo=" + anioo + ", kilometraje=" + kilometraje + ", estandar=" + estandar + ", el chofer es: " + chofer + ", el copiloto es: " + copiloto + ", el pasajero1 es: " + pasajero1 + ", el pasajero2 es: " + pasajero2 + '}';
    }   
}