package com.danielbarrosdeoliveiradev.sorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }

  public void sortearNumero(View view){
    TextView sortear = findViewById(R.id.sorteio);
    int numero = new Random().nextInt(11);
    sortear.setText("Número gerado foi: " + numero);
  }
}
