package com.company;

public class BarangAlatMandi extends Barang {
	private String jenis,aroma;

	public BarangAlatMandi(String id, String nama, int harga, String jenis, String aroma) {
		super(id, nama, harga);
		this.jenis = jenis;
		this.aroma = aroma;
	}
}
