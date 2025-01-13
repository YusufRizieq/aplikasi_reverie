package com.example.reverie;

public class Product {
    private String name;                 // Nama produk
    private String price;                // Harga produk
    private int discountPercentage;      // Persentase diskon
    private int soldCount;               // Jumlah terjual
    private int imageResource;           // Resource gambar
    private String shortDescription;     // Deskripsi singkat

    // Konstruktor lengkap
    public Product(String name, String price, int discountPercentage, int soldCount,
                   int imageResource, String shortDescription) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.soldCount = soldCount;
        this.imageResource = imageResource;
        this.shortDescription = shortDescription;
    }

    // Konstruktor untuk Flash Sale
    public Product(String price, int discountPercentage, int soldCount, int imageResource) {
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.soldCount = soldCount;
        this.imageResource = imageResource;
    }

    public Product(String name, String price, int imageResource ){
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    // Getter untuk atribut
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getDiscountPercentage() {
        return discountPercentage;
    }

    public int getSoldCount() {
        return soldCount;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
