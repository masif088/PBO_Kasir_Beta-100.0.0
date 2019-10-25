package com.company;

import java.util.Scanner;

public class Barang {
	protected String id, nama;
	protected int harga, stok;
	Scanner sc = new Scanner(System.in);

	public Barang(String id, String nama, int harga) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		stok = 0;
	}

	public Barang() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}

	public int getStok() {
		return stok;
	}

	public void setStok(int stok) {
		this.stok = stok;
	}

	public void dodlan(int julah) {
		this.stok -= julah;
	}

	public void tambahbarang(int jumlah) {
		this.stok += jumlah;
	}

	public void tampilkanBarang() {
		System.out.println("===============================");
		System.out.println("Id Barang    : " + id);
		System.out.println("Nama Barang  : " + nama);
		System.out.println("Harga Barang : " + harga);
		System.out.println("Jumlah Barang: " + stok);
	}

	public void updateHarga() {
		System.out.print("Masukkan harga baru :");
		setHarga(sc.nextInt());
	}
}
