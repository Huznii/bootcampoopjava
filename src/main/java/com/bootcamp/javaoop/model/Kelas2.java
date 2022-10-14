package com.bootcamp.javaoop.model;

import java.util.List;

public class Kelas2 {
    private String kode;
    private MataKuliah2 matakuliah;
    private Dosen2 dosen;
    private String hari;
    private String jadwal;
    private List<Mahasiswa2> mahasiswa;

    public Kelas2() {
    }

    public Kelas2(String kode, String hari, String jadwal) {
        this.kode = kode;
        this.hari = hari;
        this.jadwal = jadwal;
    }

    public Kelas2(String kode, MataKuliah2 matakuliah, Dosen2 dosen, String hari, String jadwal, List<Mahasiswa2> mahasiswa) {
        this.kode = kode;
        this.matakuliah = matakuliah;
        this.dosen = dosen;
        this.hari = hari;
        this.jadwal = jadwal;
        this.mahasiswa = mahasiswa;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public MataKuliah2 getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(MataKuliah2 matakuliah) {
        this.matakuliah = matakuliah;
    }

    public Dosen2 getDosen() {
        return dosen;
    }

    public void setDosen(Dosen2 dosen) {
        this.dosen = dosen;
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

    public List<Mahasiswa2> getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(List<Mahasiswa2> mahasiswa) {
        this.mahasiswa = mahasiswa;
    }
}
