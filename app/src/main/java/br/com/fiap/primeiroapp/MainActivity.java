package br.com.fiap.primeiroapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private EditText campo1;
    private EditText campo2;
    private RatingBar classificador;
    private SeekBar   volume;
    private CheckBox  caixa;
    private Switch    interruptor;
    private ToggleButton lidaDesliga;
    private RadioGroup   grupoRadios;
    private Spinner      listaDeDados;
    private Button       botao;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo1 = findViewById(R.id.editText);
        campo2 = findViewById(R.id.editText2);
        classificador = findViewById(R.id.ratingBar);
        volume = findViewById(R.id.seekBar);
        caixa = findViewById(R.id.checkBox);
        interruptor = findViewById(R.id.switch1);
        lidaDesliga = findViewById(R.id.toggleButton);
        grupoRadios = findViewById(R.id.radioGroup);
        listaDeDados = findViewById(R.id.spinner);
        botao = findViewById(R.id.button2);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,
                        "Primeira mensagem",
                         Toast.LENGTH_SHORT).show();
            }
        });
    }
}
