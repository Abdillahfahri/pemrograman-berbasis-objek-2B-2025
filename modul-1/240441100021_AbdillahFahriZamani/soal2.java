/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul1;

//untuk membaca input dari pengguna
import java.util.Scanner;

public class soal2 {
    // Atribut
    String nama;
    String nim;
    String jurusan;
    String alamat;

    //konstruktor 
    public soal2(String nama, String nim, String jurusan, String alamat) {
        //memyimmpan input ke dalam variabel
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    //method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println("\nData Mahasiswa:");
        System.out.println("Nama     : " + nama);
        System.out.println("NIM      : " + nim);
        System.out.println("Jurusan  : " + jurusan);
        System.out.println("Alamat   : " + alamat);
    }

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //input data mahasiswa 1
        System.out.println("\nMasukkan data mahasiswa 1:");
        System.out.print("Nama: ");
        String nama1 = input.nextLine();
        System.out.print("NIM: ");
        String nim1 = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan1 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat1 = input.nextLine();
        soal2 mahasiswa1 = new soal2(nama1, nim1, jurusan1, alamat1);

        //input data mahasiswa 2
        System.out.println("\nMasukkan data mahasiswa 2:");
        System.out.print("Nama: ");
        String nama2 = input.nextLine();
        System.out.print("NIM: ");
        String nim2 = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan2 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat2 = input.nextLine();
        soal2 mahasiswa2 = new soal2(nama2, nim2, jurusan2, alamat2);

        //input data mahasiswa 3
        System.out.println("\nMasukkan data mahasiswa 3:");
        System.out.print("Nama: ");
        String nama3 = input.nextLine();
        System.out.print("NIM: ");
        String nim3 = input.nextLine();
        System.out.print("Jurusan/Prodi: ");
        String jurusan3 = input.nextLine();
        System.out.print("Alamat: ");
        String alamat3 = input.nextLine();
        soal2 mahasiswa3 = new soal2(nama3, nim3, jurusan3, alamat3);

        //menampilkan data mahasiswa
        mahasiswa1.tampilkanInfo();
        mahasiswa2.tampilkanInfo();
        mahasiswa3.tampilkanInfo();
    }
}