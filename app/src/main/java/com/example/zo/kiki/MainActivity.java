package com.example.zo.kiki;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_accueil);
        Button btn_cest_parti = (Button)findViewById(R.id.cest_Parti);
        btn_cest_parti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Kiki", "C'est kiki !");
                Intent intent = new Intent (MainActivity.this, Kiki.class);
                startActivity(intent);
            }
        });
    }
}
