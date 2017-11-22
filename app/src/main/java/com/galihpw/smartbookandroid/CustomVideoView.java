package com.galihpw.smartbookandroid;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by drake on 6/19/2017.
 */

public class CustomVideoView extends android.widget.VideoView {

    private PlayPauseListener mListener;
    private int stopPosition;

    public CustomVideoView(Context context) {
        super(context);
    }

    public CustomVideoView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomVideoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public void setPlayPauseListener(PlayPauseListener listener) {
        mListener = listener;
    }

    @Override
    public void pause() {
        super.pause();
        if (mListener != null) {
            mListener.onPause();
        }
    }

    @Override
    public void start() {
        super.start();
        if (mListener != null) {
            mListener.onPlay();
        }
    }

    public static interface PlayPauseListener {
        void onPlay();
        void onPause();
    }

    public void setStopPosition(int stopPosition){
        this.stopPosition = stopPosition;
    }

    public int getStopPosition(){
        return stopPosition;
    }
}
