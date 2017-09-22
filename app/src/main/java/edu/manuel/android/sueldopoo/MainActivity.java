package edu.manuel.android.sueldopoo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     EditText val, nom;
     Button btnCal;
     TextView res, nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val = (EditText) findViewById(R.id.editHoras);
        nom = (EditText) findViewById(R.id.editNombre);
        btnCal =(Button) findViewById(R.id.btnCalculo);
        res=(TextView) findViewById(R.id.txtResult);
        nombre=(TextView) findViewById(R.id.textnombre);

        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (val.getText().toString().isEmpty()) {
                    val.setError("Ingrese un numero entero");
                } else {
                    empleado cal = new empleado();
                    cal.setHoras(Integer.parseInt(val.getText().toString().trim()));
                    cal.setNombre(nom.getText().toString());
                    res.setText("El sueldo es: " + cal.calculoSueldo());
                    nombre.setText("El nombre es: " + cal.getNombre());
                }
            }
        });
    }
}
