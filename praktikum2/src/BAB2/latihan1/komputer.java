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
abstract class komputer {
    String spesifikasi,processor,listrik;
    void setspesifikasi (String spesifikasi){
        this.spesifikasi = spesifikasi;
    }
    void setprocessor (String processor){
        this.processor = processor;
    }
    void setlistrik (String listrik){
        this.listrik = listrik;
    }
    String getspesifikasi(){
        return spesifikasi;
    }
    String getprocessor(){
        return processor;
    }
    String getlistrik(){
        return listrik;
    }
    abstract String getlihatSpec();
}
