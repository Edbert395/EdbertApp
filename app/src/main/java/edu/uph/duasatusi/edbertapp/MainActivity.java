package edu.uph.duasatusi.edbertapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import edu.uph.duasatusi.edbertapp.adapter.AdapterProduct;
import edu.uph.duasatusi.edbertapp.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Product> productArrayList;
    private static AdapterProduct adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        productArrayList = new ArrayList<>();

        Product product1 = new Product("Kacang Garuda 375g", 37000, R.drawable.garuda);
        Product product2 = new Product("Hit Anti Nyamuk Elektrik", 16900, R.drawable.hit);
        Product product3 = new Product("Aqua Air Mineral 600ml", 4400, R.drawable.aqua);
        Product product4 = new Product("Pocari Sweat 500ml", 9000, R.drawable.pocari);
        Product product5 = new Product("Indomie Ayam Bawang 69g", 3100, R.drawable.indomie);
        Product product6 = new Product("Ultra Milk 250ml", 8100, R.drawable.ultra);
        Product product7 = new Product("Sania Minyak Goreng 2L", 34200, R.drawable.sania);
        Product product8 = new Product("Tropical Minyak Goreng", 35200, R.drawable.tropical);


        productArrayList.add(product1);
        productArrayList.add(product2);
        productArrayList.add(product3);
        productArrayList.add(product4);
        productArrayList.add(product5);
        productArrayList.add(product6);
        productArrayList.add(product7);
        productArrayList.add(product8);

        adapter = new AdapterProduct(productArrayList, getApplicationContext());
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(
                        MainActivity.this,
                        "Nama Produk yang dipilih : "+ adapter.getItem(position).getProductName(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}