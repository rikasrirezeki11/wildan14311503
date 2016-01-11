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
public class Acer extends Laptop{
    public void tampilkan(){
        
       
       String ram ="2";
       String warna="putih";
       String harga="5000000";
               
       Laptop a=new Laptop();
       a.inputData("intel","corei3");
      a.tampilkanData();
        
        
         System.out.println("ram:"+ram);
         System.out.println("warna"+warna);
         System.out.println("harga"+harga);
    }
}
