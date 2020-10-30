package com.latihan;

// mengimpor Scanner ke program
import java.util.Scanner;

/*
 * @author
 * Nama              : M Ikhlas N R
 * Kelas             : IF-1
 * NIM               : 10119022
 * Deskripsi Program : Program Rata Rata Nilai Latihan 21
 *
 */

public class RataRataNilai {
    public static void main(String[] args) {
        // membuat scanner baru
        Scanner keyboard = new Scanner(System.in);

        // deklarasi variabel
        int banyakMhs;
        float jumlahNilai = 0, nilaiMhs, rataRata;

        // Tampilkan output ke user
        System.out.print("Masukkan Banyak Mahasiswa : ");
        banyakMhs = keyboard.nextInt();

        for (int i = 1; i <= banyakMhs; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilaiMhs = keyboard.nextFloat();
            jumlahNilai += nilaiMhs;
        }

        rataRata = jumlahNilai / banyakMhs;

        System.out.println("Maka, Rata=rata Nilainya adalah " + rataRata);
        System.out.println("Developed by Rizki Adam Kurniawan");
    }
}
