/*
 * Copyright (c) 2016.  This code are Copyrighted by Mugabo Gustave
 */

package com.supadilo.toolbar;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class Profile extends AppCompatActivity {
    private Toolbar toolbar ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CollapsingToolbarLayout collapsingToolbarLayout  = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbarlayout);
        collapsingToolbarLayout.setTitle("Articles");





    }

//    toolbar = (Toolbar) findViewById(R.id.toolbar);
//    toolbar.inflate
//
////    toolbar.inflateMenu(R.menu.menu);
////    toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
////        @Override
////        public boolean onMenuItemClick(MenuItem item) {
////
////
////            String msg = "";
////
////            switch (item.getItemId()) {
////
////
//////                    case R.id.discard:
//////                        msg = "Delete";
//////                        break;
//////
//////                    case R.id.search:
//////                        msg = "Search";
//////                        break;
////                case R.id.signin:
////
////                    //Intent intent = new Intent(this, Signin.class);
////
////                    Intent intent = new Intent(Profile.this, Signin.class);
////                    startActivity(intent);
//////                        msg = "Edit";
////                    break;
////
////                case R.id.profile:
////                    //msg = "Settings";
////
////                    Intent intent2 = new Intent(MainActivity.this, Profile.class);
////                    startActivity(intent2);
////                    break;
////
////            }
////
////            Toast.makeText(MainActivity.this, msg + "clicked", Toast.LENGTH_SHORT)
////
////                    .show();
////            return true;
////        }
////    });

}
