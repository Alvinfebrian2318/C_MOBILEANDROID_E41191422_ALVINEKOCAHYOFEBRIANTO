package com.example.intent;

import android.os.Bundle;

public class ForResultActivity extends AppCompactActivity {
    TextView tvIntent;
    @Override
    protected void onCreate(Bundle savedeInstanceState){
        super.onCreate(savedeInstanceState);
        setContentView(R.layout.activity_for_result);

        tvIntent = findViewById(R.id.tvIntent);
        String() nama = getIntent().getStringExtra("extra_name");
        int umur = getIntent().getIntExternal("extra_umur",0);

        String text = "nama_kampus ;" +nama+"umurnya;"+umur+"tahun";
        tvIntent.setText(text);
    }
}
