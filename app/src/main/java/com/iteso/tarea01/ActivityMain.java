package com.iteso.tarea01;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

import com.iteso.tarea01.beans.Alumno;

public class ActivityMain extends AppCompatActivity{

    EditText nombre;
    EditText telefono;
    Spinner escolaridad;
    RadioGroup genero ;
    AutoCompleteTextView libro;
    CheckBox deporte;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (EditText)findViewById(R.id.nombre);
        telefono = (EditText)findViewById(R.id.telefono);
        escolaridad = (Spinner)findViewById(R.id.spinner);
        genero = (RadioGroup)findViewById(R.id.radioGroup);
        libro = (AutoCompleteTextView)findViewById(R.id.arrayLibros);
        deporte = (CheckBox)findViewById(R.id.deporte);
        libro.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_dropdown_item_1line,
                getResources().getStringArray(R.array.array_ibros)));
        Button limpiar = (Button)findViewById(R.id.limpiar);
        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombre.setText("");
                telefono.setText("");
                genero.clearCheck();
                libro.setText("");
                deporte.setChecked(false);
                escolaridad.setSelection(0);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.activity_main_save:

                //String nombre, String telefono, String escolaridad, String genero, String libro, boolean deporte) {
                Alumno alumno = new Alumno(nombre.getText().toString(),
                        telefono.getText().toString(),
                        escolaridad.getSelectedItem().toString(),
                        genero.isClickable()?"Femenino" : "Masculino",
                        libro.getText().toString(),
                        deporte.isChecked());
                Toast.makeText(this, "Presionaste Guardar\n"+alumno.toString(), Toast.LENGTH_LONG).show();
                break;
        }
        return false;
    }

}
