package com.campusiq.cereb_eplanning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText eusername,epassword;
    Button btnlogin;
    TextView txtpass,txtregister;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eusername=findViewById(R.id.editText);
        epassword=findViewById(R.id.editText2);
        btnlogin=findViewById(R.id.button);
        txtpass=findViewById(R.id.textView);
        txtregister=findViewById(R.id.textView2);


        btnlogin.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                  intent=new Intent(MainActivity.this,AdminActivity.class);
                  startActivity(intent);
            }
        });


        txtpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });



        txtregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                intent=new Intent(MainActivity.this,SignupActivity.class);
                startActivity(intent);
            }
        });



    }
}
