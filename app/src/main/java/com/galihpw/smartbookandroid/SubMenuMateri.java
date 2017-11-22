package com.galihpw.smartbookandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookandroid.Materi.MuatanListrik.MuatanListrik;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SubMenuMateri extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.muatanListrikImage)
    ImageView imageMuatan;

    @BindView(R.id.muatanListrik)
    RelativeLayout muatanListrik;

    @BindView(R.id.hukumCoulombImage)
    ImageView imageCoulomb;

    @BindView(R.id.hukumCoulomb)
    RelativeLayout hukumCoulomb;

    @BindView(R.id.medanListrikImage)
    ImageView imageMedan;

    @BindView(R.id.medanListrik)
    RelativeLayout medanListrik;

    @BindView(R.id.energiPdanPSImage)
    ImageView imageEnergi;

    @BindView(R.id.energiPdanPS)
    RelativeLayout energiPdanPS;

    @BindView(R.id.kapasitorImage)
    ImageView imageKapasitor;

    @BindView(R.id.kapasitor)
    RelativeLayout kapasitor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub_menu_materi);
        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Glide.with(this).load(R.drawable.latihan_soal).into(imageMuatan);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageCoulomb);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageMedan);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageEnergi);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageKapasitor);
        muatanListrik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubMenuMateri.this,MuatanListrik.class);
                startActivity(intent);
            }
        });
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}
