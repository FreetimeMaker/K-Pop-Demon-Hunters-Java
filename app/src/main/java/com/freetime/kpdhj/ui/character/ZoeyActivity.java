package com.freetime.kpdhj.ui.character;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.freetime.kpdhj.MainActivity;
import com.freetime.kpdhj.R;
import com.freetime.kpdhj.ui.music.ZoeyMusicActivity;

public class ZoeyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoey);

        // Immersive fullscreen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        );

        Button zoeyMusicButton = findViewById(R.id.zoeyMusicButton);
        zoeyMusicButton.setOnClickListener(v -> {
            Intent intent = new Intent(ZoeyActivity.this, ZoeyMusicActivity.class);
            startActivity(intent);
        });

        Button zoeyBackToCharactersButton = findViewById(R.id.zoeyBackToCharactersButton);
        zoeyBackToCharactersButton.setOnClickListener(v -> {
            Intent intent = new Intent(ZoeyActivity.this, MainActivity.class);
            startActivity(intent);
        });
    }
}
