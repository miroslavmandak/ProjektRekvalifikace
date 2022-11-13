/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.pojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author miroslavmandak
 */
public class Pojistovna {

    private ArrayList<Pojistenec> pojistenci;
    private String nazevPojistovny;

    public Pojistovna(String nazevPojistovny) {
        this.nazevPojistovny = nazevPojistovny;
        ArrayList<Pojistenec> pojistenci = new ArrayList<>();
        this.pojistenci = pojistenci;             
    }

    Scanner sc = new Scanner(System.in, "Windows-1250");

    public ArrayList vlozKlienta() {
        System.out.println("Zadejte jméno pojištěného: ");
        String jmenoP = sc.nextLine();
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeniP = sc.nextLine();
        
        System.out.println("Zadejte věk pojištěného: ");
        int vekP = 0;
        boolean pokracovat = true;
        while (pokracovat) {
            try {
                vekP = Integer.parseInt(sc.nextLine());
                pokracovat = false;
            } catch (Exception e) {
                System.out.println("Nesprávně zadaný věk, zadejte ho znovu prosím:");
            }
        }

        System.out.println("Zadejte telefonní číslo pojištěného: ");
        pokracovat = true;
        int telefonP = 0;
        while (pokracovat) {
            try {
                telefonP = Integer.parseInt(sc.nextLine());
                pokracovat = false;
            } catch (Exception e) {
                System.out.println("Nesprávně zadané telefonní číslo, zadejte ho prosím znovu:");
            }
        }
        Pojistenec p = new Pojistenec(jmenoP, prijmeniP, vekP, telefonP);
        pojistenci.add(p);
        return pojistenci;
    }

    public void vypisPojistence(ArrayList<Pojistenec> pojistenci) {
        System.out.println();
        for (Pojistenec p : pojistenci) {
            System.out.println(p);
        }
    }

    public void najdiPojistence() {
        System.out.println("Zadejte jméno pojištěného: ");
        String jmenoP = sc.nextLine();
        System.out.println("Zadejte příjmení pojištěného: ");
        String prijmeniP = sc.nextLine();
        System.out.println();

        int pocet = 0;
        for (Pojistenec p : pojistenci) {
            if ((jmenoP.equalsIgnoreCase(p.getJmeno())) && (prijmeniP.equalsIgnoreCase(p.getPrijmeni()))) {
                System.out.println(p);
                pocet++;
            }
        }
        if (pocet == 0) {
            System.out.println("Uvedné jméno není v seznamu.");
        }
    }

    @Override
    public String toString() {
        String s = getNazevPojistovny();
        return s;
    }

    /**
     * @return the pojistenci
     */
    public ArrayList<Pojistenec> getPojistenci() {
        return pojistenci;
    }

    /**
     * @return the nazevPojistovny
     */
    public String getNazevPojistovny() {
        return nazevPojistovny;
    }

}
