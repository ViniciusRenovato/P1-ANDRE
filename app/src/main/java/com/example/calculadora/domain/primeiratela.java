package com.example.calculadora.domain;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.calculadora.R;

import androidx.appcompat.app.AppCompatActivity;


public class primeiratela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
    }
    String Num1=null;
    String Num2=null;
    String Numero;
    Integer result;
    public void acao(View view){
        Numero= null;
        Button b= (Button)view;
        Numero=(String) b.getText();
    }

    public void mais(View view){
        if (Num1==null){
            Num1=Numero
        }
        else

    }

    public void resulado(View view){

    }

}


