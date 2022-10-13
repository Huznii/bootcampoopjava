package com.bootcamp.javaoop.model;


import java.time.LocalDate;

public class Dosen1 extends Orang1 {
    private String gelar;
    private String nip;

    public Dosen1() {
    }

    public Dosen1(int nik, String nama, String jk, String gelar, String nip) {
        super(nik, nama, jk);
        this.gelar = gelar;
        this.nip = nip;
    }

    public Dosen1(int nik, String nama, String tmpLahir, LocalDate tglLahir, String jk, String gelar, String nip) {
        super(nik, nama, tmpLahir, tglLahir, jk);
        this.gelar = gelar;
        this.nip = nip;
    }

    public Dosen1(int nik, String nama, String tmpLahir, LocalDate tglLahir, String jk, Alamat1 alamat1, String gelar, String nip) {
        super(nik, nama, tmpLahir, tglLahir, jk, alamat1);
        this.gelar = gelar;
        this.nip = nip;
    }

    public String getGelar() {
        return gelar;
    }

    public void setGelar(String gelar) {
        this.gelar = gelar;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
}
