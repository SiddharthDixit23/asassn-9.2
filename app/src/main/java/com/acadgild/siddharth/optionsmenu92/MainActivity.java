package com.acadgild.siddharth.optionsmenu92;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mtv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtv = (TextView)findViewById(R.id.textView);
        getSupportActionBar();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater men = getMenuInflater();
        men.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int menuid = item.getItemId();
        if(menuid == R.id.audio)
        {
            mtv.setText("Audio Mode");
            Toast.makeText(getApplicationContext(),"Audio Mode",Toast.LENGTH_SHORT).show();
        }
        else if(menuid == R.id.video)
        {
            mtv.setText("Video Mode");
            Toast.makeText(getApplicationContext(),"Video Mode",Toast.LENGTH_SHORT).show();
        }
        else if(menuid == R.id.camera)
        {
            mtv.setText("Camera Mode");
            Toast.makeText(getApplicationContext(),"Camera Mode",Toast.LENGTH_SHORT).show();
        }
        else if(menuid == R.id.comp)
        {
            mtv.setText("Computer Mode");
            Toast.makeText(getApplicationContext(),"Computer Mode",Toast.LENGTH_SHORT).show();
        }
        else if(menuid == R.id.game)
        {
            mtv.setText("Game Mode");
            Toast.makeText(getApplicationContext(),"Game Mode",Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }
}
