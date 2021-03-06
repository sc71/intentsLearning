package com.example.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {

    public static final String EXTRA_SENT_MESSAGE = "themessage";
    private Button buttonSend, buttonShare;
    private EditText edittextSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        wireWidgets();
    }

    private void wireWidgets() {
        buttonSend = findViewById(R.id.button_sendmessage_send);
        edittextSend = findViewById(R.id.edittext_sendmessage_msg);
        buttonShare = findViewById(R.id.button_sendmessage_share);
    }

    public void share(View view){
        Intent intentShare = new Intent(Intent.ACTION_SEND);
        intentShare.setType("text/plain");
        intentShare.putExtra(EXTRA_SENT_MESSAGE, edittextSend.getText().toString());
        startActivity(intentShare);
    }
    public void sendMessage(View view) {
        String message = edittextSend.getText().toString();
        Intent intent = new Intent(SendMessageActivity.this, ReceiveMessageActivity.class);
        intent.putExtra(EXTRA_SENT_MESSAGE, message);
        startActivity(intent);
    }
}
