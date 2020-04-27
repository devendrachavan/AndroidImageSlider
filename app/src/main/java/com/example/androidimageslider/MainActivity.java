package com.example.androidimageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageSlider imageSlider = findViewById(R.id.slider);

        List<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel("https://p.ecopetit.cat/wpic/lpic/26-263518_tumblr-photography-wallpaper-rocks-on-earth-background.jpg","1 Image"));
        slideModels.add(new SlideModel("https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg","2 Image"));
        slideModels.add(new SlideModel("https://live.staticflickr.com/7006/6621416427_8504865e6a_z.jpg","3 Image"));
        slideModels.add(new SlideModel("https://c4.wallpaperflare.com/wallpaper/662/618/496/natur-2560x1600-sceneries-wallpaper-preview.jpg","4 Image"));
        imageSlider.setImageList(slideModels,true);

    }
}
