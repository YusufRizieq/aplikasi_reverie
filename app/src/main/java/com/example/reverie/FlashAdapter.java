package com.example.reverie;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FlashAdapter extends RecyclerView.Adapter<FlashAdapter.FlashViewHolder> {

    private final List<Product> flashSaleProducts;

    public FlashAdapter(List<Product> flashSaleProducts) {
        this.flashSaleProducts = flashSaleProducts;
    }

    @NonNull
    @Override
    public FlashViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flash_sale, parent, false);
        return new FlashViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FlashViewHolder holder, int position) {
        Product product = flashSaleProducts.get(position);
        holder.productImage.setImageResource(product.getImageResource());
        holder.productPrice.setText(product.getPrice());
        holder.discountPercentage.setText("-"+product.getDiscountPercentage() + "%");
        holder.progresSold.setProgress(product.getSoldCount());
        holder.soldCount.setText("Terjual "+product.getSoldCount());
    }

    @Override
    public int getItemCount() {
        return flashSaleProducts.size();
    }

    public static class FlashViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        ProgressBar progresSold;
        TextView productPrice, discountPercentage, soldCount;

        public FlashViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.productImage);
            productPrice = itemView.findViewById(R.id.productPrice);
            discountPercentage = itemView.findViewById(R.id.discountBadge);
            progresSold = itemView.findViewById(R.id.soldProgressBar);
            soldCount = itemView.findViewById(R.id.soldText);
        }
    }
}
