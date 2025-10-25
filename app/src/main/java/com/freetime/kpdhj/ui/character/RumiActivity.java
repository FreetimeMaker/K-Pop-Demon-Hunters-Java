package com.freetime.kpdhj.ui.character;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.freetime.kpdhj.R;
import com.freetime.kpdhj.ui.music.RumiMusicActivity;

public class RumiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumi);

        // Immersive fullscreen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        );

        Button rumiMusicButton = findViewById(R.id.rumiMusicButton);
        rumiMusicButton.setOnClickListener(v -> {
            Intent intent = new Intent(RumiActivity.this, RumiMusicActivity.class);
            startActivity(intent);
        });

        Button rumiInfoButton = findViewById(R.id.rumiBackToCharactersButton);
        rumiInfoButton.setOnClickListener(v -> {
            Intent intent = new Intent(RumiActivity.this, CharactersFragment.class);
            startActivity(intent);
        });
    }
}
