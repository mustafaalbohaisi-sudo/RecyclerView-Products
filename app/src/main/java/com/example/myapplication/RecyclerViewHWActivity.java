package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.adapter.ProductAdapter;
import com.example.myapplication.models.Product;

import java.util.ArrayList;

public class RecyclerViewHWActivity extends AppCompatActivity {
    RecyclerView rv;
    ArrayList<Product> productArrayList;
   ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycler_view_hwactivity);
        rv = findViewById(R.id.rv_2);
        productArrayList = new ArrayList<>();

        productArrayList.add(new Product(1, R.drawable.product1, "Bitzwolf B-CC1 Camera 1080P HD Webcam", "US$48.89"));
        productArrayList.add(new Product(2, R.drawable.product2, "Bitzwolf B-CC1 Camera 1080P HD Webcam", "US$55.89"));
        productArrayList.add(new Product(3, R.drawable.product3, "Bitzwolf B-CC1 Camera 1080P HD Webcam", "US$78.89"));
        productArrayList.add(new Product(4, R.drawable.product4, "Bitzwolf B-CC1 Camera 1080P HD Webcam", "US$88.55"));
        productArrayList.add(new Product(5, R.drawable.product5, "Bitzwolf B-CC1 Camera 1080P HD Webcam", "US$23.67"));
        productArrayList.add(new Product(6, R.drawable.product6, "Bitzwolf B-CC1 Camera 1080P HD Webcam", "US$44.89"));

        productAdapter = new ProductAdapter(productArrayList,RecyclerViewHWActivity.this);
        rv.setLayoutManager(new GridLayoutManager(RecyclerViewHWActivity.this, 2));

        rv.setAdapter(productAdapter);

    }
}