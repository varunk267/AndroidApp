package com.example.imageviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img1;
    private Button btn1;
    private int count = 0;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        img1 = (ImageView) findViewById(R.id.img1);
        text1 = (TextView) findViewById(R.id.text1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if(count==1){
                    img1.setImageResource(R.drawable.tiger);
                    text1.setText("Tiger");

                }else if(count==2){
                    img1.setImageResource(R.drawable.lion);
                    text1.setText("Lion");
                }else if(count>2){
//                    Toast.makeText(getApplicationContext(),"You have reached the end of the images", Toast.LENGTH_LONG).show();
                    img1.setVisibility(View.GONE);
                    btn1.setVisibility(View.GONE);
                    text1.setText("You have reached at the end of the images!!");

                }
            }
        });

    }
}