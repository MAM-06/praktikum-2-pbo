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
public abstract class car {
    String license;
    
    abstract void detail();
    
    public String getLicense(){
        return license;
    }
    public void setLicense(String license){
        this.license = license;
    }
}
