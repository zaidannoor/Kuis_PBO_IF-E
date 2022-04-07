/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // deklarasi scanner input
        int pilih;
        String nama;
        int usia;
        
        float skj,rd,kds;
        float ske,tk,kdt;
        
        while(true){
            System.out.println("+-------------------------------+");
            System.out.println("|Pendaftaran Beasiswa PT. Benang|");
            System.out.println("+-------------------------------+");
            System.out.println("Terdapat 2 program beasiswa yang dibuka");
            System.out.println("    1. Beasiwa Pelajar");
            System.out.println("    2. Beasiswa Mahasiswa");
            System.out.print("Pilih Beasiswa yang didaftar : ");
            pilih = input.nextInt();

            if (pilih == 1) {
                System.out.println("");
                System.out.println("===Form Pendaftaran===");
                System.out.print("Nama Lengkap : ");
                nama = input.next();
                System.out.print("Usia : ");
                usia = input.nextInt();
                Pengguna user = new Pengguna(nama,usia);

                System.out.println("===Form Penilaian===");
                System.out.println("Keterangan: Nilai yang valid adalah 0-100");
                System.out.print("Nilai Struktur dan konten Essai : ");
                ske = input.nextFloat();
                System.out.print("Nilai Teknik Visualisasi : ");
                tk = input.nextFloat();
                System.out.print("Nilai Kemampuan Design Thinking : ");
                kdt = input.nextFloat();
                
                while(true){
                    System.out.println("+++ Menu +++");
                    System.out.println("1. Tampilkan Hasil");
                    System.out.println("2. Ubah Nilai");
                    System.out.println("3. Keluar");
                    System.out.print("Pilih : ");
                    pilih = input.nextInt();

                    if (pilih == 1) {
                        user.hasilAkhirPelajar(ske,tk,kdt);
                    }
                    else if(pilih == 2){
                        System.out.println("Edit Data");
                        System.out.print("Nilai Struktur dan konten Essai : ");
                        ske = input.nextFloat();
                        System.out.print("Nilai Teknik Visualisasi : ");
                        tk = input.nextFloat();
                        System.out.print("Nilai Kemampuan Design Thinking : ");
                        kdt = input.nextFloat();
                    }
                    else if(pilih == 3){
                        System.exit(0);
                    }
                    else{
                        System.out.println("Masukkan angka 1 atau 2 saja");
                    }
                }
                

            }
            
            
            
            else if(pilih == 2){

            }
            else{
                System.out.println("Masukkan angka 1 atau 2 saja");
            }

        }
    }
        
}
