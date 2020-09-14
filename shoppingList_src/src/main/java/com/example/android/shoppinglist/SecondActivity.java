package com.example.android.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_ITEM = "com.example.android.shoppinglist.extra.ITEM";
    private Button itemButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void launchMainActivity1(View view) {
        itemButton = (Button) findViewById(R.id.button1);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity2(View view) {
        itemButton = (Button) findViewById(R.id.button2);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity3(View view) {
        itemButton = (Button) findViewById(R.id.button3);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity4(View view) {
        itemButton = (Button) findViewById(R.id.button4);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity5(View view) {
        itemButton = (Button) findViewById(R.id.button5);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity6(View view) {
        itemButton = (Button) findViewById(R.id.button6);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity7(View view) {
        itemButton = (Button) findViewById(R.id.button7);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity8(View view) {
        itemButton = (Button) findViewById(R.id.button8);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity9(View view) {
        itemButton = (Button) findViewById(R.id.button9);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
    public void launchMainActivity10(View view) {
        itemButton = (Button) findViewById(R.id.button10);
        String buttonText = itemButton.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_ITEM, buttonText);
        startActivity(intent);
    }
}