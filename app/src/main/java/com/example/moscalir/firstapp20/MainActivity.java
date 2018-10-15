package com.example.moscalir.firstapp20;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="VehicleActivity";
    private EditText editTextMake;
    private EditText editTextYear;

    public void onButtonClick(View view) {
        editTextMake = (EditText) findViewById(R.id.inputMake);
        editTextYear = (EditText) findViewById(R.id.inputYear);
        String make = editTextMake.getText().toString();
        String strYear = editTextYear.getText().toString();
        Vehicle vehicle;
        if(strYear.matches("")) {
            vehicle =new Vehicle(make);
        }
        else{
            int intYear =Integer.parseInt(strYear);
            vehicle =new Vehicle(make, intYear);
        }
        Toast.makeText(getApplicationContext(), vehicle.getMessage(), Toast.LENGTH_SHORT).show();
        Log.d(TAG, "User clicked "+Vehicle.counter +" times.");
        Log.d(TAG, "User message is \""+vehicle +"\".");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
