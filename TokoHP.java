/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project.post_test1;

/**
 *
 * @author NITRO 5
 */

import java.util.ArrayList;

public class TokoHP {
    private ArrayList<String> daftarHP;

    public TokoHP() {
        daftarHP = new ArrayList<>();
    }

    public void tambahHP(String hp) {
        daftarHP.add(hp);
    }

    public void tampilkanDaftarHP() {
        System.out.println("Daftar ponsel yang dijual di Toko HP : ");
        for (String hp : daftarHP) {
            System.out.println(hp);
        }
    }

    public static void main(String[] args) {
        TokoHP toko = new TokoHP();
        toko.tambahHP("Samsung Galaxy S23 Ultra 5G");
        toko.tambahHP("Google Pixel 7 Pro");
        toko.tambahHP("Realme 10 Pro 5G");
        toko.tambahHP("OnePlus 11 5G");
        toko.tambahHP("Asus ROG Phone 6 Pro");

        toko.tampilkanDaftarHP();
    }
}
