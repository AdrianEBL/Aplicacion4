package edu.tecii.android.aplicacion4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText cajaTexto;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cajaTexto = (EditText)findViewById(R.id.editText);
        boton = (Button)findViewById(R.id.button);
    }

    public void changeActivity(View v){
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        String numero = cajaTexto.getText().toString();
        intent.putExtra("numero_telefonico", numero);
        long numeroInt = Long.parseLong(numero);
        intent.putExtra("numero_telefonico_int", numeroInt);
        startActivity(intent);
    }
}
