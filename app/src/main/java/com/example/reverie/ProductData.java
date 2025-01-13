package com.example.reverie;

import com.example.reverie.Product;
import com.example.reverie.R;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    public static List<Product> getFlashSale() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("paksi Naga Liman","Rp 100.000", 20, 50, R.drawable.paksi_nagaliman_vector_belakang,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        products.add(new Product("Cirebon v1","Rp 100.000", 20, 50, R.drawable.cirebon,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        products.add(new Product("Metalica Cirebon","Rp 100.000", 20, 50, R.drawable.metalica_cirebon,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        return products;
    }
    public static List<Product> getRekomendasi() {
        List<Product> rekomendasi = new ArrayList<>();
        rekomendasi.add(new Product( "Jersey Vintage", "Rp 120000",0,50,R.drawable.jersey_vintage,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        rekomendasi.add(new Product( "Reverie Ghost", "Rp 120000",0,50,R.drawable.reverie_metal,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        rekomendasi.add(new Product( "Kapital home",  "Rp 120000",0 , 50,R.drawable.jersey1,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        rekomendasi.add(new Product( "kapital away", "Rp 120000",0,50,R.drawable.jersey2,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        rekomendasi.add(new Product( "barito fantasi", "Rp 120000",0,50,R.drawable.jersey3,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        rekomendasi.add(new Product( "vintage jersey calsio", "Rp 120000",0,50,R.drawable.jersey4,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        // Tambahkan produk lainnya sesuai kebutuhan
        return rekomendasi;
    }
}
