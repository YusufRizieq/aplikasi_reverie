package com.example.reverie;

import com.example.reverie.Product;
import com.example.reverie.R;

import java.util.ArrayList;
import java.util.List;

public class ProductData {
    public static List<Product> getFlashSale() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Rp 100.000", 20, 50, R.drawable.paksi_nagaliman_vector_belakang));
        products.add(new Product("Rp 100.000", 20, 50, R.drawable.cirebon));
        products.add(new Product("Rp 100.000", 20, 50, R.drawable.metalica_cirebon));
        return products;
    }
    public static List<Product> getRekomendasi() {
        List<Product> rekomendasi = new ArrayList<>();
        rekomendasi.add(new Product( "Produk 1", "120000",R.drawable.jersey_vintage));
        rekomendasi.add(new Product( "Produk 1", "120000",R.drawable.reverie_metal));
        rekomendasi.add(new Product( "Produk 1", "120000",R.drawable.jersey_vintage));
        rekomendasi.add(new Product( "Produk 1", "120000",R.drawable.reverie_metal));
        rekomendasi.add(new Product( "Produk 1", "120000",R.drawable.jersey_vintage));
        rekomendasi.add(new Product( "Produk 1", "120000",R.drawable.reverie_metal));
        // Tambahkan produk lainnya sesuai kebutuhan
        return rekomendasi;
    }
}
