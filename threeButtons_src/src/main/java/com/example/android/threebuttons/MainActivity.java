package com.example.android.threebuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity1(View view) {
        Log.d(LOG_TAG, "Button 1 clicked");
        TextView textView = findViewById(R.id.firstTextView);
        String testText = textView.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle b = new Bundle();
        b.putString("key", testText);
        intent.putExtras(b);
        startActivity(intent);

    }

    public void launchSecondActivity2(View view) {
        Log.d(LOG_TAG, "Button 2 clicked");
        TextView textView = findViewById(R.id.secondTextView);
        String testText = textView.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle b = new Bundle();
        b.putString("key", testText);
        intent.putExtras(b);
        startActivity(intent);
    }

    public void launchSecondActivity3(View view) {
        Log.d(LOG_TAG, "Button 3 clicked");
        TextView textView = findViewById(R.id.thirdTextView);
        String testText = textView.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        Bundle b = new Bundle();
        b.putString("key", testText);
        intent.putExtras(b);
        startActivity(intent);
    }
}