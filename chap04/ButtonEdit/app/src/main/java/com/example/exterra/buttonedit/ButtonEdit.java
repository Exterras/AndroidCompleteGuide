package com.example.exterra.buttonedit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Exterra on 2016-11-26.
 */
public class ButtonEdit extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_edit);

        Button btn = (Button) findViewById(R.id.btn);
        btn.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText edit = (EditText) findViewById(R.id.edit);
                String str = edit.getText().toString();
                Toast.makeText(ButtonEdit.this, str, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
