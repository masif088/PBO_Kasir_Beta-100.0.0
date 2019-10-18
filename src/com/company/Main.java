package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	    Transaksi transaksi = new Transaksi();
//	    Random random = new Random(6);
//	    int a = random.nextInt();
	    int data=10000;
	    int getAngka = (int) (Math.random()*data);
	    System.out.println("Angka Yang Didapat: "+getAngka);
    }
}
