/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package cz.itnetwork.pojisteni;

import java.util.ArrayList;

/**
 *
 * @author miroslavmandak
 */
public class Pojisteni {

    public static void main(String[] args) {
        
        Pojistovna pojistovna = new Pojistovna("Mirkova Pojišťovna");
        GateWay gateway = new GateWay(pojistovna);
        gateway.cyklus();
    }
}
