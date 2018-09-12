package com.sdmga.iiuc.check_box;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private Button button1;
    private TextView textview1;
    private Button button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkbox1=(CheckBox) findViewById(R.id.checkbox1);
        checkbox2=(CheckBox) findViewById(R.id.checkbox2);
        button1=(Button)findViewById(R.id.button);
        textview1=(TextView) findViewById(R.id.textview);
        button2=(Button) findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                StringBuilder stringBuilder = new StringBuilder();

                if(checkbox1.isChecked()){
                    String value = checkbox1.getText().toString();
                    stringBuilder.append(value + " is checked" + "\n");
                    Log.v("checkbox1", "Hurry! Meat is working");
                }

                if(checkbox2.isChecked()){
                    String value = checkbox2.getText().toString();
                    stringBuilder.append(value + " is checked");
                    Log.v("checkbox2", "Hurry! Cheese is working");
                }
                textview1.setText(stringBuilder);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }

        });
    }
}
