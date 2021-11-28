/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.latihan2;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Persegi extends BangunDatar{
    int s;
    Scanner Input = new Scanner(System.in);
    @Override
    public void LUASPP() {
    }
    @Override
    public void KELILINGPP() {
    }

    @Override
    public void LUASP() {
        System.out.println("Menghitung Luas Persegi");
        System.out.print("Sisi : ");s = Input.nextInt();
        int l = s*s;
        System.out.println("Luas Persegi Panjang adalah : " + l);
        System.out.print("\n");
    }

    @Override
    public void KELILINGP() {
        System.out.println("Menghitung Keliling Persegi");
        System.out.print("sisi : ");s = Input.nextInt();
        int k = s*4;
        System.out.println("Keliling Persegi adalah : " + k);
        System.out.print("\n");
    }
    
}
