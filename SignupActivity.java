package com.campusiq.cereb_eplanning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignupActivity extends AppCompatActivity {

    EditText et_username,et_password,et_email;
    Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        et_username=findViewById(R.id.editText3);
        et_password=findViewById(R.id.editText4);
        et_email=findViewById(R.id.editText5);


    }
}
