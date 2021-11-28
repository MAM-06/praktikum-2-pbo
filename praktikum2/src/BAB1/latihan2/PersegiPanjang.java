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
public class PersegiPanjang extends BangunDatar{
   int l, p, l1, p2;
   Scanner Input = new Scanner(System.in);
    @Override
    public void LUASPP(){
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Lebar : ");l = Input.nextInt();
        System.out.print("Panjang : ");p = Input.nextInt();
        int h = l * p;
        System.out.println("Luas Persegi Panjang adalah : " + h);
        System.out.print("\n");
    }
    @Override
    public void KELILINGPP(){
        System.out.println("Menghitung Keliling Persegi Panjang");
        System.out.print("Lebar : ");l1 = Input.nextInt();
        System.out.print("Panjang : ");p2 = Input.nextInt();
        int h1 = l1 + p2;
        int h2 = h1 * 2;
        System.out.println("Keliling Persegi Panjang adalah : " + h2);
        System.out.print("\n");
    }   

    @Override
    public void LUASP() {
       }
    @Override
    public void KELILINGP() {
        }
}
