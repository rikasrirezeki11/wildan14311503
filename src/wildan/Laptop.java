/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wildan;

/**
 *
 * @author User
 */
public class Laptop {
  String jenis;  
  
  String tipe;


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
    
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public void tampilkanData(){
        System.out.println("jenis :"+getJenis());
        System.out.println("tipe:"+getTipe());
        
    }
    public void inputData(String jenis,String tipe){
        setJenis(jenis);
        
        setTipe(tipe);
    }   

          
}
