package com.example.android1l3hw;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.android1l3hw.databinding.ActivityEditBinding;

public class EditActivity extends AppCompatActivity {
    private ActivityEditBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding = ActivityEditBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        initialisation();
        listeners();
    }

    private void initialisation() {
        Intent intent = getIntent();
        String tvFromMain = intent.getStringExtra("123");
        //binding.etEdit.setHint(tvFromMain);
        binding.etEdit.setText(tvFromMain);
    }

    private void listeners() {
        binding.btnSendToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String editText= binding.etEdit.getText().toString().trim();
                Intent intent = new Intent(EditActivity.this, MainActivity.class);
                intent.putExtra("sendToMain",editText);
                startActivity(intent);
            }
        });
    }
}