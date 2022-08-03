package com.example.khadok;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.khadok.Adapters.MainAdapter;
import com.example.khadok.Models.MainModel;
import com.example.khadok.databinding.ActivityMain1Binding;
import com.example.khadok.databinding.ActivityMain1Binding;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    private Intent b = new Intent();
    ActivityMain1Binding binding;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain1Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<MainModel> list = new ArrayList<>();

        Intent intent = getIntent();
        String user1 = intent.getStringExtra("customerid");
        user=user1;

        if(getIntent().getIntExtra("foodtype",1)==1) {
            //vegfood
            list.add(new MainModel(R.drawable.pizza,"Pizza","350","The offer ends at May 28",user));
            list.add(new MainModel(R.drawable.rice,"koren Spicy Rice Cake","500","very spicy",user));
            list.add(new MainModel(R.drawable.momo,"Momo","350","with vegetable",user));
            list.add(new MainModel(R.drawable.senduis, "Sandwich", "50", "vegatable Sandwich ", user));
            list.add(new MainModel(R.drawable.pasta, "pasta", "150", "with vegatable ", user));

        }
        else {
            //non-veg food


            list.add(new MainModel(R.drawable.senduis, "Sandwich", "50", "Chicken Sandwich with Extra cheese", user));
            list.add(new MainModel(R.drawable.burger, "Burger", "250", "Chicken Burger with Extra cheese", user));
            list.add(new MainModel(R.drawable.brief, "Brief", "150", "with egg", user));
            list.add(new MainModel(R.drawable.samosa,"Samosa","25","with chicken",user));
            list.add(new MainModel(R.drawable.momo,"Momo","350","with chicken",user));
        }




        MainAdapter adapter = new MainAdapter(list,this);
        binding.recylerview.setAdapter(adapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        binding.recylerview.setLayoutManager(layoutManager);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case  R.id.orders:
                startActivity(new Intent(MainActivity1.this,OrderActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
    public void onBackPressed() {
        b.setClass(getApplicationContext(), login_page.class);
        startActivity(b);
        finish();
    }
}