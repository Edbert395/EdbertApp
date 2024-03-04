package edu.uph.duasatusi.edbertapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import edu.uph.duasatusi.edbertapp.R;
import edu.uph.duasatusi.edbertapp.model.Product;

import java.util.ArrayList;

public class AdapterProduct extends ArrayAdapter<Product> {

    private ArrayList<Product> productArrayList;
    Context context;

    public AdapterProduct(ArrayList<Product> produkArrayList, Context context) {
        super(context, R.layout.item_list,produkArrayList);
        this.productArrayList = produkArrayList;
        this.context = context;
    }

    private static class MyViewFolder{
        ImageView productImage;
        TextView productName;
        TextView productPrice;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Product product = getItem(position);
        final View result;

        MyViewFolder myViewFolder;

        if(convertView==null) {
            myViewFolder = new MyViewFolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list, parent, false);

            myViewFolder.productImage = (ImageView) convertView.findViewById(R.id.productImage);
            myViewFolder.productName = (TextView) convertView.findViewById(R.id.productName);
            myViewFolder.productPrice = (TextView) convertView.findViewById(R.id.productPrice);

            convertView.setTag(myViewFolder);
        }
        else {
            myViewFolder = (MyViewFolder) convertView.getTag();
        }
        result = convertView;
        myViewFolder.productImage.setImageResource(product.getProductImage());
        myViewFolder.productName.setText(product.getProductName());
        myViewFolder.productPrice.setText("Rp. "+ product.getProductPrice());
        return result;
    }
}