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
public class Main {
    public static void main (String[]args){
        registration r = new registration();
        garage g = new garage();
        owner o = new owner();
        
        r.detail();
        r.setLicense("AG 0611 MM");
        System.out.println(r.getLicense());
        r.currentTown();
        r.venicleID();
        r.taxDue();
        
        g.detail();
        g.setLicense("AG 0611 MM");
        System.out.println(g.getLicense());
        g.workDesc();
        g.billingIn();
        g.owner();
        
        r.detail();
        r.setLicense("AG 0611 MM");
        System.out.println(r.getLicense());
        r.currentTown();
        r.venicleID();
        r.taxDue();
        
        o.detail();
        o.carDesc();
        o.petrolMilHis();
        o.serviceHis();
    }
}
