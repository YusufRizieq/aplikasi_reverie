package com.example.reverie;

import android.os.Parcel;
import android.os.Parcelable;

public class Product implements Parcelable {
    private String name;
    private String price;
    private int discountPercentage;
    private int soldCount;
    private int imageResource;
    private String shortDescription;



    private String category;

    // Konstruktor lengkap
    public Product(String name, String price, int discountPercentage, int soldCount,
                   int imageResource, String shortDescription, String category) {
        this.name = name;
        this.price = price;
        this.discountPercentage = discountPercentage;
        this.soldCount = soldCount;
        this.imageResource = imageResource;
        this.shortDescription = shortDescription;
        this.category = category;
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
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    // Implementasi Parcelable
    protected Product(Parcel in) {
        name = in.readString();
        price = in.readString();
        discountPercentage = in.readInt();
        soldCount = in.readInt();
        imageResource = in.readInt();
        shortDescription = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(price);
        dest.writeInt(discountPercentage);
        dest.writeInt(soldCount);
        dest.writeInt(imageResource);
        dest.writeString(shortDescription);
    }

    public static final Creator<Product> CREATOR = new Creator<Product>() {
        @Override
        public Product createFromParcel(Parcel in) {
            return new Product(in);
        }

        @Override
        public Product[] newArray(int size) {
            return new Product[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }
}
