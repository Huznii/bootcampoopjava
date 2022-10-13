package com.bootcamp.javaoop.controller;


import com.bootcamp.javaoop.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KelasController {
    @GetMapping("/kelas")
    private ResponseEntity<Object> get(){
        List<Kelas> result = new ArrayList<>();

        Dosen dosen = new Dosen(211,"Roni","Bandung", LocalDate.of(1995,02,24),"Laki-Laki",
                new Alamat(7,"jln.Gejayan","Demangan","Depok","Sleman","Yogyakarta"),
                "M.Kom","D-211");
        Dosen dosen2 = new Dosen(212,"Ahmad","Ciamis",LocalDate.of(1990,11,30),"Laki-laki",
                new Alamat(8,"Jln.MH Thamrin","Kebon Jeruk","Kebon Dalem","Jakarta Selatan","Jakarta"),
                "M.T","D-212");

        List<Mahasiswa> mahasiswaList = Arrays.asList(
                new Mahasiswa(111,"Soleh","Banjar",LocalDate.of(1999,03,12),"Laki-laki",
                        new Alamat(1,"jln.Pamarican-Kertahayu","Sukahurip","Pamarican","Ciamis","Jawa Barat"),
                        "TI-001","Teknik Informatika", 2021),
                new Mahasiswa(112,"Shopia","Ciamis",LocalDate.of(1999,02,11),"Perempuan",
                        new Alamat(2,"jln.Tangkubanparahu","Sukajadi","Bandung Barat","Bandung","Jawa Barat"),
                        "TI-002","Teknik Informatika", 2021),
                new Mahasiswa(113,"Deni","Yogyakarta",LocalDate.of(2000,12,12),"Laki-Laki",
                        new Alamat(3,"jln Imogiri Timur","Imogiri","Bantul Selatan","Bantul","Yogyakarta"),
                        "TI-003","Teknik Informatika", 2021),
                new Mahasiswa(114,"Janu","Sleman",LocalDate.of(1998,07,20),"Laki-laki",
                        new Alamat(3,"jln. amarta","CaturTunggal","Depok","Sleman","Yogyakarta"),
                        "TI-004","Teknik Informatika", 2021)
        );

        //kelas 1
        MataKuliah matakuliah = new MataKuliah("MK-001","Pemrograman Web",3);
        Kelas kelas1 = new Kelas("K-001",matakuliah, dosen,"Senin","07.00-9.00", mahasiswaList);
        result.add(kelas1);

        //kelas 2
        MataKuliah matakuliah2 = new MataKuliah("MK-002","Basis Data",3);
        Kelas kelas2 = new Kelas("K-002",matakuliah2, dosen2,"Selasa","11.00-13.00",mahasiswaList);
        result.add(kelas2);

        return ResponseEntity.ok()
                .body(result);
    }
}
