package com.campusiq.cereb_eplanning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    EditText et_name,et_designation,et_username,et_password,et_email,et_confpass;
    Button btnRegister,btncancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        et_name=findViewById(R.id.editText10);
        et_designation=findViewById(R.id.editText3);
        et_username=findViewById(R.id.editText5);
        et_password=findViewById(R.id.editText11);
        et_confpass=findViewById(R.id.editText12);
        et_email=findViewById(R.id.editText4);
        btnRegister=findViewById(R.id.buttonReg);
        btncancel=findViewById(R.id.buttonCan);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(SignupActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Registration Succesfully", Toast.LENGTH_SHORT).show();

            }
        });

        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent intent=new Intent(SignupActivity.this,MainActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Registration Canceled", Toast.LENGTH_SHORT).show();
            }
        });



    }
}
