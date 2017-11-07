package edu.tecii.android.aplicacion4;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    long numero_telefonico;
    String numero;
    TextView textView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView = (TextView)findViewById(R.id.textView);
        btn = (Button)findViewById(R.id.button2);
        numero = getIntent().getExtras().getString("numero_telefonico");
        numero_telefonico = getIntent().getExtras().getInt("numero_telefonico_int");
        textView.setText(numero);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callNumber();
            }
        });
    }

    public void callNumber(){
        String numeroFormato = "tel:" + numero;
        //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(numeroFormato));
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse(numeroFormato));
        startActivity(intent);
    }
}
