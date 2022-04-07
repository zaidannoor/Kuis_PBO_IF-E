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
            
        }
        else if(pilih == 2){
            
        }
        else{
            
        }
        
    }
}
