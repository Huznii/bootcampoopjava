package com.bootcamp.javaoop.model;

import java.time.LocalDate;

public class Orang {
    private int nik;
    private String nama;
    private String tmpLahir;
    private LocalDate tglLahir;
    private String jk;
    private Alamat alamat;

    public Orang() {
    }

    public Orang(int nik, String nama, String jk) {
        this.nik = nik;
        this.nama = nama;
        this.jk = jk;
    }

    public Orang(int nik, String nama, String tmpLahir, LocalDate tglLahir, String jk) {
        this.nik = nik;
        this.nama = nama;
        this.tmpLahir = tmpLahir;
        this.tglLahir = tglLahir;
        this.jk = jk;
    }

    public Orang(int nik, String nama, String tmpLahir, LocalDate tglLahir, String jk, Alamat alamat) {
        this.nik = nik;
        this.nama = nama;
        this.tmpLahir = tmpLahir;
        this.tglLahir = tglLahir;
        this.jk = jk;
        this.alamat = alamat;
    }

    public int getNik() {
        return nik;
    }

    public void setNik(int nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTmpLahir() {
        return tmpLahir;
    }

    public void setTmpLahir(String tmpLahir) {
        this.tmpLahir = tmpLahir;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public void setTglLahir(LocalDate tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getJk() {
        return jk;
    }

    public void setJk(String jk) {
        this.jk = jk;
    }

    public Alamat getAlamat() {
        return alamat;
    }

    public void setAlamat(Alamat alamat) {
        this.alamat = alamat;
    }
}
