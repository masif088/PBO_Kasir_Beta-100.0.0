package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Transaksi {
	ArrayList<BarangMakanan> makanans = new ArrayList<>();
	public Transaksi() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selamat datang");
		System.out.println("embowes");
		while (true){
			System.out.println("Pilihan 1. Nambah barang ");
			int pilih = sc.nextInt();
			switch (pilih){
				case 1:
					System.out.println("barang apa yang akan dimasukkan");
					int piliha=sc.nextInt();
					switch (piliha){
						case 1:
							makanans.add(new BarangMakanan());
					}
					break;
				case 2:
					for (int i = 0; i <makanans.size() ; i++) {
						System.out.println(makanans.get(i).nama+"   jumlahnya "+ makanans.get(i).getStok());
					}
					break;
				case 3:
					System.out.println("Pilih barang yang akan di kasih");
					for (int i = 0; i <makanans.size() ; i++) {
						System.out.println(i+". " +makanans.get(i).nama);
					}
					pilih=sc.nextInt();
					System.out.println("masukkan banyaknya varabg");
					int bnayak =sc.nextInt();
					makanans.get(pilih).setStok(makanans.get(pilih).getStok()+bnayak);
					break;
				case 4:
					System.out.println("Jualan barang");
					System.out.println("Pilih barang yang akan di dijuasl");
					for (int i = 0; i <makanans.size() ; i++) {
						System.out.println(i+". " +makanans.get(i).nama);
					}
					pilih=sc.nextInt();
					System.out.println("masukkan banyaknya varabg");
					bnayak =sc.nextInt();
					makanans.get(pilih).setStok(makanans.get(pilih).getStok()-bnayak);
			}

		}


	}
}
