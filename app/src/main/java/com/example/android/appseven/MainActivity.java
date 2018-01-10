package com.example.android.appseven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView txtResult = (TextView) findViewById(R.id.txtResult);

        Button btnLoop = (Button) findViewById(R.id.btnLoop);


        btnLoop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i=0; i<=10; i++){

                    txtResult.setText(i + "");

                int i = 0;
                while (i <= 10){
                    txtResult.setText(i + "");
                    i++;

                }
            }
        });
    }
}
