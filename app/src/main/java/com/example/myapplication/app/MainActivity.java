package com.example.myapplication.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    Button btn1, btn2, btn3;
    TextView msgView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.msgBtn1);
        btn2 = (Button)findViewById(R.id.msgBtn2);
        btn3 = (Button)findViewById(R.id.msgBtn3);
        msgView = (TextView)findViewById(R.id.messageView);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                msgView.setText("Hello ... I'm here.\n");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                msgView.setText("The world is waiting for my exploration.\n");           }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
                msgView.setText("Bye bye, I miss you.\n");
            }
        });
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
