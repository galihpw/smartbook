package com.galihpw.smartbookandroid.LatihanPG;

import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.galihpw.smartbookandroid.R;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class TabSoal1 extends Fragment {

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int status = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab_soal1, container, false);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

        rG = (RadioGroup) rootView.findViewById(R.id.rG);

        rG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //pilih radio button yang ada di radio button group
                int selectedId = rG.getCheckedRadioButtonId();

                // mencari radio button
                rB = (RadioButton) rootView.findViewById(selectedId);

                // menandai bila telah diisi
                status += 1;
                if(status == 1){
                    Hasil.isi += 1;
                }

                // mengaktifkan tombol selesai
                if(Hasil.isi == 10){
                    bSelesai.setEnabled(true);
                }

                Hasil.jwb[0] = rB.getText().charAt(0);

                Toast.makeText(getActivity(), "Swipe ke kanan", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }
}
