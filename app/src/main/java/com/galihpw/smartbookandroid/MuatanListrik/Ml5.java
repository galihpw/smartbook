package com.galihpw.smartbookandroid.MuatanListrik;

import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.galihpw.smartbookandroid.R;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

/**
 * Created by Sutrisna Aji on 21/11/2017.
 */

public class Ml5 extends Fragment {
    public static final String EXTRA_POSITION = "EXTRA_POSITION";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ml5, container, false);
        final ImageView play = (ImageView) rootView.findViewById(R.id.play);

        final GifImageView gif = (GifImageView) rootView.findViewById(R.id.ml5gif1);
        gif.setImageResource(R.drawable.img2);
        final GifDrawable gifDrawable = (GifDrawable) gif.getDrawable();
        gifDrawable.stop();
        gif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(gifDrawable.isPlaying()){
                    gifDrawable.stop();
                    play.setVisibility(View.VISIBLE);
                }else{
                    gifDrawable.start();
                    play.setVisibility(View.GONE);
                }
            }
        });
        return rootView; //return the slide view
    }
}
