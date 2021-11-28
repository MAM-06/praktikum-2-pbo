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
public class laptop extends komputer{
    private String spesifikasi,processor,listrik;
    
    public laptop(String spesifikasi,String processor,String listrik){
        this.spesifikasi = "Spesifikasi : ROG Strix SCAR 15 G532LV-I7R6C6T 15.6-inch Full HD IPS, 240 Hz\n";
        this.processor = "Processor   : Intel coreI7 11000\n";
        this.listrik = "Daya        : 25wat";
    }

    @Override
    String getlihatSpec() {
        return spesifikasi+processor+listrik;
    }
    
}
