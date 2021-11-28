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
public class netbook extends komputer{
    private String spesifikasi,processor,listrik;
    
    public netbook(String spesifikasi,String processor,String listrik){
        this.spesifikasi = "Spesifikasi : HP Stream 11-ak0012dx 1.6 diagonal HD SVA anti-glare WLED-backlit\n";
        this.processor = "Processor   : Intel® Celeron® N4000\n";
        this.listrik = "Daya        : 25wat";
    }

    @Override
    String getlihatSpec() {
        return spesifikasi+processor+listrik;
    }
    
}
