package com.example.android_user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        private EditText etName;
        private Button butt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView()
    {
        etName=findViewById(R.id.etName);
        butt =findViewById(R.id.butt);
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello " + etName.getText().toString(), Toast.LENGTH_SHORT).show();
            }

        });
    }
}
