package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
	ArrayList<ModelBarangMakanan> makanans = new ArrayList<>();

	public Transaksi() {
		makanans.add(new ModelBarangMakanan("0","Hot Lava",1000,"20/2/2020","Makanan"));
		makanans.add(new ModelBarangMakanan("1","Baju Keren",1000,"20/2/2020","Fashion"));
		makanans.add(new ModelBarangMakanan("2","Whiskas",1000,"20/2/2020","Makanan"));
		makanans.add(new ModelBarangMakanan("3","Donat",1000,"20/2/2020","Makanan"));
		makanans.add(new ModelBarangMakanan("4","Kecap ABC",1000,"20/2/2020","Makanan"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Selamat datang");
		System.out.println("embowes");
		while (true) {
			System.out.println("Pilihan \n 1. Nambah barang \n 2. Tampilkan Barang \n 3. Tambah Barang \n 4. Jual Barang \n 5. Update Harga \n 6. Hapus Barang");
			int pilih = sc.nextInt();
			switch (pilih) {
				case 1:
					System.out.println("barang apa yang akan dimasukkan");
					int piliha = sc.nextInt();
					switch (piliha) {
						case 1:
							makanans.add(new ModelBarangMakanan());
					}
					break;
				case 2:
					for (int i = 0; i < makanans.size(); i++) {
						makanans.get(i).tampilkanBarang();
					}
					break;
				case 3:
					System.out.println("Pilih barang yang akan di kasih");
					for (int i = 0; i < makanans.size(); i++) {
						System.out.println(i + ". " + makanans.get(i).nama);
					}
					pilih = sc.nextInt();
					System.out.println("masukkan banyaknya varabg");
					int banyak = sc.nextInt();
					makanans.get(pilih).tambahbarang(banyak);
					break;
				case 4:
					System.out.println("Jualan barang");
					System.out.println("Pilih barang yang akan di dijuasl");
					for (int i = 0; i < makanans.size(); i++) {
						System.out.println(i + ". " + makanans.get(i).nama);
					}
					pilih = sc.nextInt();
					System.out.println("masukkan banyaknya varabg");
					banyak = sc.nextInt();
					makanans.get(pilih).dodolan(banyak);
					break;
				case 5:
					for (int i = 0; i < makanans.size(); i++) {
						makanans.get(i).tampilkanBarang();
					}
					System.out.println("Masukkan id yang akan diganti harganya");
					piliha=sc.nextInt();
					makanans.get(piliha).updateHarga();
					break;
				case 6:
					for (int i = 0; i < makanans.size(); i++) {
						makanans.get(i).tampilkanBarang();
					}
					System.out.println("Masukkan id yang akan diganti harganya");
					piliha=sc.nextInt();
					makanans.remove(piliha);
					break;
			}
		}
	}
}
