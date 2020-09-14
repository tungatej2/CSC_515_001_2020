package com.example.android.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String buttonText = intent.getStringExtra(SecondActivity.EXTRA_ITEM);
        TextView textView = findViewById(R.id.textView1);
        textView.setText(buttonText);
    }

    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "Add Item Clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}