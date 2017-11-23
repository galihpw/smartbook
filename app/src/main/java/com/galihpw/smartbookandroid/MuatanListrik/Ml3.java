package com.galihpw.smartbookandroid.MuatanListrik;

import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;

import com.galihpw.smartbookandroid.R;

/**
 * Created by Sutrisna Aji on 19/11/2017.
 */

public class Ml3 extends Fragment implements OnClickListener {
    public static final String EXTRA_POSITION = "EXTRA_POSITION";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ml3, container, false);
        TextView textml32 = (TextView) rootView.findViewById(R.id.textml32);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textml32.setText(Html.fromHtml(getString(R.string.textml32), Html.FROM_HTML_MODE_COMPACT));
        }else{
            textml32.setText(Html.fromHtml(getString(R.string.textml32)));
        }

        return rootView; //return the slide view
    }
    @Override
    public void onClick(View view) {

    }
}
