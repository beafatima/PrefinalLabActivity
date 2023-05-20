package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {
    EditText edittext1, edittext2;
    Button btn1, btn2;
    String string1,string2,string3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string1 = edittext1.getText().toString();
                string2 = edittext2.getText().toString();
                edittext1.setText(string2);
                edittext2.setText(string1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(edittext1 == edittext2){
                    string3 = "SAME";
                }else{
                    string3 = "NOT THE SAME";
                }

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("result", string3);
                startActivity(intent);
            }
        });
    }
}