package mx.edu.tesoem.isc.P37S2120222HMRM;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txtnum1,txtnum2;
    Button btnsuma;
    Button btnrestar;
    Button btnmultiplicar;
    Button btndivision;

    TextView lblresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);

        lblresult = findViewById(R.id.lblresult);

        btnsuma = findViewById(R.id.btnsuma);

        btnsuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(lblresult.getText().toString()+String.valueOf (num1+num2));

            }
        });

        btnrestar = findViewById(R.id.btnrestar);

        btnrestar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(lblresult.getText().toString()+String.valueOf (num1-num2));
            }
        });

        btnmultiplicar = findViewById(R.id.btnmultiplicar);

        btnmultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(lblresult.getText().toString()+String.valueOf (num1*num2));
            }
        });

        btndivision = findViewById(R.id.btndivision);

        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());

                lblresult.setText(lblresult.getText().toString()+String.valueOf (num1/num2));
            }
        });

    }
}