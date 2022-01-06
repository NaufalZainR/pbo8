package com.tugas8;

public class Main {
    public static void main(String [] args ){
        Departemen dpr = new Departemen("supermarket");
        System.out.println("Departemen = SuperMarket");
        System.out.println("");
        Karyawan kry1 = new Tetap("Naufal", 500000, 300000);
        Karyawan kry2 = new Tetap("Maudy", 350000, 400000);
        Karyawan kry3 = new Kontrak("Daffa", 400000, 180);
        Karyawan kry4 = new Kontrak("Afif", 350000, 150);

        dpr.addKaryawan(kry1);
        dpr.addKaryawan(kry2);
        dpr.addKaryawan(kry3);
        dpr.addKaryawan(kry4);

        System.out.println("Karyawan tetap");
        dpr. displayTetap();
        System.out.println();
        System.out.println("==========");

        System.out.println("Karyawan Kontrak");
        dpr.displayKontrak();
        System.out.println("==========");

        System.out.println();
        System.out.println("Karyawan Keseluruhan");
        dpr.displayAll();
    }
}


