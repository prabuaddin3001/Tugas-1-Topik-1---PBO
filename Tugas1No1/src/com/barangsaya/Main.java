package com.barangsaya;

public class Main {

    public static void main(String[] args) {
	// write your code here
        barangKu data1 = new barangKu("BRG-001","Tas Gucci", 1200);
        barangKu data2 = new barangKu("BRG-002","Printer Epson 5355", 200);
        barangKu data3 = new barangKu("BRG-003","Koper",150);
        barangKu data4 = new barangKu("BRG-004","Helm",20);
        //Cetak
        System.out.println("====== Barang-Barang ======");
        System.out.println("idProduk : "+ data1.idProduk +" | Nama Barang : "+ data1.nama +" | Harga : "+ data1.harga);
        System.out.println("idProduk : "+ data2.idProduk +" | Nama Barang : "+ data2.nama +" | Harga : "+ data2.harga);
        System.out.println("idProduk : "+ data3.idProduk +" | Nama Barang : "+ data3.nama +" | Harga : "+ data3.harga);
        System.out.println("idProduk : "+ data4.idProduk +" | Nama Barang : "+ data4.nama +" | Harga : "+ data4.harga);
        System.out.println("");
        System.out.println("====== Total Harga Barang ======");
        System.out.println("Total Harga Barang : " + (data1.harga + data3.harga + data4.harga));
    }
}
