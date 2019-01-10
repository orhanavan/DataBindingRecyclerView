package com.peanutbutterapps.databindingrecyclerview;

import android.databinding.BindingAdapter;
import android.view.View;

import com.squareup.picasso.Picasso;

import de.hdodenhof.circleimageview.CircleImageView;

public class User {

    public String name, email, imageId;

    public User(String name, String email, String imageId) {
        this.name = name;
        this.email = email;
        this.imageId = imageId;
    }

    @BindingAdapter("android:imageUrl")
    public static void loadImage(View view, String url) {
        CircleImageView circleImageView = (CircleImageView) view;
        Picasso.get().load(url).into(circleImageView);
    }
}
