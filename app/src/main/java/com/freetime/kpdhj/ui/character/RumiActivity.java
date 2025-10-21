package com.freetime.kpdhj.ui.character;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.freetime.kpdhj.R;

public class RumiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rumi);

        // Immersive fullscreen
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);

        Button rumiInfoButton = findViewById(R.id.rumiBackToCharactersButton);
        rumiInfoButton.setOnClickListener(v -> {
            Intent intent = new Intent(RumiActivity.this, CharactersFragment.class);
            startActivity(intent);
        });
    }
}
