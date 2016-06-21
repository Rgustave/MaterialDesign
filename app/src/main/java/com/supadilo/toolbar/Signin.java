/*
 * Copyright (c) 2016.  This code are Copyrighted by Mugabo Gustave
 */

package com.supadilo.toolbar;

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Signin extends AppCompatActivity {

    private EditText etUsername, etPassword;

    // INITIALIZE TEXT INPUT LAYOUT

    private TextInputLayout iniputLayoutName, inputLayoutPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);


        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword =(EditText) findViewById(R.id.etUsername);

        iniputLayoutName = (TextInputLayout) findViewById(R.id.inputLayoutUsername);
        inputLayoutPassword = (TextInputLayout)findViewById(R.id.inputLayoutPassword);

    }

    public void validateAndlogin(View view){

        if(isvalidePassword()&& isValideUsername()){
        Toast.makeText(this,"Successfully login",Toast.LENGTH_SHORT).show();
        }

    }

     private boolean isvalidePassword(){

     String pwd= etPassword.getText().toString().trim();
         if(pwd.length()<8){

             inputLayoutPassword.setError("Minimum 8 Charactors");
             return false;
         }
         else{

             iniputLayoutName.setErrorEnabled(false);
             return true;
         }
     }

    private  boolean isValideUsername(){
        if(etUsername.getText().toString().isEmpty()){
            iniputLayoutName.setError("Username can not be blank");
            return false;
        }
        else{
            iniputLayoutName.setErrorEnabled(false);
            return true;
        }


    }
}
