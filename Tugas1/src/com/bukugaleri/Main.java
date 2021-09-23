package com.bukugaleri;

public class Main {

    public static void main(String[] args) {
	// write your code here

     //Objek Pertama
        buku bukuSaya = new buku();
        bukuSaya.setJudul("Harry Potter"); bukuSaya.setPengarang("J.K. Rowling"); bukuSaya.setHarga(300000);

     //Objek kedua
        buku bukuKamu = new buku();
        bukuKamu.setJudul("UML"); bukuKamu.setPengarang("Ivar Jacobson"); bukuKamu.setHarga(400000);

     //Show Result
        System.out.println("Judul : "+bukuSaya.getJudul()+" | Pengarang : " + bukuSaya.getPengarang()+" | Harga : " + bukuSaya.getHarga());
        System.out.println("Judul : "+bukuKamu.getJudul()+" | Pengarang : " + bukuKamu.getPengarang()+" | Harga : " + bukuKamu.getHarga());
    }
}
