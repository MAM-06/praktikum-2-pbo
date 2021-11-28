/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.latihan1;

/**
 *
 * @author MAM
 */
public class Main {
    public static void main(String[]args){
        laptop a = new laptop("","","");
        System.out.println("Laptop \n" + a.getlihatSpec());
        System.out.println("=============================");
        
        PC b = new PC("","","");
        System.out.println("PC \n" + b.getlihatSpec());
        System.out.println("=============================");
        
        netbook c = new netbook("","","");
        System.out.println("Netbook \n" + a.getlihatSpec());
        System.out.println("=============================");
    }
    
}
