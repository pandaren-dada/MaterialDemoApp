package com.app.pandarendemoapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.app.pandarendemoapp.Fragment.FirstFragment;
import com.app.pandarendemoapp.Fragment.SecondFragment;
import com.app.pandarendemoapp.Fragment.ThirdFragment;

import static android.R.attr.drawable;
import static android.R.attr.id;
import static android.R.attr.toolbarStyle;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    Toolbar mToolbar;

    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;

    TabLayout mTabLayout;
    ViewPager mViewPager;
    ViewPageAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);

        mToolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        //back action
        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //nav drawer
        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView)findViewById(R.id.navigation_view);
        mNavigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar,
                R.string.oprn_drawer, R.string.close_drawer);
        mDrawerLayout.setDrawerListener(toggle);

        toggle.syncState();

        //for Tab
        mTabLayout = (TabLayout)findViewById(R.id.tab_bar);
        mViewPager = (ViewPager)findViewById(R.id.viewPager_id);
        mAdapter = new ViewPageAdapter(getSupportFragmentManager());

        mAdapter.addFragment(new FirstFragment(), "Tab1");
        mAdapter.addFragment(new SecondFragment(), "Tab2");
        mAdapter.addFragment(new ThirdFragment(), "Tab3");

        mViewPager.setAdapter(mAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
    // close drawer don't close application
    @Override
    public void onBackPressed() {

        if (mDrawerLayout.isDrawerOpen(GravityCompat.START)){

            mDrawerLayout.closeDrawer(GravityCompat.START);

        }else {

            super.onBackPressed();

        }
    }

    //Nav menu and option menu toolbar
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.inbox_id:

                Intent intent = new Intent(MainActivity.this, CollapsingToolbar.class);
                startActivity(intent);

                break;

            case R.id.starred_id:

                Toast.makeText(getApplicationContext(),"starred",Toast.LENGTH_LONG).show();

                break;

            case R.id.sent_id:

                Toast.makeText(getApplicationContext(),"sent mail",Toast.LENGTH_LONG).show();

                break;

            case R.id.drafts_id:

                Toast.makeText(getApplicationContext(),"drafts",Toast.LENGTH_LONG).show();

                break;

            case R.id.allmail_id:

                Toast.makeText(getApplicationContext(),"all mail",Toast.LENGTH_LONG).show();

                break;

            case R.id.trash_id:

                Toast.makeText(getApplicationContext(),"trash",Toast.LENGTH_LONG).show();

                break;

            case R.id.spam_id:

                Toast.makeText(getApplicationContext(),"spam",Toast.LENGTH_LONG).show();

                break;

        }
        //after press sub menu then drawer close
        mDrawerLayout.closeDrawer(GravityCompat.START);

        return true;

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

    if (id==R.id.search_id){

        Toast.makeText(getApplicationContext(),"search",Toast.LENGTH_SHORT).show();

    }

        return super.onOptionsItemSelected(item);
    }

}
