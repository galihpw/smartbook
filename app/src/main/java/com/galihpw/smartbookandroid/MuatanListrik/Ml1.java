package com.galihpw.smartbookandroid.MuatanListrik;

import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.galihpw.smartbookandroid.R;

/**
 * Created by Sutrisna Aji on 19/11/2017.
 */

public class Ml1 extends Fragment implements View.OnClickListener {
    public static final String EXTRA_POSITION = "EXTRA_POSITION";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ml1, container, false);

        TextView textml12 = (TextView) rootView.findViewById(R.id.textml12);
        TextView textml13 = (TextView) rootView.findViewById(R.id.textml13);
        TextView textml14 = (TextView) rootView.findViewById(R.id.textml14);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textml12.setText(Html.fromHtml(getString(R.string.textml12), Html.FROM_HTML_MODE_COMPACT));
            textml13.setText(Html.fromHtml(getString(R.string.textml13), Html.FROM_HTML_MODE_COMPACT));
            textml14.setText(Html.fromHtml(getString(R.string.textml14), Html.FROM_HTML_MODE_COMPACT));
        }else{
            textml12.setText(Html.fromHtml(getString(R.string.textml12)));
            textml13.setText(Html.fromHtml(getString(R.string.textml13)));
            textml14.setText(Html.fromHtml(getString(R.string.textml14)));
        }
        return rootView; //return the slide view
    }
    @Override
    public void onClick(View view) {

    }
}
