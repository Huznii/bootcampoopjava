package com.bootcamp.javaoop.model;

import java.time.LocalDate;

public class Dosen2 extends Orang2{
    private String gelar;
    private String nip;

    public Dosen2() {
    }

    public Dosen2(int nik, String nama, String jk, String gelar, String nip) {
        super(nik, nama, jk);
        this.gelar = gelar;
        this.nip = nip;
    }

    public Dosen2(int nik, String nama, String tmpLahir, LocalDate tglLahir, String jk, String gelar, String nip) {
        super(nik, nama, tmpLahir, tglLahir, jk);
        this.gelar = gelar;
        this.nip = nip;
    }

    public Dosen2(int nik, String nama, String tmpLahir, LocalDate tglLahir, String jk, Alamat2 alamat, String gelar, String nip) {
        super(nik, nama, tmpLahir, tglLahir, jk, alamat);
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
