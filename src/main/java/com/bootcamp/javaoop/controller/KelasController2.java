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
public class KelasController2 {
    @GetMapping("/kelas2")
    private ResponseEntity<Object> get(){
        List<Kelas2> result = new ArrayList<>();

        Dosen2 dosen = new Dosen2(111,"James","Cirebon", LocalDate.of(2002,3,17),"Laki-laki",
                new Alamat2(11,"Jln.Perjuangan","Paratuman","Pataruman","Bandung Selatan","Bandung"),
                "M.Cs","L-434");
        Dosen2 dosen1 = new Dosen2(122,"Steven","Subang",LocalDate.of(2001,1,11),"Laki-laki",
                new Alamat2(22,"Jln.Cikahuripan","Lebak Jambe","Lebak","Banten Kidul","Banten"),
                "M.Kom","L-433");

        List<Mahasiswa2> mahasiswa2List = Arrays.asList(
                new Mahasiswa2(101,"Yudi","Ciamis",LocalDate.of(2001,5,30),"Laki-laki",
                        new Alamat2(10,"Jln.Kabupaten","Sidomukti","Sidodadi","Sidolali","Jawa Tengah"),
                        "TI-231","Ilmu Komputer",2020),
                new Mahasiswa2(202,"Dina","Jakarta",LocalDate.of(2000,8,23),"Perempuan",
                        new Alamat2(20,"Jln.Kemerdekaan","Sukahurip","Pamarican","Ciamis","Jawa Barat"),
                        "TI-242","Ilmu Komputer",2020),
                new Mahasiswa2(303,"Vino","Garut",LocalDate.of(1999,12,20),"Laki-laki",
                        new Alamat2(30,"Jln.Cikuya","Sukajadi","Banjarsari","Ciamis","Jawa Barat"),
                        "TI-221","Ilmu Komputer",2020),
                new Mahasiswa2(404,"Aldi","Yogyakarta",LocalDate.of(2000,2,20),"Laki-laki",
                        new Alamat2(40,"Jln.Ahmad Yani","Pintu Singa","Pataruman","Kota Banjar","Jawa Barat"),
                        "TI-212","Ilmu Komputer",2020)
        );
        List<Mahasiswa2> mahasiswa3List = Arrays.asList(
                new Mahasiswa2(122,"Joko","Banyumas",LocalDate.of(2001,5,30),"Laki-laki",
                        new Alamat2(50,"Jln.Langgeng","Karangmalang","Bulak sumur","Sleman","Yogya"),
                        "TI-231","Teknik Informatika",2019),
                new Mahasiswa2(221,"Vina","Balikpapan",LocalDate.of(2000,8,23),"Perempuan",
                        new Alamat2(60,"Jln.Perintis","Kampung Melayu","Kampung Melayu","Jakarta Utara","Jakarta"),
                        "TI-242","Teknik Informatika",2018),
                new Mahasiswa2(311,"Rezki","Sleman",LocalDate.of(1999,12,20),"Laki-laki",
                        new Alamat2(70,"Jln.Sudirman","Jeruk Legi","Jeruk Purut","Jakarta Barat","Jakarta"),
                        "TI-221","Teknik Informatika",2020),
                new Mahasiswa2(411,"Asep","Bandung",LocalDate.of(2002,2,20),"Laki-laki",
                        new Alamat2(80,"Jln.Entah Kemana","Minggir","Minggiran","Bantul","Yogyakarta"),
                        "TI-212","Teknik Informatika",2019)
        );

        MataKuliah2 matakuliah = new MataKuliah2("MK=010","Database",3);
        Kelas2 kelas = new Kelas2("A=001",matakuliah,dosen,"Jumat","09.00-11.00",mahasiswa2List);
        result.add(kelas);

        MataKuliah2 matakuliah1 = new MataKuliah2("MK=010","Database",3);
        Kelas2 kelas1 = new Kelas2("B-002",matakuliah1,dosen1,"Kamis","07.00-09.00",mahasiswa3List);
        result.add(kelas1);

        return ResponseEntity.ok()
                .body(result);
    }

}
