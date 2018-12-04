package com.example.onlinestoreapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ClientMenu extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_client_menu);

        Button order_button = findViewById(R.id.make_order);
        Button history_button = findViewById(R.id.order_history);
        Button start_music = findViewById(R.id.start_music);

        final Intent orderIntent = new Intent(this, OrderActivity.class);
        final Intent historyIntent = new Intent(this, HistoryActivity.class);

        order_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(orderIntent);
            }
        });
        history_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(historyIntent);
            }
        });
        start_music.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(ClientMenu.this, MusicService.class));
            }
        });
    }
}
