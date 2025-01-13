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
        rekomendasi.add(new Product( "work jaket jurkid", "Rp 200000",0,50,R.drawable.jurkid_wj,"Work Jacket boxy dengan bahan " +
                "Cotton Twill dan Furing satin yang dilengkapi 2 saku dibagian depan dan 1 dibagian dalam dengan desain Full " +
                "bordir dibagian depan dan belakang.","hoodie"));
        rekomendasi.add(new Product( "hoodie", "Rp 200000",0,50,R.drawable.cougle,"Cougle Jacket Nebula terbuat dari bahan Taslan yang tidak mudah di tembus angin.\n" +
                "Cocok bagi anda yg banyak beraktivitas di luar ruangan atau pengendara motor.\n" +
                "\n" +
                "Warna yg terlihat pada foto sesuai dengan warna aslinya.","hoodie"));

        // Tambahkan produk lainnya sesuai kebutuhan
        return rekomendasi;
    }

    private static List<Product> allProducts = new ArrayList<>(); // Semua produk

    static {
        // Tambahkan data produk di sini
        allProducts.add(new Product("paksi Naga Liman","Rp 100.000", 20, 50, R.drawable.paksi_nagaliman_vector_belakang,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        allProducts.add(new Product("Cirebon v1","Rp 100.000", 20, 50, R.drawable.cirebon,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        allProducts.add(new Product("Metalica Cirebon","Rp 100.000", 20, 50, R.drawable.metalica_cirebon,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        allProducts.add(new Product("Jersey Vintage", "Rp 120000",0,50,R.drawable.jersey_vintage,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        allProducts.add(new Product("Reverie Ghost", "Rp 120000",0,50,R.drawable.reverie_metal,"Sablon Digital Plattisol\n" +
                "✅Bahan: cotton combed 24s \n" +
                "✅Size: Premium \n" +
                "✅Lebel \n" +
                "✅Hanteg","Tshirt"));
        allProducts.add(new Product("Kapital home",  "Rp 120000",0 , 50,R.drawable.jersey1,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        allProducts.add(new Product("kapital away", "Rp 120000",0,50,R.drawable.jersey2,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        allProducts.add(new Product("barito fantasi", "Rp 120000",0,50,R.drawable.jersey3,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        allProducts.add(new Product("vintage jersey calsio", "Rp 120000",0,50,R.drawable.jersey4,"Spesifikasi :\n" +
                "Bahan Embos Kualitas terbaik\n" +
                "Jahitan rapih\n" +
                "Printing Sumblimasi\n" +
                "Full Label\n" +
                "Kerah Vneck Variasi","jersey"));
        allProducts.add(new Product("work jaket jurkid", "Rp 200000",0,50,R.drawable.jurkid_wj,"Work Jacket boxy dengan bahan " +
                "Cotton Twill dan Furing satin yang dilengkapi 2 saku dibagian depan dan 1 dibagian dalam dengan desain Full " +
                "bordir dibagian depan dan belakang.","hoodie"));
    }

    public static List<Product> getFilteredProducts(String category) {
        List<Product> filteredList = new ArrayList<>();
        for (Product product : allProducts) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                filteredList.add(product);
            }
        }
        return filteredList;
    }
}
