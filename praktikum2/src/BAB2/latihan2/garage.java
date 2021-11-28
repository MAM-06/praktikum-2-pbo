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
public class garage extends car {

    @Override
    void detail() {
        System.out.println("Garage : ");
    }
    void workDesc(){
        System.out.println("Software Update");
    }
    void billingIn(){
        System.out.println("$ 65");
    }
    void owner(){
        System.out.println("First owner ");
    }
}
