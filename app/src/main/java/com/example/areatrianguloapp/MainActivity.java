package com.example.areatrianguloapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText editText1;
    private EditText editText2;
    private Button buttoncalcular;
    private TextView resultado;
    private Area area;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //referências
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        Button buttoncalcular = findViewById(R.id.buttoncalcular);
        resultado = findViewById(R.id.resultado);

        //Criar um evento do botão calcular
        buttoncalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                area = new Area(Double.parseDouble(editText1.getText().toString()), Double.parseDouble(editText2.getText().toString()));

                resultado.setText("Resultado" + area.calcular());
            }
        });
    }
}