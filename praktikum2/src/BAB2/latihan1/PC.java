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
public class PC extends komputer{
    private String spesifikasi,processor,listrik;
    
    public PC(String spesifikasi,String processor,String listrik){
        this.spesifikasi = "Spesifikasi : DA WARRIOR I7 RTX 2060 NB SERIES  RAM 8GB x 2 (16GB) DDR4\n";
        this.processor = "Processor   : Intel i7 10700\n";
        this.listrik = "Daya        : 320wat";
    }

    @Override
    String getlihatSpec() {
        return spesifikasi+processor+listrik;
    }
    
}
