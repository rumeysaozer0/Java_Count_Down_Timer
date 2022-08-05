package com.rumeysaozer.javacountdowntimer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;

import com.rumeysaozer.javacountdowntimer.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        new CountDownTimer(10000,1000){

            @Override
            public void onTick(long l) {
            binding.textView.setText("Left: "+ l/1000);
            }

            @Override
            public void onFinish() {
            binding.textView.setText("Finished!");
            }
        }.start();
    }
}