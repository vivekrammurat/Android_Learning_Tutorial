package app.admin.com.bob_tom;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class Tutorial3 extends AppCompatActivity {

    private Button btn1_R,btn2_G,btn3_B,ex1;
    private RadioButton rb1,rb2,rb3;
    private TextView setColor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial3);

        btn1_R=findViewById(R.id.btn_Red);
        btn2_G=findViewById(R.id.btn_Green);
        btn3_B=findViewById(R.id.btn_Blue);
        ex1 = findViewById(R.id.ex1);

        rb1 = findViewById(R.id.rbRed);
        rb2 = findViewById(R.id.rbGreen);
        rb3 = findViewById(R.id.rbBlue);

        setColor = findViewById(R.id.tv_colorDisplay);

        btn1_R.setOnClickListener(new ColorSetter(Color.RED,this));
        btn2_G.setOnClickListener(new  ColorSetter(Color.GREEN,this));
        btn3_B.setOnClickListener(new ColorSetter(Color.BLUE,this));
        rb1.setOnClickListener(new ColorSetter(Color.RED,this));
        rb2.setOnClickListener(new ColorSetter(Color.GREEN,this));
        rb3.setOnClickListener(new ColorSetter(Color.BLUE,this));

        ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent("app.admin.com.bob_tom.EXAMPLE1"));
            }
        });

    }

     class ColorSetter implements View.OnClickListener {
        private int index;
        private Tutorial3 tutorial3;
        public ColorSetter(int index, Tutorial3 tutorial3) {//this is Constructor
             this.index = index;
             this.tutorial3 = tutorial3;
        }

         @Override
         public void onClick(View v) {
             setColorTo(index);
         }
     }

    private void setColorTo(int index) {
        setColor.setBackgroundColor(index);

    }
}
