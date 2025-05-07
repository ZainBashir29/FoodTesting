package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.LinearLayoutCompat$InspectionCompanion;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.helloworld.databinding.ActivityMainBinding;

import com.example.helloworld.Models.MainModel;

import com.example.helloworld.Adapters.MainAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ArrayList<MainModel> list = new ArrayList<>();

        list.add(new MainModel(R.drawable.singleburger, "Burger", "4.99", "Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.burgerdeal, "Burger Deal 1", "7.99", "1 Zinger Burger with Sizzling Fries"));
        list.add(new MainModel(R.drawable.burgerdeal2, "Burger Deal 2", "8.99", "3 Chicken Burger with Extra Cheese"));
        list.add(new MainModel(R.drawable.pizza, "Pizza", "6.99", "Pizza (Small - Medium - Large)"));
        list.add(new MainModel(R.drawable.paratharoll, "Paratha Roll", "3.99", "Paratha Roll with Extra Mayonnaise"));
        list.add(new MainModel(R.drawable.colddrink, "Cold Drink", "0.99", "Cold Drink (Pak Cola - Pak Lime)"));

        MainAdapter adapter = new MainAdapter(list, this);
        binding.recycleView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recycleView.setLayoutManager(layoutManager);
    }
}
