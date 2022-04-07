/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import app.beasiswa.BeasiswaMahasiswa;
import app.beasiswa.BeasiswaPelajar;
/**
 *
 * @author Lenovo
 */
public class Pengguna implements BeasiswaMahasiswa, BeasiswaPelajar {
    private String nama;
    private int usia;

    public Pengguna(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    
    public int seleksiUsia(){
        if (usia > 15 && usia < 25) {
            return 1;
        }
        else{
            return 0;
        }
    }
    
    @Override
    public int seleksiMahasiswa(float skj, float rd, float kps) {
        float total_nilai = (skj*0.6f) + (rd*0.25f) + (kps*0.15f);
        
        if (total_nilai > 87.4) {
            return 1;
        }
        else{
          return 0;  
        }
    }

    @Override
    public int seleksiPelajar(float ske, float tk, float kdt) {
        float total_nilai = (ske*0.5f) + (tk*0.2f) + (kdt*0.3f);
        
        if (total_nilai > 87.4) {
            return 1;
        }
        else{
          return 0;  
        }
    }
    
    public void hasilAkhirPelajar(float ske, float tk,float kdt){
        if(seleksiUsia() > 0){
            if (seleksiPelajar(ske,tk,kdt) > 0) {
                System.out.println("Selamat "+ nama + " (" + usia + " )tahun" + " anda dinyatakan lolos diterima seleksi beasiswa "
                    + "program pelajar");
                System.out.println("karena berhasil mencapai nilai yang diharapkan pada tahap seleksi");
                        
            }
            else{
                System.out.println("Mohon maaf "+ nama + " (" + usia + ")tahun" + " anda dinyatakan tidak"
                    + " diterima dalam beasiswa program pelajar");
                System.out.println("karena belum mencapai nilai yang diharapkan saat seleksi");
                       
            }
        }
        
        else{
            System.out.println("Mohon maaf "+ nama + " (" + usia + ")tahun" + " anda dinyatakan tidak"
                    + " diterima dalam beasiswa program pelajar");
            System.out.println("karena usia anda tidak memenuhi prasyarat penerima beasiswa");
                    
        }
    }
    
    public void hasilAkhirMahasiswa(float skj, float rd, float kps){
        if(seleksiUsia() > 0){
            if (seleksiMahasiswa(skj,rd,kps) > 0) {
                System.out.println("Selamat "+ nama + " (" + usia + " )tahun" + " anda dinyatakan lolos diterima seleksi beasiswa "
                    + "program mahasiswa");
                System.out.println("karena berhasil mencapai nilai yang diharapkan pada tahap seleksi");
                        
            }
            else{
                System.out.println("Mohon maaf "+ nama + " (" + usia + ")tahun" + " anda dinyatakan tidak"
                    + " diterima dalam beasiswa program mahasiswa");
                System.out.println("karena belum mencapai nilai yang diharapkan saat seleksi");
                       
            }
        }
        
        else{
            System.out.println("Mohon maaf "+ nama + " (" + usia + ")tahun" + " anda dinyatakan tidak"
                    + " diterima dalam beasiswa program mahasiswa");
            System.out.println("karena usia anda tidak memenuhi prasyarat penerima beasiswa");
                    
        }
    }

   
    
    
}
