package com.example.android.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void printToLogs(View view) {
        // Find first menu item TextView and print the text to the logs
        TextView menuItemOne = (TextView) findViewById(R.id.menu_item_1);
        String itemOneData = menuItemOne.getText().toString();
        Log.v("MainActivity", itemOneData);

        // Find second menu item TextView and print the text to the logs
        TextView menuItemTwo = (TextView) findViewById(R.id.menu_item_2);
        String itemTwoData = menuItemTwo.getText().toString();
        Log.v("MainActivity", itemTwoData);

        // Find third menu item TextView and print the text to the logs
        TextView menuItemThree = (TextView) findViewById(R.id.menu_item_3);
        String itemThreeData = menuItemThree.getText().toString();
        Log.v("MainActivity", itemThreeData);
    }
}