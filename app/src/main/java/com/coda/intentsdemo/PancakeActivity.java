package com.coda.intentsdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;



public class PancakeActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pancake);


        Bundle data = getIntent().getExtras();
        if(data == null){

            return;
        }

        String msg = data.getString("msg");
        final TextView pancakeTV = (TextView) findViewById(R.id.pancakeTV);
        pancakeTV.setText(msg);
    }

    public void pancakeClick(View view) {

        Intent pancakeIntent = new Intent(this, BaconActivity.class);
        startActivity(pancakeIntent);

    }
}
