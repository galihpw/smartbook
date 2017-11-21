package com.galihpw.smartbookandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.kompetensiDasarImage)
    ImageView imageDasar;

    @BindView(R.id.kompetensiDasar)
    RelativeLayout kompetensiDasar;

    @BindView(R.id.petaKonsepImage)
    ImageView imageKonsep;

    @BindView(R.id.petaKonsep)
    RelativeLayout petaKonsep;

    @BindView(R.id.materiListrikStatisImage)
    ImageView imageMateri;

    @BindView(R.id.materiListrikStatis)
    RelativeLayout materiListrikStatis;

    @BindView(R.id.latihanSoalImage)
    ImageView imageSoal;

    @BindView(R.id.latihanSoal)
    RelativeLayout latihanSoal;

    @BindView(R.id.tentangImage)
    ImageView imageTentang;

    @BindView(R.id.tentang)
    RelativeLayout tentang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        Glide.with(this).load(R.drawable.latihan_soal).into(imageDasar);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageKonsep);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageMateri);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageSoal);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageTentang);

        latihanSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,LatihanPGActivity.class);
                startActivity(intent);
            }
        });

        materiListrikStatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,SubMenuMateri.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        return true;
    }

    /*public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            Intent i = new Intent(this, ListReagen.class);
            startActivity(i);
            finish();
        }
        return false;
    }*/

}
