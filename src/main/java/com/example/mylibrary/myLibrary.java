package com.example.mylibrary;

import android.content.Context;
import android.widget.Toast;



public class myLibrary {
    public void showMe(int counter, Context context){
        Toast.makeText(context, "the button has been clicked : "+counter+" times", Toast.LENGTH_SHORT).show();
    }
    public String test(String test){
     return test;
    }

}
