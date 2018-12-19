package com.example.daiphongpc.gd3.json.detail.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.daiphongpc.gd3.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageAdapter extends PagerAdapter {
    ArrayList<String> arrLinkImg;
    Animation animation;
    Context context;

    public ImageAdapter(ArrayList<String> arrLinkImg, Context context) {
        this.arrLinkImg = arrLinkImg;
        this.context = context;
    }

    @Override
    public int getCount() {
        return arrLinkImg.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view.equals(o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view=LayoutInflater.from(context).inflate(R.layout.item_detail_img,container,false);
        //
        ImageView imgDetail=view.findViewById(R.id.img_detail);
        TextView txtNumberPager=view.findViewById(R.id.txt_page_number);

        //
        String link=arrLinkImg.get(position);
        //
        Picasso.get().load(link).error(android.R.drawable.ic_menu_report_image).into(imgDetail);
        txtNumberPager.setText((position+1)+"/"+getCount());
        animation=AnimationUtils.loadAnimation(context,R.anim.alpha);

        txtNumberPager.startAnimation(animation);
        //
        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);

    }
}
