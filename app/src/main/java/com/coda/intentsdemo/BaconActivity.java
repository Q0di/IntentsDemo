package com.coda.intentsdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;


public class BaconActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);
    }


    public void baconClick(View view) {
        final EditText baconET = (EditText) findViewById(R.id.baconET);

        Intent baconIntent = new Intent(this, PancakeActivity.class);

        String msg = baconET.getText().toString();

        //this transfers data
        baconIntent.putExtra("msg", msg);

        startActivity(baconIntent);
    }
}
