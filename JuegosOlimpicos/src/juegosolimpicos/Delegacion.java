/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegosolimpicos;

/**
 *
 * @author David
 */
public class Delegacion {

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public int getNumDeportistas() {
        return numDeportistas;
    }

    public void setNumDeportistas(int numDeportistas) {
        this.numDeportistas = numDeportistas;
    }

    public int getMedOro() {
        return medOro;
    }

    public void setMedOro(int medOro) {
        this.medOro = medOro;
    }

    public int getMedPlata() {
        return medPlata;
    }

    public void setMedPlata(int medPlata) {
        this.medPlata = medPlata;
    }

    public int getMedBronce() {
        return medBronce;
    }

    public void setMedBronce(int medBronce) {
        this.medBronce = medBronce;
    }
    private String Pais;
    private int numDeportistas;
    private int medOro;
    private int medPlata;
    private int medBronce;
    
}
