/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challange1;
import java.util.Scanner;
/**
 *
 * @author asus
 */
public class Challange1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi
        double komisi;
        double jualbarang;
        double uangjasa;
        double total;
      
                //Scanner
                Scanner baca = new Scanner(System.in);
                 
        //input
        System.out.println("total penjualan anda");
        System.out.println("silahkan masukkan hasil penjualan anda");
        jualbarang = baca.nextInt();
        
        //golongan a/b/c/d/e
         System.out.println("/n~golongan~");
         if(jualbarang < 20000) {
            System.out.println("Selamat anda masuk golongan a");
            uangjasa = jualbarang + 10000;
            System.out.println("jualbarang " + "Rp." + jualbarang);
            System.out.println("/n~uang total~");
            total = Double.valueOf(uangjasa + (jualbarang * 10/100));
            System.out.println("uang total: " + total);
       
         } else if( jualbarang >= 20000) {
            System.out.println("Selamat anda masuk golongan B");
            uangjasa = jualbarang + 20000;
            System.out.println("jualbarang " + "Rp." + jualbarang);
            System.out.println("/n~uang total~");
            total = Double.valueOf(uangjasa + (jualbarang * 15/100));
            System.out.println("uang total: " + total);
        
         } else if( jualbarang >= 50000) {
            System.out.println("Selamat anda masuk golongan c");
            uangjasa = jualbarang + 30000;
            System.out.println("jualbarang " + "Rp." + jualbarang);
            System.out.println("/n~uang total~");
            total = Double.valueOf(uangjasa + (jualbarang * 20/100));
            System.out.println("uang total: " + total);
   
        } else if( jualbarang >= 100000) {
            System.out.println("Selamat anda masuk golongan c");
            uangjasa = jualbarang + 50000;
            System.out.println("jualbarang " + "Rp." + jualbarang);
            System.out.println("/n~uang total~");
            total = Double.valueOf(uangjasa + (jualbarang * 30/100));
            System.out.println("uang total: " + total);
            
        } else if( jualbarang >= 150000) {
            System.out.println("Selamat anda masuk golongan c");
            uangjasa = jualbarang + 75000;
            System.out.println("jualbarang " + "Rp." + jualbarang);
            System.out.println("/n~uang total~");
            total = Double.valueOf(uangjasa + (jualbarang * 40/100));
            System.out.println("uang total: " + total);
        }
    }
}
        
    
    

