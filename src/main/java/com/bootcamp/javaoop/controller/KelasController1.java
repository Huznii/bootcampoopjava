package com.bootcamp.javaoop.controller;


import com.bootcamp.javaoop.model.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class KelasController1 {
    @GetMapping("/kelas1")
    private ResponseEntity<Object> get(){
        List<Kelas1> result = new ArrayList<>();


        Dosen1 dosen1 = new Dosen1(101,"Rudi","Bandung", LocalDate.of(1984,9,25),"Laki-Laki",
                new Alamat1(11,"Jln.Perumnas","Seturan","Depok","Sleman","Yogayakarta"),
                "P.hD","L-011");
        Dosen1 dosen2 = new Dosen1(122,"Rudi","Ciajur",LocalDate.of(1990,1,11),"Laki-Laki",
                new Alamat1(12,"Jln.Sehat sekali","Karangmalang","Prambanan","Sleman","Yogayakarta"),
                "P.hD","L-012");

        List<Mahasiswa1> mahasiswa1List = Arrays.asList(
                new Mahasiswa1(123,"Huzni","Cilacap",LocalDate.of(2000,7,12),"Laki-Laki",
                        new Alamat1(1,"jln.Sutarman","Sidodadi","Sidosari","Lakbok","Jawa Tengah"),
                        "PTM021","Teknik Mekatronika",2019),
                new Mahasiswa1(122,"Ahmad","Bantul",LocalDate.of(1999,12,21),"Laki-Laki",
                        new Alamat1(2,"jln.Buntu","Sukahurip","Huripsuka","Ciamis","Jawa Barat"),
                        "PTM022","Teknik Mekatronika",2019),
                new Mahasiswa1(132,"Silfa","Ciamis",LocalDate.of(2000,5,21),"Perempuan",
                        new Alamat1(3,"jln.Belok-belok","Sukamaju","Sukamundur","Kuningan","Jawa Barat"),
                        "PTM022","Teknik Mekatronika",2019),
                new Mahasiswa1(131,"Jesicca","Jakarta",LocalDate.of(2001,1,2),"Perempuan",
                        new Alamat1(4,"jln.Jangan muter","Sidoarum","Godean","Sleman","Yogyakarta"),
                        "PTM022","Teknik Mekatronika",2019)
        );
        //kelas 1
        MataKuliah1 matakuliah1 = new MataKuliah1("MK999","Jaringan Komputer",3);
        Kelas1 kelas = new Kelas1("RF-002",matakuliah1,dosen1,"Selasa","09.00-10.00", mahasiswa1List);
        result.add(kelas);
        //kelas 2
        MataKuliah1 matakuliah = new MataKuliah1("MK888","Keamanan Jaringan",3);
        Kelas1 kelas1 = new Kelas1("RF-003",matakuliah,dosen2,"Rabu","11.00-13.00",mahasiswa1List);
        result.add(kelas1);


        return ResponseEntity.ok()
                .body(result);
    }

}
