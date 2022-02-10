<?php

class Mahasiswa
{
	// class attribute
	private $nim = "";
	private $nama = "";
	private $prodi = "";
	private $semester = "";
	private $jenisKelamin = "";

	// counstructors
	public function Mahasiswa($nim = "", $nama = "", $prodi = "", $semester = "", $jenisKelamin = "")
	{
		$this->nim = $nim;
		$this->nama = $nama;
		$this->prodi = $prodi;
		$this->semester = $semester;
		$this->jenisKelamin = $jenisKelamin;
	}

	public function setNim($nim)
	{
		$this->nim = $nim;
	}

	public function getNim()
	{
		return $this->nim;
	}

	public function setNama($nama)
	{
		$this->nama = $nama;
	}

	public function getNama()
	{
		return $this->nama;
	}

	public function setProdi($prodi)
	{
		$this->prodi = $prodi;
	}

	public function getProdi()
	{
		return $this->prodi;
	}

	public function setSemester($semester)
	{
		$this->semester = $semester;
	}

	public function getSemester()
	{
		return $this->semester;
	}

	public function setJenisKelamin($jk)
	{
		$this->jenisKelamin = $jk;
	}

	public function getJenisKelamin()
	{
		return $this->jenisKelamin;
	}

	// method
	public function ShowMhs()
	{
		echo "NIM: " . $this->getNim() . "<br>";
		echo "Nama: " . $this->getNama() . "<br>";
		echo "Prodi: " . $this->getProdi() . "<br>";
		echo "Semester: " . $this->getSemester() . "<br>";
		echo "Jenis Kelamin: " . $this->getJenisKelamin() . "<br>";
	}
}
