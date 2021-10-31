package com.example.tareacdmp12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtNombre, txtApellido, txtEdad, txtCorreo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre=(EditText) findViewById(R.id.txtname);
        txtApellido=(EditText) findViewById(R.id.txtLast);
        txtEdad=(EditText) findViewById(R.id.txtAge);
        txtCorreo=(EditText) findViewById(R.id.txtEmail);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);




        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String resultado;
                resultado = "Se envió los datos de la persona:\n "+txtNombre.getText()+" "+txtApellido.getText()+" \n Con la edad de " +txtEdad.getText()+ " años y su correo es:  "+txtCorreo.getText();
                Intent intent = new Intent(getApplicationContext(), ActivityMostrar.class);
                intent.putExtra("rst", resultado.toString());
                startActivity(intent);
            }
        });
    }


}