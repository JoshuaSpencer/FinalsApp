package com.example.a614002.finalsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static java.net.Proxy.Type.HTTP;

public class Secondary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
    }

    public void emailBugs(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        //Below adds to the email to me
        emailIntent.setType("text/plain");
        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"joshua.spencer010203@gmail.com"}); // recipients
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "I found a bug Josh!!");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Problem:");

        startActivity(emailIntent);
    }
}