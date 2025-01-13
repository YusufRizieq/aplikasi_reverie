package com.example.reverie;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class HomeFragment extends Fragment {

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        // Find RecyclerViews by ID
        RecyclerView recyclerFlashSale = view.findViewById(R.id.flashSaleRecyclerView);
        RecyclerView recyclerRekomendasi = view.findViewById(R.id.recommendationRecyclerView);

        // Setup Flash Sale RecyclerView with Horizontal Layout
        recyclerFlashSale.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));
        recyclerFlashSale.setAdapter(new FlashAdapter(ProductData.getFlashSale()));

        // Setup Rekomendasi RecyclerView with Grid Layout (2 columns)


        // GridLayoutManager dengan 2 kolom
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 2);
        gridLayoutManager.setOrientation(RecyclerView.VERTICAL); // Orientasi vertikal
        recyclerRekomendasi.setLayoutManager(gridLayoutManager);
        recyclerRekomendasi.setHasFixedSize(true);
        recyclerRekomendasi.setAdapter(new RekomendasiAdapter(ProductData.getRekomendasi()));
        return view;
    }


}
