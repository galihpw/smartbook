package com.galihpw.smartbookandroid.Materi.MuatanListrik;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galihpw.smartbookandroid.R;

/**
 * Created by Sutrisna Aji on 22/11/2017.
 */

public class Ml7 extends Fragment {
    public static final String EXTRA_POSITION = "EXTRA_POSITION";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ml7, container, false);

        return rootView; //return the slide view
    }
}