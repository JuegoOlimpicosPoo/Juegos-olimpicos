/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;


public class Delegacion {
    private String pais;
    private int deportistas;
    private int oro;
    private int plata;
    private int bronce;

    public Delegacion(String pais, int deportistas, int oro, int plata, int bronce) {
        this.pais = pais;
        this.deportistas = deportistas;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getDeportistas() {
        return deportistas;
    }

    public void setDeportistas(int deportistas) {
        this.deportistas = deportistas;
    }

    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public int getPlata() {
        return plata;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }
    
}
