package com.vinilaureto.cadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText nameEditText;
    private EditText phoneEditText;
    private EditText emailEditText;
    private CheckBox emailListCheckBox;
    private RadioButton mascRadioButton;
    private RadioButton femRadioButton;
    private EditText cityEditText;
    private Spinner stateSpinner;
    private Button clearButton;
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEt);
        phoneEditText = findViewById(R.id.phoneEt);
        emailEditText = findViewById(R.id.emailEt);
        emailListCheckBox = findViewById(R.id.emailListCb);
        mascRadioButton = findViewById(R.id.mascRb);
        femRadioButton = findViewById(R.id.femRb);
        cityEditText = findViewById(R.id.cityEt);
        stateSpinner = findViewById(R.id.stateSp);

        clearButton = findViewById(R.id.clearBt);
        clearButton.setOnClickListener(this);

        saveButton = findViewById(R.id.saveBt);
        saveButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.clearBt) {
            nameEditText.getText().clear();
            phoneEditText.getText().clear();
            emailEditText.getText().clear();
            emailListCheckBox.setChecked(false);
            mascRadioButton.setChecked(true);
            femRadioButton.setChecked(false);
            cityEditText.getText().clear();
            stateSpinner.setSelection(0);
        } else if (view.getId() == R.id.saveBt) {
            Formulario formulario = new Formulario(
                    nameEditText.getText().toString(),
                    phoneEditText.getText().toString(),
                    emailEditText.getText().toString(),
                    emailListCheckBox.isChecked(),
                    mascRadioButton.isChecked() ? SexoValue.MASCULINO : SexoValue.FEMENINO,
                    cityEditText.getText().toString(),
                    ((TextView) stateSpinner.getSelectedView()).getText().toString()
            );

            Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();

        }
    }
}