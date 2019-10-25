package com.company;

import java.util.Scanner;

public class ModelBarangMakanan extends Barang{
	private String exp, jenis;
	Scanner sc = new Scanner(System.in);
	public ModelBarangMakanan() {
		System.out.println("masukkan 1d");
		this.id=sc.nextLine();
		System.out.println("Masukkan nama");
		this.nama=sc.nextLine();
		System.out.println("masukan Jenis");
		this.jenis=sc.nextLine();
		System.out.println("Masukkan harga");
		this.harga=sc.nextInt();
		System.out.println("masukkan exp");
		this.exp=sc.nextLine();
		this.exp=sc.nextLine();
		System.out.println(harga);
		System.out.println(exp);
	}

	public ModelBarangMakanan(String id, String nama, int harga, String exp, String jenis) {
		super(id, nama, harga);
		this.exp = exp;
		this.jenis = jenis;
	}

	public void dodolan(int jumlah){
		this.stok-=jumlah;
	}


}
