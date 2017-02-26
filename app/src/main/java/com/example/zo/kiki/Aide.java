package com.example.zo.kiki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Aide extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_aide);
        Button jy_retourne = (Button)findViewById(R.id.jy_retourne);
        jy_retourne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Aide.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
