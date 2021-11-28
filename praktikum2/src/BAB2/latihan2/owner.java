/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB2.latihan2;

/**
 *
 * @author MAM
 */
public class owner extends car{

    @Override
    void detail() {
        System.out.println("Owner : ");
    }
    void carDesc(){
        System.out.println("This car is full electric and power full");
    }
    void serviceHis(){
        System.out.println("Upgrade Software");
    }
    void petrolMilHis(){
        System.out.println("15.00 mil");
    }
}
