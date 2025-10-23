package com.freetime.kpdhj.ui.music;

import android.os.Bundle;
import android.view.View;
import com.freetime.kpdhj.R;

import androidx.appcompat.app.AppCompatActivity;

public class RumiMusicActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumi_music);

        // Immersive fullscreen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        );

        Button FreeInfoButton = findViewById(R.id.FreeInfoButton);
        FreeInfoButton.setOnClickListener(v -> 
                startActivity(FreeActivity.getIntent(RumiMusicActivity.this))
        );
    }
}
