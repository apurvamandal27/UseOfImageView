package com.example.apurva.useofimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button btn;
    int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView2);
        btn=findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                if (count==1){

                    img.setImageResource(R.mipmap.ic_launcher);
                }
                else if(count==2){
                    img.setImageResource(R.drawable.password);
                }
                else if (count==3){
                    img.setImageResource(R.drawable.username);
                    count=0;
                }

            }
        });
    }
}
