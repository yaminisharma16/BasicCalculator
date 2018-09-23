package com.aptron.basiccal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity1 extends AppCompatActivity implements View.OnClickListener {

    EditText et1,et2;
    TextView tv;
    Button sub,mul,div,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        et1 = findViewById(R.id.val1);
        et2 = findViewById(R.id.val2);
        tv = findViewById(R.id.res);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        reset = findViewById(R.id.reset);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String val1 = et1.getText().toString();
                String val2 = et2.getText().toString();
                int x =Integer.parseInt(val1);
                int y = Integer.parseInt(val2);

                int z = x-y;
                tv.setText("Sum : "+z);
            }
        });

        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        reset.setOnClickListener(this);
    }

    public void add(View view) {
        String val1 = et1.getText().toString();
        String val2 = et2.getText().toString();
        int x =Integer.parseInt(val1);
        int y = Integer.parseInt(val2);

        int z = x+y;
        tv.setText("Sum : "+z);
    }

    @Override
    public void onClick(View v) {
        String val1 = et1.getText().toString();
        String val2 = et2.getText().toString();
        int x =Integer.parseInt(val1);
        int y = Integer.parseInt(val2);
        int res;
        switch (v.getId())
        {
            case R.id.mul:
                res = x*y;
                tv.setText(""+res);
                break;
            case R.id.div:
                res = x/y;
                tv.setText(""+res);
                break;
            case R.id.reset:
                et1.setText("");
                et2.setText("");
                et1.setFocusable(true);
                break;




        }

    }
}