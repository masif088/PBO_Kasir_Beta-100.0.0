package com.company;

public class Barang {
	protected String id,nama;
	protected int harga, stok;

	public Barang(String id, String nama, int harga) {
		this.id = id;
		this.nama = nama;
		this.harga = harga;
		stok=0;
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
}
