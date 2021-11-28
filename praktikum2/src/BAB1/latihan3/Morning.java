/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAB1.latihan3;

/**
 *
 * @author MAM
 */
public class Morning extends SecurityGuard {
    String x = " his master " ;
    
    @Override
    public void Say() {
        System.out.println("================");
        System.out.println( "When Meet"+x );
        System.out.println("Good morning Sir!");
   }
}