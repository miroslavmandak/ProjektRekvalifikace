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
public class GateWay {
    
    private Pojistovna pojistovna;
    
    
    public GateWay(Pojistovna pojistovna) {
        this.pojistovna = pojistovna;
    }
    
    
    public void vypisNabidku(){
    System.out.println("");    
    System.out.println("-------------------------------------------");    
    System.out.println("Evidence pojištěných");
    System.out.println("-------------------------------------------");
    System.out.println("");
    System.out.println("Vyberte akci: ");
    System.out.println("1 - Přidat nového pojištěného  ");
    System.out.println("2 - Vypsat všechny pojištěné  ");
    System.out.println("3 - Vyhledat pojištěného  ");
    System.out.println("4 - Konec  ");
    }

    Scanner sc = new Scanner(System.in, "Windows-1250");
    int volba = 0;
    
public void cyklus() {    
while (volba != 4) {
    
    vypisNabidku();

    
    boolean pokracovat = true;
    try {
    volba = Integer.parseInt(sc.nextLine());        
    switch (volba) {
        case 1:
            pojistovna.vlozKlienta();
            break;
        case 2:
            pojistovna.vypisPojistence(pojistovna.getPojistenci());
            break;
        case 3:
            pojistovna.najdiPojistence();
            break;
        case 4:
            volba = 4;
            break;
        default:
            System.out.println("Neplatná volba");
            break;
        }
    pokracovat = false;
    } catch (Exception e) {
        System.out.println("Neplatná volba");
    }     
    }
    
}
}    
    
    
    
    
    
    

