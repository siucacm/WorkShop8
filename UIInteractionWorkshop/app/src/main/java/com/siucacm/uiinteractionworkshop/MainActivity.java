package com.siucacm.uiinteractionworkshop;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button greenButton, redButton, blueButton, setTextButton;
    private EditText nameTextField, emailTextField;
    private TextView nameText, emailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        greenButton = (Button) findViewById(R.id.buttonGreen);
        redButton = (Button) findViewById(R.id.buttonRed);
        blueButton = (Button) findViewById(R.id.buttonBlue);
        setTextButton = (Button) findViewById(R.id.setText);

        nameTextField = (EditText) findViewById(R.id.nameEditText);
        emailTextField = (EditText) findViewById(R.id.emailEditText);

        nameText = (TextView) findViewById(R.id.nameTextView);
        emailText = (TextView) findViewById(R.id.emailTextView);


        setTextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameText.setText(nameTextField.getText());
                emailText.setText(emailTextField.getText());
            }
        });

        greenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!nameText.equals("") && !emailText.equals("")){
                    nameText.setTextColor(Color.GREEN);
                    emailText.setTextColor(Color.GREEN);
                }
            }
        });
    }
}
