package com.example.factsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText a,e,c,d;
    String s,t,u,w,y,z;
    Button button,getButton;
    double b,fact=1,g,h,i,pi;
    TextView o,j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.editText);
        e=findViewById(R.id.editText6);
        c=findViewById(R.id.editText7);
        d=findViewById(R.id.editText8);
        button=findViewById(R.id.button);
        getButton=findViewById(R.id.button2);
        o=findViewById(R.id.textView);
        j=findViewById(R.id.textView2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                s = a.getText().toString().trim();
                if (s.equals("")||s.length()>9) {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                }

                else {
                    try {
                        b = Double.parseDouble(s);

                        fact = 1;
                        for (int i = 1; i <= b; i++) {
                            fact = fact * i;
                        }

                        y = String.valueOf(fact);


                        Toast.makeText(MainActivity.this, "Factorial is :" + y, Toast.LENGTH_SHORT).show();
                        o.setText(y);
                    }
                    catch (NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }



                }
            }
        });

        getButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t = e.getText().toString().trim();
                u = c.getText().toString().trim();
                w = d.getText().toString().trim();

                //  g= Integer.parseInt(t);
                // h= Integer.parseInt(u);
                //i= Integer.parseInt(w);

                if (t.equals("")||u.equals("")||w.equals("")) {
                    Toast.makeText(MainActivity.this, "No Input", Toast.LENGTH_SHORT).show();
                } else {
                    try {
                        g = Double.parseDouble(t);
                        h = Double.parseDouble(u);
                        i = Double.parseDouble(w);
                        pi = (g * h * i) / 100;

                        z = String.valueOf(pi);

                        Toast.makeText(MainActivity.this, "Principal Intrest is " + z, Toast.LENGTH_SHORT).show();
                        j.setText(z);
                    }
                    catch (NumberFormatException e)
                    {
                        Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}
