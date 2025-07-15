package com.skycoming.aidedlearningvbnet.Activities;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.navigation.NavigationView;
import com.skycoming.aidedlearningvbnet.Adapters.PagerAdapter;
import com.skycoming.aidedlearningvbnet.R;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    private DrawerLayout mdrawerLayout;
    private ActionBarDrawerToggle mToggle;

    ViewPager viewPager;

    static int viewPagerCurrentPosition = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mdrawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //fragment_dash = new fragment_dashboard();
        //fragmentEvent = new fragment_event();
        viewPager =  findViewById(R.id.viewPager);
        //viewPager.setPageTransformer(new ZoomOutPageTransformer());

        mToggle = new ActionBarDrawerToggle(this, mdrawerLayout, R.string.open,R.string.close);
        mdrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        loadPager();

    }


    private void loadPager(){
        try {
            viewPager.setAdapter( new PagerAdapter(getSupportFragmentManager()));
            viewPager.setOffscreenPageLimit(5);

            viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
                @Override
                public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                }

                @Override
                public void onPageSelected(int position) {
                    //Toast.makeText(MainActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                    viewPagerCurrentPosition = position;

                }

                @Override
                public void onPageScrollStateChanged(int state) {

                }
            });

        } catch (Exception e) {
            e.printStackTrace();

        }
    }



    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        /*        switch (item.getItemId())
        {
            case R.id.home:


                break;

            case R.id.overView:


                break;

            case R.id.environmentSetup:

                break;

            case R.id.setting:

                break;

            case R.id.activities:

                break;

            case R.id.logout:

                break;


        }*/
        if(item.getItemId() == R.id.home){
            viewPager.setCurrentItem(0,true);
        } else if (item.getItemId() == R.id.overView){
            viewPager.setCurrentItem(1,true);
        } else if (item.getItemId() == R.id.environmentSetup){
            viewPager.setCurrentItem(2,true);

        }else if (item.getItemId() == R.id.basicSyntax){
            viewPager.setCurrentItem(3,true);
        }else if (item.getItemId() == R.id.dataTypes){
            viewPager.setCurrentItem(4,true);
        }else if (item.getItemId() == R.id.variableTypes){
            viewPager.setCurrentItem(5,true);
        }


        else if (item.getItemId() == R.id.modifiertypes){
            viewPager.setCurrentItem(6,true);
        }
        else if (item.getItemId() == R.id.statementss){
            viewPager.setCurrentItem(7,true);
        }
        else if (item.getItemId() == R.id.basicOperators){
            viewPager.setCurrentItem(8,true);
        }
        else if (item.getItemId() == R.id.decisionMaking){
            viewPager.setCurrentItem(9,true);
        }
        else if (item.getItemId() == R.id.loopControl){
            viewPager.setCurrentItem(10,true);
        }
        else if (item.getItemId() == R.id.string){
            viewPager.setCurrentItem(11,true);
        }
        else if (item.getItemId() == R.id.arrays){
            viewPager.setCurrentItem(12,true);
        }


        else if (item.getItemId() == R.id.functionF){
            viewPager.setCurrentItem(13,true);
        }
        else if (item.getItemId() == R.id.objectClass){
            viewPager.setCurrentItem(14,true);
        }
        else if (item.getItemId() == R.id.basicControl){
            viewPager.setCurrentItem(15,true);
        }
        else if (item.getItemId() == R.id.dialogBoxes){
            viewPager.setCurrentItem(16,true);
        }
        else if (item.getItemId() == R.id.eventHandling){
            viewPager.setCurrentItem(17,true);
        }

        mdrawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}