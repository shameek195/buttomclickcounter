package com.shameekm.buttomclickcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText userInput;
    private Button button;
    private TextView textView;
    private int numTimes=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userInput=(EditText) findViewById(R.id.editText);
        button=(Button) findViewById(R.id.button);
        textView=(TextView) findViewById(R.id.textview);
        View.OnClickListener ouronclicklistener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numTimes=numTimes+1;
                String result="\nthe button got tapped"+numTimes+"time";
                textView.append(result);
            }
        };
        button.setOnClickListener(ouronclicklistener);
    }
}

