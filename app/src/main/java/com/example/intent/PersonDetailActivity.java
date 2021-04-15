package com.example.intent;

import android.os.Bundle;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class PersonDetailActivity extends AppCompatActivity {

    TextView nameAndAge, email, city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_detail);

        nameAndAge = findViewById(R.id.name_and_age);
        email = findViewById(R.id.email);
        city = findViewById(R.id.city);

        Person user = getIntent().getParcelableExtra("user");
        nameAndAge.setText(user.getName() + ", " + user.getAge());
        email.setText(user.getEmail());
        city.setText(user.getCity());
    }
}