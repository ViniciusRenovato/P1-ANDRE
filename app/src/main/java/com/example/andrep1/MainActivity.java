package com.example.andrep1;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calculadora(View view){
        Intent it = new Intent(this, MainActivity2.class);
        startActivityForResult(it, 100, null);
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100) {
            if (resultCode == RESULT_OK) {
                atualiza();
                Toast.makeText(this, "Conta Realizada", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Conta Finalizada", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void atualiza() {
    }
}