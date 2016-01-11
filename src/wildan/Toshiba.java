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
public class Toshiba extends Laptop{
    
   public void tampilkan(){
  String ram ="2";
  String warna="hitam";
  String harga ="6000000";
               
       Laptop a=new Laptop();
       a.inputData("intel","corei3");
      a.tampilkanData();
        
        
         System.out.println("ram:"+ram);
         System.out.println("warna"+warna);
         System.out.println("harga"+harga);
    }      
       
       
}
