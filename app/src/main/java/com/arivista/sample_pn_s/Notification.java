package com.arivista.sample_pn_s;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class Notification extends AppCompatActivity {
    TextView titleView;
    TextView messageView;

    String title;
    String message;

    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);

        linearLayout=(LinearLayout)findViewById(R.id.linearLayout);
        titleView = (TextView) findViewById(R.id.title);
        messageView = (TextView) findViewById(R.id.message);

        final Intent intent = getIntent();
        title = intent.getStringExtra("title");
        message = intent.getStringExtra("message");

        titleView.setText(title);
        messageView.setText(message);


    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        title = intent.getStringExtra("title");
        message = intent.getStringExtra("message");

        titleView.setText("Refreshed Notification: \n"+title);
        messageView.setText(message);

        titleView.setText(title);
        messageView.setText(message);

    }
}
