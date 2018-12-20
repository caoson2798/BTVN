package com.example.daiphongpc.gd3.json;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    ArrayList<Product> arrData;
    Context context;
    CallBackEvents mListener;

    public ProductAdapter(ArrayList<Product> arrData, Context context) {
        this.arrData = arrData;
        this.context = context;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.product_layout_item,viewGroup,false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder productViewHolder, int i) {
        Product product=arrData.get(i);
        productViewHolder.txtPrice.setText(""+product.getBasePrice());
        productViewHolder.txtName.setText(product.getName());
        Picasso.get().load(product.getImage()).error(android.R.drawable.ic_menu_report_image).into(productViewHolder.imgProduct);
    }

    @Override
    public int getItemCount() {
        return arrData.size();
    }

    public class ProductViewHolder extends RecyclerView.ViewHolder{
        ImageView imgProduct;
        TextView txtName,txtPrice;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProduct=itemView.findViewById(R.id.img_product);
            txtName=itemView.findViewById(R.id.txt_product_name);
            txtPrice=itemView.findViewById(R.id.txt_product_price);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onClickItem(getPosition());
                }
            });
        }
    }
    void setOnClickItemRV(CallBackEvents mListener){
        this.mListener=mListener;
    }

    interface CallBackEvents{
        void onClickItem(int pos);
    }
}
