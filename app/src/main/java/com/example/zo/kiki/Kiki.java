package com.example.zo.kiki;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Kiki extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ecran_kiki);
        Button ca_me_deplait = (Button)findViewById(R.id.ca_me_deplait);
        ca_me_deplait.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("Kiki", "Tant pis pour toi.");
            }
        });
    }

}
