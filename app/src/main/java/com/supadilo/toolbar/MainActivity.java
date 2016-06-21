package com.supadilo.toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private CoordinatorLayout coordinatorLayout;
    Toolbar toolbar;
    TextView  mTxvMenuItem;
    DrawerLayout mDrawerLayout;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

// Standalone Toolbar
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Places");

        mTxvMenuItem = (TextView) findViewById(R.id.txv_menuItem);
        mDrawerLayout= (DrawerLayout) findViewById(R.id.navigation_drawer);

        navigationView = (NavigationView)findViewById(R.id.main_drawer);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this,mDrawerLayout,toolbar,R.string.drawer_open,R.string.drawer_close);

        mDrawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();




        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener(){

            @Override
            public  void onClick(View v){

                Toast.makeText(MainActivity.this,"FAB Clicked",Toast.LENGTH_SHORT).show();
            }


        });


//        setSupportActionBar(toolbar);
//        getSupportActionBar().setTitle("Places");


//   // Compatibiltiy by Java code
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            toolbar.setElevation(12f);
//        }

//   @Override
//           public boolean onCreateOptionsMenu(Menu menu)
//        {
//            get
//
//        }

        toolbar.inflateMenu(R.menu.menu);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {


                String msg = "";

                switch (item.getItemId()) {


//                    case R.id.discard:
//                        msg = "Delete";
//                        break;
//
//                    case R.id.search:
//                        msg = "Search";
//                        break;
                    case R.id.signin:

                        //Intent intent = new Intent(this, Signin.class);

                        Intent intent = new Intent(MainActivity.this, Signin.class);
                        startActivity(intent);
//                        msg = "Edit";
                        break;

                    case R.id.profile:
                        //msg = "Settings";

                        Intent intent2 = new Intent(MainActivity.this, Profile.class);
                        startActivity(intent2);
                        break;

                }

                Toast.makeText(MainActivity.this, msg + "clicked", Toast.LENGTH_SHORT)

                        .show();
                return true;
            }
        });

                                               }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//
//        String msg = "";
//
//        switch (item.getItemId()) {
//
//
//            case R.id.discard:
//                msg = "Delete";
//                break;
//
//            case R.id.search:
//                msg = "Search";
//                break;
//            case R.id.edit:
//                msg = "Edit";
//                break;
//
//            case R.id.settings:
//                msg = "Settings";
//                break;
//            case R.id.exit:
//                msg = "Exit";
//                break;
//        }
//
//        Toast.makeText(this,msg + "clicked",Toast.LENGTH_SHORT)
//                .show();
//        return super.onOptionsItemSelected(item);
//    }

      public void showSimpleSnackBar(View view){

         Snackbar snackbar= Snackbar.make(coordinatorLayout,"Snackbar clicked",Snackbar.LENGTH_SHORT);

          snackbar.setAction("RETRY", new View.OnClickListener() {
              @Override
              public void onClick(View v) {
               Snackbar.make(coordinatorLayout,"Snackbar clicked for the second time",Snackbar.LENGTH_SHORT).show();


              }
          });
          // Snackbar background color customization
//          View snackBarLayout =  snackbar.getView();
//          snackBarLayout.setBackgroundColor(Color.BLUE);
//
//          // Snack bar Message text color
//
//          TextView txvMessage = (TextView) snackBarLayout.findViewById(android.support.design.R.id.snackbar_text);
//          txvMessage.setTextColor(Color.RED);
//
//          //Changing Action Button Text color -Method 1
//
//          snackbar.setActionTextColor(Color.GREEN);

          snackbar.show();
      }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        String itenName = (String)  item.getTitle();
        mTxvMenuItem.setText(itenName);

        hideDrawer();


        return true;
    }

    //open the Drawer

    private void showDrawer(){

        mDrawerLayout.openDrawer(GravityCompat.START);
    }

    // Close the Drawer
    private void hideDrawer(){
        mDrawerLayout.closeDrawer(GravityCompat.START);
    }

    @Override
    public void onBackPressed(){

        if(mDrawerLayout.isDrawerOpen(GravityCompat.START))
            hideDrawer();
        else
            super.onBackPressed();
    }
}
