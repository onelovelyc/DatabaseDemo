package com.jason.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button;

    private MydatabaseHelp mydatabaseHelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        mydatabaseHelp = new MydatabaseHelp(this, "bookstore", null, 1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mydatabaseHelp.getWritableDatabase();
            }
        });

    }
}
