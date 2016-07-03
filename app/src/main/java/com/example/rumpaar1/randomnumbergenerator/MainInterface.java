package com.example.rumpaar1.randomnumbergenerator;

import android.app.AlertDialog;
import android.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;

import java.util.Random;

public class MainInterface extends AppCompatActivity {
    private final Random randomGen = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);
    }

    public void submit(View view) {
        try {
            EditText minEditor = (EditText) findViewById(R.id.minNumEditor);
            EditText maxEditor = (EditText) findViewById(R.id.maxNumEditor);
            final int min = Integer.parseInt(minEditor.getText().toString());
            final int max = Integer.parseInt(maxEditor.getText().toString());
            final int actualMin = Math.min(min, max);
            final int actualMax = Math.max(min, max);
            final int random = randomGen.nextInt(actualMax - actualMin + 1) + actualMin;
            DialogFragment dialog = new NumberDisplayDialog();
            Bundle numberBundle = new Bundle();
            numberBundle.putInt("number", random);
            dialog.setArguments(numberBundle);
            dialog.show(getFragmentManager(), "dialog");
        } catch (Exception e) {
            DialogFragment error = new ErrorDialog();
            error.show(getFragmentManager(), "error_dialog");
        }
    }
}
