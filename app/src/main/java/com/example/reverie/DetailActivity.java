package com.example.reverie;

import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {
    private ImageView productImage;
    private TextView productName, productPrice, soldCount, productDescription;
    private Button buyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Menghubungkan UI
        productImage = findViewById(R.id.productImage);
        productName = findViewById(R.id.productName);
        productPrice = findViewById(R.id.productPrice);
        soldCount = findViewById(R.id.soldCount);
        productDescription = findViewById(R.id.productDescription);
        buyButton = findViewById(R.id.buyButton);


        // Mendapatkan objek Product yang dikirim melalui Intent
        Product product = getIntent().getParcelableExtra("product");

        // Menampilkan detail produk di UI
        if (product != null) {
            productImage.setImageResource(product.getImageResource());
            productName.setText(product.getName());
            productPrice.setText( product.getPrice());
            soldCount.setText("Terjual " + product.getSoldCount());
            productDescription.setText(product.getShortDescription());
        }

        // Menangani tombol back untuk kembali ke halaman sebelumnya
        ImageView backButton = findViewById(R.id.back);
        backButton.setOnClickListener(v -> onBackPressed());

        // Tangani klik tombol beli
        buyButton.setOnClickListener(v -> {
            if (product != null) {
                showPurchaseConfirmation(product.getName());
            } else {
                Toast.makeText(this, "Produk tidak tersedia", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void showPurchaseConfirmation(String productName) {
        // Membuat AlertDialog untuk konfirmasi pembelian
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Berhasil Dibeli")
                .setMessage("Anda berhasil membeli produk: " + productName)
                .setPositiveButton("OK", (dialog, which) -> {
                    dialog.dismiss(); // Tutup popup
                    Toast.makeText(DetailActivity.this, "Terima kasih telah membeli!", Toast.LENGTH_SHORT).show();
                })
                .setCancelable(false) // Mencegah popup ditutup tanpa menekan tombol
                .create()
                .show();
    }

}