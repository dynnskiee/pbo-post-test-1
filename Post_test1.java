/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package project.post_test1;

/**
 *
 * @author NITRO 5
 */
public class Post_test1 {

     public static void main(String[] args) {
        TokoHP toko = new TokoHP();
        toko.tambahHP("Samsung Galaxy S23 Ultra 5G");
        toko.tambahHP("Google Pixel 7 Pro");
        toko.tambahHP("Realme 10 Pro 5G");
        toko.tambahHP("OnePlus 11 5G");
        toko.tambahHP("Asus ROG Phone 6 Pro");

        System.out.println("Selamat Datang di Toko HP");
        toko.tampilkanDaftarHP();
    }
}
