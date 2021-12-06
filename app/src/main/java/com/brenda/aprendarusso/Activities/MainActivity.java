package com.brenda.aprendarusso.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.brenda.aprendarusso.Fragments.AlimentosFragment;
import com.brenda.aprendarusso.Fragments.CoresFragment;
import com.brenda.aprendarusso.Fragments.NaturezaFragment;
import com.brenda.aprendarusso.Fragments.NumerosFragment;
import com.brenda.aprendarusso.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class MainActivity extends AppCompatActivity {
    private SmartTabLayout smartTabLayout;
    private ViewPager viewPager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ////////////////////// TABS //////////////////////////////
        View frameLayout= findViewById(R.id.frameFront);
        frameLayout.bringToFront();

        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("Numeros", NumerosFragment.class)
                .add("Natureza", NaturezaFragment.class)
                .add("Cores", CoresFragment.class)
                .add("Alimentos", AlimentosFragment.class)

                .create());

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(2);

        SmartTabLayout viewPagerTab = (SmartTabLayout) findViewById(R.id.smartTabLayout);
        viewPagerTab.setViewPager(viewPager);



    }




}


