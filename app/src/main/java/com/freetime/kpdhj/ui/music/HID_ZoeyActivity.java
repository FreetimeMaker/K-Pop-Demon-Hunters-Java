package com.freetime.kpdhj.ui.music;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.freetime.kpdhj.R;
import com.freetime.kpdhj.ui.character.ZoeyActivity;


public class HID_ZoeyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hid_zoey);

        // Immersive fullscreen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        );

        Button BackToZMAButton = findViewById(R.id.BackToZMAButton);
        BackToZMAButton.setOnClickListener(v -> {
            Intent intent = new Intent(HID_ZoeyActivity.this, ZoeyMusicActivity.class);
            startActivity(intent);
        });
    }
}