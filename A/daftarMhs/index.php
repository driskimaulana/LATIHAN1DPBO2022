<?php

include "Mahasiswa.php";

// create new instance of Mahasiswa class using constructors
$mhs = new Mahasiswa("2008149", "D'Riski Maulana", "Ilmu Komputer", "4", "Laki-Laki");
// call the ShowMhs() methon for showing the result
$mhs->ShowMhs();

echo "<br>";
echo "<br>";

// create new instance of Mahasiswa class using setter and getter
$mhs2 = new Mahasiswa();

// set all the attribute using setter
$mhs2->setNama("Boa Hancock");
$mhs2->setNim("2000189");
$mhs2->setProdi("Perbatuan");
$mhs2->setSemester("4");
$mhs2->setJenisKelamin("Perempuan");
// call the showMhs() function to see the result
$mhs2->ShowMhs();
