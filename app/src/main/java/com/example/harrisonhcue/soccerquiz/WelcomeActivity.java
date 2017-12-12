package com.example.harrisonhcue.soccerquiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class WelcomeActivity extends Activity {

    //Declaration of mode button
    Button btnMode;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //Set current view to welcome page
        setContentView(R.layout.welcome_page);


        btnMode=findViewById(R.id.btnMode);
        btnStart=findViewById(R.id.btnStart);

        initListeners();


    }
    public void showModes()
    {
        Toast.makeText(getApplicationContext()," 1.To be implemented to enable user switch mode with button\n" +
                " 2Display a popup on screen",Toast.LENGTH_LONG).show();

    }
    public void initListeners()
    {
        btnMode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showModes();
            }
        });

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent navigate=new Intent(getApplicationContext(),SelectionActivity.class);
                startActivity(navigate);


            }
        });
    }
}
