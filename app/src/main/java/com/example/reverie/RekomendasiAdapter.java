package com.example.reverie;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RekomendasiAdapter extends RecyclerView.Adapter<RekomendasiAdapter.RekomendasiViewHolder> {

    private final List<Product> recommendedProducts;

    public RekomendasiAdapter(List<Product> recommendedProducts) {
        this.recommendedProducts = recommendedProducts;
    }
    public void updateData(List<Product> newProductList) {
        // Mengganti data lama dengan data baru
        recommendedProducts.clear();
        recommendedProducts.addAll(newProductList);
        // Memberitahu RecyclerView bahwa data telah berubah
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public RekomendasiViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recommendation, parent, false);
        return new RekomendasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RekomendasiViewHolder holder, int position) {
        Product product = recommendedProducts.get(position);
        holder.productImage.setImageResource(product.getImageResource());
        holder.productName.setText(product.getName());
        holder.productPrice.setText( product.getPrice());

        // Menambahkan OnClickListener pada item
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("product", product);  // Mengirimkan objek Product
            v.getContext().startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return recommendedProducts.size();
    }

    public static class RekomendasiViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName, productPrice;

        public RekomendasiViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productName = itemView.findViewById(R.id.productName);
            productPrice = itemView.findViewById(R.id.productPrice);
        }
    }


}
