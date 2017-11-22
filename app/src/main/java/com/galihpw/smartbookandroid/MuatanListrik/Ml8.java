package com.galihpw.smartbookandroid.MuatanListrik;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.MediaController;

import com.galihpw.smartbookandroid.CustomVideoView;
import com.galihpw.smartbookandroid.R;

/**
 * Created by Sutrisna Aji on 21/11/2017.
 */

public class Ml8 extends Fragment implements View.OnTouchListener{
    public static final String EXTRA_POSITION = "EXTRA_POSITION";
    CustomVideoView videoView1;
    ImageView play;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ml8, container, false);
        videoView1 = (CustomVideoView) rootView.findViewById(R.id.ml8vv1);

        play = (ImageView) rootView.findViewById(R.id.play);

        MediaController mediaController = new MediaController(getActivity());
        videoView1.setVideoURI(Uri.parse("android.resource://" +  getActivity().getPackageName() + "/" + R.raw.hidro11));
        mediaController.setAnchorView(videoView1);
        videoView1.setMediaController(mediaController);

        videoView1.setOnTouchListener(this);
        videoView1.setPlayPauseListener(new CustomVideoView.PlayPauseListener() {
            @Override
            public void onPlay() {
                play.setVisibility(View.GONE);
            }

            @Override
            public void onPause() {
                play.setVisibility(View.VISIBLE);
                videoView1.setStopPosition(videoView1.getCurrentPosition()+1);
            }
        });

        videoView1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                play.setVisibility(View.VISIBLE);
                videoView1.seekTo(0);
            }
        });

        return rootView; //return the slide view
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()){
            case R.id.ml2vv1:
                if(!videoView1.isPlaying() && videoView1.getCurrentPosition() == 0){
                    videoView1.start();
                }else if(!videoView1.isPlaying()){
                    videoView1.seekTo(videoView1.getStopPosition());
                    videoView1.start();
                }
                break;
        }

        return false;
    }
}
