package com.example.app.opengldemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import com.example.app.opengldemo.TutorialPart1.TutorialPart1;
import com.example.app.opengldemo.TutorialPart2.TutorialPart2;
import com.example.app.opengldemo.TutorialPart3.TutorialPart3;
import com.example.app.opengldemo.TutorialPart4.TutorialPart4;
import com.example.app.opengldemo.TutorialPart5.TutorialPart5;

public class MainActivity extends AppCompatActivity {
    private Button tutorialButton1;
    private Button tutorialButton2;
    private Button tutorialButton3;
    private Button tutorialButton4;
    private Button tutorialButton5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        initWidget();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void initWidget() {
        tutorialButton1 = (Button) findViewById(R.id.opengl_demo_tutorial1);
        tutorialButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TutorialPart1.class);
                startActivity(intent);
            }
        });

        tutorialButton2 = (Button) findViewById(R.id.opengl_demo_tutorial2);
        tutorialButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TutorialPart2.class);
                startActivity(intent);
            }
        });

        tutorialButton3 = (Button) findViewById(R.id.opengl_demo_tutorial3);
        tutorialButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TutorialPart3.class);
                startActivity(intent);
            }
        });

        tutorialButton4 = (Button) findViewById(R.id.opengl_demo_tutorial4);
        tutorialButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TutorialPart4.class);
                startActivity(intent);
            }
        });

        tutorialButton5 = (Button) findViewById(R.id.opengl_demo_tutorial5);
        tutorialButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TutorialPart5.class);
                startActivity(intent);
            }
        });
    }
}
