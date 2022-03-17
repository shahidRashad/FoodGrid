package com.example.foodgrid;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;

public class GridActivity extends AppCompatActivity {

    String[] foodname = {"Alfam","Broast","Shawaya","Chicken Tikka","Thanthoori","Kabab","Shawarma","Burger"};
    int foodimg[] = {R.drawable.broast,R.drawable.broast,R.drawable.shawaya,R.drawable.shawaya,R.drawable.shawaya,R.drawable.broast,R.drawable.shawaya,R.drawable.broast};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        GridView gridView = (GridView) findViewById(R.id.gridview);
        SearchView searchView = (SearchView)findViewById(R.id.searchView);

        CustGridAdapter foodAdapt = new CustGridAdapter(getApplicationContext(),foodname,foodimg);
        gridView.setAdapter(foodAdapt);

//        ArrayList<String> foodname1 = new ArrayList<String>();
//        foodname1.add("Alfam");
//        foodname1.add("Broast");
//        foodname1.add("Shawaya");
//        foodname1.add("Chicken Tikka");
//        foodname1.add("Thanthoori");
//        foodname1.add("Kabab");
//        foodname1.add("Shawarma");
//        foodname1.add("Burger");
//        ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,foodname1);
//        searchView.setAda


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(getApplicationContext(),Detailed.class);
                intent.putExtra("name",foodname[i]);
                intent.putExtra("photo",foodimg[i]);
                startActivity(intent);
            }
        });
    }
}