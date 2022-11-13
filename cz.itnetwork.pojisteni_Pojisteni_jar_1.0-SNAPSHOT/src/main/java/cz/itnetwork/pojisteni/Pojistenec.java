/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.pojisteni;

import java.util.Scanner;

/**
 *
 * @author miroslavmandak
 */
public class Pojistenec {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefon;

    public Pojistenec(String jmeno, String prijmeni, int vek, int telefon) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    /**
     * @return the jmeno
     */
    public String getJmeno() {
        return jmeno;
    }

    /**
     * @return the prijmeni
     */
    public String getPrijmeni() {
        return prijmeni;
    }

    /**
     * @return the vek
     */
    public int getVek() {
        return vek;
    }

    /**
     * @return the telefon
     */
    public int getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        String s = "";
        s += String.format("%s %s, %d, %d", jmeno, prijmeni, vek, telefon);
        return s;
    }

}
