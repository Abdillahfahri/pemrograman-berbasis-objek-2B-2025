/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Modul1; /*deklarasi paket untk buat objek*/

public class Soal1 { /*variabel menyimpan informasi*/
    String nama;
    int umur;
    String alamat;

    public Soal1(String nama, int umur, String alamat) { /*konstruktor buat objek baru*/
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
     public String berjalan() { /*konstruktor*/
        return nama + " (umur " + umur + ", alamat " + alamat + ") sedang berjalan.";
    }

    public String berlari() {
        return nama + " (umur " + umur + ", alamat " + alamat + ") sedang berlari.";
    }
    
    public static void main(String[] args) {
        Soal1 manusia1 = new Soal1("RAFLY", 19, "SIDOARJO");
        Soal1 manusia2 = new Soal1("ISMA", 19, "SURABAYA");
        Soal1 manusia3 = new Soal1("FAHRI", 19, "JOMBANG"); 
        Soal1 manusia4 = new Soal1("YOGA", 19, "SIDOARJO");
        Soal1 manusia5 = new Soal1("HAIDAR", 19, "SIDOARJO");

        System.out.println(manusia1.berjalan());
        System.out.println(manusia2.berlari());
        System.out.println(manusia3.berjalan());
        System.out.println(manusia4.berlari());
        System.out.println(manusia5.berjalan());
    }
}
