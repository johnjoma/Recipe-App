package com.example.tester;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainCourseFragment4 extends AppCompatActivity {


    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course_fragment4);



        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        mTabLayout = findViewById(R.id.tabLayout);
        mViewPager = findViewById(R.id.viewPager);




        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            Toolbar mToolbar = findViewById(R.id.toolbar);
            mToolbar.setTitle(getString(R.string.MainCourseRecipeTitle4));
            mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);


            mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intBreak = new Intent(MainCourseFragment4.this,MainCourse.class);
                    startActivity(intBreak);
                }
            });


        }

        setupViewpager(mViewPager);

        mTabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewpager(ViewPager viewPager){

        viewPagerAdapter adapter = new viewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new MainCourseIngredients4(),"Ingredients");
        adapter.addFragment(new MainCourseProcedure4(),"Procedure");
        adapter.addFragment(new MainCourseCredit4(),"credit");


        viewPager.setAdapter(adapter);


    }
    class viewPagerAdapter extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private  final  List<String> mFragmentTitleList = new ArrayList<>();





        public viewPagerAdapter(FragmentManager fm ){

            super(fm);



        }

        @Override
        public Fragment getItem(int i) {
            return mFragmentList.get(i);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        public void addFragment (Fragment fragment, String title){

            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);


        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


}
