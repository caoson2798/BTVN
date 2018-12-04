package com.example.daiphongpc.gd3.Recyclerview.contact;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.daiphongpc.gd3.R;

import java.util.ArrayList;

public class GoProContactAdapter extends RecyclerView.Adapter<GoProContactAdapter.ContactViewHodler> {
    Context context;
    ArrayList<GoProContact> arrData;
    CallBackEvents mListener;

    public GoProContactAdapter(Context context, ArrayList<GoProContact> arrData) {
        this.context = context;
        this.arrData = arrData;
    }

    @NonNull
    @Override
    public ContactViewHodler onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=LayoutInflater.from(context).inflate(R.layout.item_contact_gopro,viewGroup,false);
        return new ContactViewHodler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHodler contactViewHodler, int i) {
        final GoProContact contact=arrData.get(i);

        contactViewHodler.txtName.setText(contact.getName());
        contactViewHodler.txtPrefix.setText(contact.getName().charAt(0)+"");

    }

    @Override
    public int getItemCount() {
        return arrData.size();
    }

    class ContactViewHodler extends RecyclerView.ViewHolder{
        TextView txtPrefix,txtName;

        public ContactViewHodler(@NonNull View itemView) {
            super(itemView);
            txtPrefix=itemView.findViewById(R.id.txt_prefix);
            txtName=itemView.findViewById(R.id.txt_name);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mListener.onClick(getPosition());
                }
            });

        }
    }
    void setOnClickItemRCV(CallBackEvents events){
       this.mListener=events;
    }
    interface CallBackEvents{
        void onClick(int i);
    }

}
