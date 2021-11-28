/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author MAM
 */
public class Main {
    public static void main(String[] args) {
        Phone MI11ultra = new Xiaomi();
        Phone IphoneXR = new Iphone();
        Phone S21ultra = new Samsung();
        Phone FindX2pro = new Oppo();
        String pick;
        
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.println(" ~ Pilih Type HP Anda ~ ");
            System.out.println("[1] MI 11 ultra ");
            System.out.println("[2] Iphone XR ");
            System.out.println("[3] S21 ultra ");
            System.out.println("[4] Find X2 pro ");
            System.out.println("[0] Keluar");
            System.out.println("--------------------");
            System.out.print("Pilih > ");
            pick = input.nextLine();
            
            if(pick.equalsIgnoreCase("1")){
            PhoneUser MI = new PhoneUser(MI11ultra);
            MI.turnOnThePhone();
            String aksi; 

            while (true) {
            System.out.println("------------------");
            System.out.println("[1] Power ON ");
            System.out.println("[2] Power OFF ");
            System.out.println("[3] Volume + ");
            System.out.println("[4] Volume - ");
            System.out.println("[0] Tutup ");
            System.out.println("------------------");
            System.out.print("Pilih > ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                MI.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                MI.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                MI.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                MI.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                return ;
            } else {
                System.out.println("pilihan tidak tersedia");
            }
           }
          }
          
          if(pick.equalsIgnoreCase("2")){
            PhoneUser MI = new PhoneUser(IphoneXR);
            MI.turnOnThePhone();
            String aksi; 

            while (true) {
            System.out.println("------------------");
            System.out.println("[1] Power ON ");
            System.out.println("[2] Power OFF ");
            System.out.println("[3] Volume + ");
            System.out.println("[4] Volume - ");
            System.out.println("[0] Tutup ");
            System.out.println("------------------");
            System.out.print("Pilih > ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                MI.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                MI.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                MI.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                MI.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                return ;
            } else {
                System.out.println("pilihan tidak tersedia");
            }
           }
          }
          
          if(pick.equalsIgnoreCase("3")){
            PhoneUser MI = new PhoneUser(S21ultra);
            MI.turnOnThePhone();
            String aksi; 

            while (true) {
            System.out.println("------------------");
            System.out.println("[1] Power ON ");
            System.out.println("[2] Power OFF ");
            System.out.println("[3] Volume + ");
            System.out.println("[4] Volume - ");
            System.out.println("[0] Tutup ");
            System.out.println("------------------");
            System.out.print("Pilih > ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                MI.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                MI.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                MI.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                MI.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                return ;
            } else {
                System.out.println("pilihan tidak tersedia");
            }
           }
          }
          
          if(pick.equalsIgnoreCase("4")){
            PhoneUser MI = new PhoneUser(FindX2pro);
            MI.turnOnThePhone();
            String aksi; 

            while (true) {
            System.out.println("------------------");
            System.out.println("[1] Power ON ");
            System.out.println("[2] Power OFF ");
            System.out.println("[3] Volume + ");
            System.out.println("[4] Volume - ");
            System.out.println("[0] Tutup ");
            System.out.println("------------------");
            System.out.print("Pilih > ");
            aksi = input.nextLine();
            
            if(aksi.equalsIgnoreCase("1")){
                MI.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                MI.turnOffThePhone();
            } else if (aksi.equalsIgnoreCase("3")){
                MI.makePhoneLouder();
            } else if (aksi.equalsIgnoreCase("4")){
                MI.makePhoneSilent();
            } else if (aksi.equalsIgnoreCase("0")){
                return ;
            } else {
                System.out.println("pilihan tidak tersedia");
            }
           }
          }
        
        
        }

    }

}
