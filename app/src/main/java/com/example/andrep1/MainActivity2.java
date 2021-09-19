package com.example.andrep1;

import android.animation.FloatArrayEvaluator;
import android.os.Bundle;
import android.telephony.mbms.StreamingServiceInfo;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.andrep1.domain.MainActivity;
import com.example.andrep1.crud.Lista;
import com.example.andrep1.domain.Salvar;

public class MainActivity2 extends AppCompatActivity {
    Salvar salvar;
    private TextView tela;
    String Num1="";
    String Num2="";
    String Numero="";
    Float resultado;
    Integer tipo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tela = findViewById(R.id.painel);
        tela.setText("");
    }
    public void acao(View view){
        if (Num1.equals("")){
            Button b =(Button) view;
            Num1 = (String) b.getText();
            tela.setText(tela.getText()+Num1);
            Num1 = tela.getText().toString();
        }
        else{
            Button b = (Button) view;
            Num2 = (String) b.getText();
            tela.setText(tela.getText()+Num2);
            Num2 = tela.getText().toString();
        }
    }
    public void adicao(View view){
        tela.setText(tela.getText()+" + ");
        Num1= Numero;
        Numero= "";
        tipo=1;
        //tela.setText(Num1+"+");
    }
    public void subtracao(View view){
        tela.setText(tela.getText()+" - ");
        Num1= Numero;
        Numero= "";
        tipo=2;

    }
    public void multiplicacao(View view){
        tela.setText(tela.getText()+" * ");
        Num1= Numero;
        Numero= "";
        tipo=3;

    }
    public void divisao(View view){
        tela.setText(tela.getText()+" / ");
        Num1= Numero;
        Numero= "";
        tipo=4;

    }
    public void ac(View view){
        Num1="";
        Num2="";
        Numero="";
        tipo=0;
        tela.setText("");
    }
    public void igual(View view){
        switch (tipo){
            case 1:
                Num2 = Numero;
                resultado = Float.parseFloat(Num1) + Float.parseFloat(Num2);
                tela.setText(resultado.toString());
                break;
            case 2:
                Num2 = Numero;
                resultado = Float.parseFloat(Num1) - Float.parseFloat(Num2);
                tela.setText(resultado.toString());
                break;
            case 3:
                Num2 = Numero;
                resultado = Float.parseFloat(Num1) * Float.parseFloat(Num2);
                tela.setText(resultado.toString());
                break;
            case 4:
                Num2 = Numero;
                resultado = Float.parseFloat(Num1) / Float.parseFloat(Num2);
                tela.setText(resultado.toString());
                break;
        }
    }
    salvar.setValoresGuardados(resultado.toString());
    Lista.save(salvar);
    setResult(RESULT_OK);


}