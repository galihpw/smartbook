package com.galihpw.smartbookandroid.MuatanListrik;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.ToxicBakery.viewpager.transforms.RotateDownTransformer;
import com.galihpw.smartbookandroid.MenuActivity;
import com.galihpw.smartbookandroid.R;
import com.galihpw.smartbookandroid.SubMenuMateri;

public class MuatanListrik extends AppCompatActivity implements View.OnClickListener {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 10;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager mPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;
    private ImageButton left, right, home;

    private int selectedPage; // set selected page

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_muatan_listrik);
        left = (ImageButton) findViewById(R.id.btnLeft);
        right = (ImageButton) findViewById(R.id.btnRight);
        home = (ImageButton) findViewById(R.id.btnHome);

        left.setOnClickListener(this);
        right.setOnClickListener(this);
        home.setOnClickListener(this);

        left.setBackgroundResource(R.color.transparent);

        // Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.pager); //the UI pager
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setPageTransformer(true, new RotateDownTransformer()); //set the animation
        selectedPage = 0; //current page
        if(savedInstanceState != null){ //if app was paused, you can reopen the same page
            selectedPage = savedInstanceState.getInt("SELECTED_PAGE");
        }

        mPager.setCurrentItem(selectedPage); //set the current page

        mPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if(position==0){
                    left.setBackgroundResource(R.color.transparent);
                }else{
                    left.setBackgroundResource(R.drawable.left_select);
                }

                if(position==12){
                    right.setBackgroundResource(R.color.transparent);
                }else{
                    right.setBackgroundResource(R.drawable.right_select);
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLeft :
                mPager.setCurrentItem(mPager.getCurrentItem() - 1);
                break;
            case R.id.btnRight :
                mPager.setCurrentItem(mPager.getCurrentItem() + 1);
                break;
            case R.id.btnHome :
                Intent intent = new Intent(this, SubMenuMateri.class);
                this.startActivity(intent);
                this.finish();
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_righ);
        }

    }
    private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            final Bundle bundle = new Bundle();

            switch (position){
                case 0 :
                    final Ml1 fragment = new Ml1();
                    fragment.setArguments(bundle);
                    return fragment;
                case 1 :
                    final Ml2 fragment2 = new Ml2();
                    fragment2.setArguments(bundle);
                    return fragment2;
                case 2 :
                    final Ml3 fragment3 = new Ml3();
                    fragment3.setArguments(bundle);
                    return fragment3;
                case 3 :
                    final Ml4 fragment4 = new Ml4();
                    fragment4.setArguments(bundle);
                    return fragment4;
                case 4 :
                    final Ml5 fragment5 = new Ml5();
                    fragment5.setArguments(bundle);
                    return fragment5;
                case 5 :
                    final Ml6 fragment6 = new Ml6();
                    fragment6.setArguments(bundle);
                    return fragment6;
                case 6 :
                    final Ml7 fragment7 = new Ml7();
                    fragment7.setArguments(bundle);
                    return fragment7;
                case 7 :
                    final Ml8 fragment8 = new Ml8();
                    fragment8.setArguments(bundle);
                    return fragment8;
                case 8 :
                    final Ml9 fragment9 = new Ml9();
                    fragment9.setArguments(bundle);
                    return fragment9;
                default:
                    final Ml1 fragmentz = new Ml1();
                    fragmentz.setArguments(bundle);
                    return fragmentz;
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}
