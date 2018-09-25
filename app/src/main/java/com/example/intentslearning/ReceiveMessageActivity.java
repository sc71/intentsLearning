package com.example.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static com.example.intentslearning.SendMessageActivity.EXTRA_SENT_MESSAGE;

public class ReceiveMessageActivity extends AppCompatActivity {

    private TextView textviewDisplayMsg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        textviewDisplayMsg = findViewById(R.id.textview_receivemessage_displaymsg);
        textviewDisplayMsg.setText(getIntent().getStringExtra(EXTRA_SENT_MESSAGE));
    }

}
