package com.bootcamp.javaoop.model;

import java.util.List;

public class Kelas1 {
    private String kode;
    private MataKuliah1 matakuliah1;
    private Dosen1 dosen1;
    private String hari;
    private String jadwal;
    private List<Mahasiswa1> mahasiswa1;

    public Kelas1() {
    }

    public Kelas1(String kode, MataKuliah1 matakuliah1, Dosen1 dosen1, String hari, String jadwal, List<Mahasiswa1> mahasiswa1) {
        this.kode = kode;
        this.matakuliah1 = matakuliah1;
        this.dosen1 = dosen1;
        this.hari = hari;
        this.jadwal = jadwal;
        this.mahasiswa1 = mahasiswa1;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public MataKuliah1 getMatakuliah1() {
        return matakuliah1;
    }

    public void setMatakuliah1(MataKuliah1 matakuliah1) {
        this.matakuliah1 = matakuliah1;
    }

    public Dosen1 getDosen1() {
        return dosen1;
    }

    public void setDosen1(Dosen1 dosen1) {
        this.dosen1 = dosen1;
    }

    public String getHari() {
        return hari;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public String getJadwal() {
        return jadwal;
    }

    public void setJadwal(String jadwal) {
        this.jadwal = jadwal;
    }

    public List<Mahasiswa1> getMahasiswa1() {
        return mahasiswa1;
    }

    public void setMahasiswa1(List<Mahasiswa1> mahasiswa1) {
        this.mahasiswa1 = mahasiswa1;
    }
}
