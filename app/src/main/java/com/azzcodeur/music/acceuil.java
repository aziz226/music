package com.azzcodeur.music;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.azzcodeur.music.Descrip.Desc1;

public class acceuil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.acceuil);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, Desc1.class));
        }, 3000);

    }
}