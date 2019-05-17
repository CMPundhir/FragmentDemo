package com.cmpundhir.cm.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener{
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        txt = findViewById(R.id.txt);
    }

    @Override
    public void onFragmentInteraction(View view) {
        int id = view.getId();
        switch (id){
            case R.id.frag1Txt :
                txt.setText("Fragment 1 text clicked");
                break;
            case R.id.frag2Txt :
                txt.setText("Fragment 2 text clicked");
                break;
            case R.id.frag3Txt :
                txt.setText("Fragment 3 text clicked");
                break;
        }
    }
}
